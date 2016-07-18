/**
 *
 * @author Victoria
 */
public class Schedule {
    
    private CollegeBuilding building;
    private boolean successful;

    public Schedule(CollegeBuilding building)
    {
        this.building = building;
        this.successful = successful;
    }
    
    public void scheduleEvent(Request req)
    {
/*        loop through classroom
             check if it has amenities, size, seats, (requirements)
             if yes
                  go thorugh list of events, if theres room, schedule, 
                  if not, check priority
                          
                  if no for both, don't add to both, can't schedule event. */
        successful = false;
        if(req.getDescription() < 4)
        {   
            if((req.getTime() < 5 || req.getTime() >= 21) || ((req.getTime() + req.getLength()) > 21))
            {
                System.out.println("The rooms are only available between 5am and 10pm.");
                successful = false;
            }
            else
            {   
                for(Classroom classroom : building.getClassrooms())
                {
                    if(classroom.getAmenities() == req.getAmenities() &&
                       classroom.getSize() == req.getSize() &&
                       classroom.getSeats() == req.getSeats())
                    {
                        successful = true;
                        for(Event e : classroom.getSchedule())
                        {
                            if(req.getTime() >= e.getStartTime() && req.getTime() <= e.getEndTime())
                            {
                                if(req.getDescription() < e.getPriority())
                                {
                                    classroom.removeEvent(e);
                                    successful = true;
                                    break;
                                }
                                else
                                {
                                    successful = false;
                                    break;
                                }
                            }
                        } 

                        if(successful) 
                        {
                            Event event;
                            if (req.getDescription() == 1)
                            {
                                event = new Lecture(req.getTime(), req.getLength());
                            }

                            else if(req.getDescription() == 2)
                            {
                                event = new Seminar(req.getTime(), req.getLength());
                            }

                            else if(req.getDescription() == 3)
                            {
                                event = new GuestSpeakers(req.getTime(), req.getLength());
                            }

                            else
                            {
                                event = new ClubMeetings(req.getTime(), req.getLength());
                            }

                            classroom.addEvent(event);
                            System.out.println(classroom.getRoomNumber() + " matches your need.");
                            break;
                        }

                    }
                    else
                    {
                        //System.out.println(classroom.getRoomNumber() + " does not match your needs.");
                        successful = false;
                    }

                }
            }
        }
        else
        {
            if(req.getTime() < 17 || req.getTime() > 21 || ((req.getTime() + req.getLength()) > 21))
            {
                System.out.println("Club meetings can only be scheduled after 5pm.");
            }
            else
            {   
                for(Classroom classroom : building.getClassrooms())
                {
                    if(classroom.getAmenities() == req.getAmenities() &&
                       classroom.getSize() == req.getSize() &&
                       classroom.getSeats() == req.getSeats())
                    {
                        successful = true;
                        for(Event e : classroom.getSchedule())
                        {
                            if(req.getTime() >= e.getStartTime() && req.getTime() <= e.getEndTime())
                            {
                                if(req.getDescription() < e.getPriority())
                                {
                                    classroom.removeEvent(e);
                                    successful = true;
                                    break;
                                }
                                else
                                {
                                    successful = false;
                                    break;
                                }
                            }
                        } 

                        if(successful) 
                        {
                            Event event;
                            if (req.getDescription() == 1)
                            {
                                event = new Lecture(req.getTime(), req.getLength());
                            }

                            else if(req.getDescription() == 2)
                            {
                                event = new Seminar(req.getTime(), req.getLength());
                            }

                            else if(req.getDescription() == 3)
                            {
                                event = new GuestSpeakers(req.getTime(), req.getLength());
                            }

                            else
                            {
                                event = new ClubMeetings(req.getTime(), req.getLength());
                            }

                            classroom.addEvent(event);
                            System.out.println(classroom.getRoomNumber() + " matches your need. ");
                            break;
                        }

                    }
                    else
                    {
                        //System.out.println(classroom.getRoomNumber() + " does not match your needs.");
                        successful = false;
                    }

                }
            }
        }
        if(successful == true)
        {
            System.out.println("Your event was successfully added to the schedule.\n");
        }
        else if(successful == false)
        {
            System.out.println("Your event was not successfully added to the schedule.\n");
        }
    }
    
    public void viewSchedule()
    {
        for(Classroom c : building.getClassrooms())
        {
            //System.out.println(room#, mmenities, size, seats, events);
            System.out.println("Room number: " + c.getRoomNumber());
            if(c.getAmenities() == true)
            {
                System.out.println("Has a Projector. ");
            }
            else
            {
                System.out.println("Does not have a projector.");
            }
            
            if(c.getSize() == 1)
            {
                System.out.println("This room holds 30 people room.");
            }
            else if(c.getSize() == 2)
            {
                System.out.println("This room holds 50 people room.");
            }
            else if(c.getSize() == 3)
            {
                System.out.println("This room holds 100 people room.");
            }
            else if(c.getSize() == 4)
            {
                System.out.println("This room holds 300 people room.");
            }
            else if(c.getSize() == 5)
            {
                System.out.println("This room holds 500 people room.");
            }
            
            if(c.getSeats() == true)
            {
                System.out.println("This room has comfortable seats.");
            }
            else
            {
                System.out.println("This room does not have comfortable seats.");
            }

            System.out.println("Schedule: \n" + c.getSchedule());
            System.out.println();
        } 
    }
}
