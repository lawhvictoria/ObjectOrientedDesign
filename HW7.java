import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class HW7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CollegeBuilding cb = new CollegeBuilding();
        //Classroom a = new Classroom(room number, amenities, size, seats);
        Classroom a = new Classroom(1, true, 1, true);
        Classroom b = new Classroom(2, true, 2, false);
        Classroom c = new Classroom(3, true, 3, true);
        Classroom d = new Classroom(4, true, 4, false);
        Classroom e = new Classroom(5, true, 5, true);
        Classroom f = new Classroom(6, false, 1, false);
        Classroom g = new Classroom(7, false, 2, true);
        Classroom h = new Classroom(8, false, 3, false);
        Classroom i = new Classroom(9, false, 4, true);
        Classroom j = new Classroom(10, false, 5, false);
        
        cb.addClassroom(a);
        cb.addClassroom(b);
        cb.addClassroom(c);
        cb.addClassroom(d);
        cb.addClassroom(e);
        cb.addClassroom(f);
        cb.addClassroom(g);
        cb.addClassroom(h);
        cb.addClassroom(i);
        cb.addClassroom(j);
        
        boolean amenities = false;
        boolean seats = false;
        
        Schedule s = new Schedule(cb);
        
//        Request r = new Request(description, time, length, amenities, size, seats);
        
        Request class1 = new Request(1, 7, 2, true, 1, true); //work
        Request class2 = new Request(1, 8, 1, true, 1, true); //doesn't work
        Request class3 = new Request(1, 4, 3, true, 2, false); //doesn't work
        Request class4 = new Request(1, 14, 2, true, 2, false); //work
        Request class5 = new Request(1, 20, 2, false, 5, false); //doesn't work
        
        Request seminar1 = new Request(2, 8, 3, true, 1, true); //doesn't work
        Request seminar2 = new Request(2, 17, 2, true, 5, true); //work
        
        Request guest = new Request(3, 14, 2, false, 4, true); //work
        
        Request club1 = new Request(4, 11, 1, false, 3, false); //doesn't work
        Request club2 = new Request(4, 17, 1, true, 4, false); //work
        Request club3 = new Request(4, 18, 1, true, 5, true); //doesn't work
        
        s.scheduleEvent(class1);
        s.scheduleEvent(class2);
        s.scheduleEvent(class3);
        s.scheduleEvent(class4);
        s.scheduleEvent(class5);
        
        s.scheduleEvent(seminar1);
        s.scheduleEvent(seminar2);
        
        s.scheduleEvent(guest);
        
        s.scheduleEvent(club1);
        s.scheduleEvent(club2);
        s.scheduleEvent(club3);
        
        while(true)
        {
            System.out.println("Choose an option below: \n"
                    + "1. Request a classroom \n"
                    + "2. View Schedule \n"
                    + "3. Quit \n");
            
            int choice = scan.nextInt();
            
            if(choice == 1)
            {
                System.out.println("Please choose one of the following options: \n"
                        + "1. Lecture \n"
                        + "2. Seminar \n"
                        + "3. Guest Speaker \n"
                        + "4. Club Meeting \n");
                int description = scan.nextInt();
                
                System.out.println("Enter the time you would like to schedule (i.e. 0 for 12AM, 6 for 6AM, 13 for 1PM");
                int time = scan.nextInt();
                
                if(time < 5 || time > 21)
                {
                    System.out.println("The rooms are only available between 5am and 10pm.");
                    break;
                }
                
                if(description == 4 && time < 17 && time > 21)
                {
                    System.out.println("Club meetings can only be scheduled after 5pm.");
                    break;
                }
                
                System.out.println("Please enter in a time length (ex. 1 for an hour, 2 for 2 hours and etc.");
                int length = scan.nextInt();
                
                System.out.println("Do you need a projector? (Y/N)");
                String amenitity = scan.next();
                if(amenitity.equalsIgnoreCase("Y"))
                {
                    amenities = true;
                }
                
                System.out.println("Please choose one of the following choice for the size of the classroom \n"
                        + "1. 30 people \n"
                        + "2. 50 people \n"
                        + "3. 100 people \n"
                        + "4. 300 people \n"
                        + "5. 500 people \n");
                int size = scan.nextInt();
                
                System.out.println("Would you like comfortable seats? (Y/N)");
                String seat = scan.next();
                if(seat.equalsIgnoreCase("Y"))
                {
                    seats = true;
                }
                
                if(description == 1)
                {
                    Lecture lecture = new Lecture(time, length);
                }
                
                if(description == 2)
                {
                    Seminar seminar = new Seminar(time, length);
                }
                
                if(description == 3)
                {
                    GuestSpeakers guestSpeaker = new GuestSpeakers(time, length);
                }
                
                if(description == 4)
                {
                    ClubMeetings clubMeeting = new ClubMeetings(time, length);
                }
                
                Request r = new Request(description, time, length, amenities, size, seats);
                s.scheduleEvent(r);
            }
            
            else if(choice == 2)
            {
                s.viewSchedule();                
            }

            else if(choice == 3)
            {
                break;
            }
        }

        
    }
    
}
