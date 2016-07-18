import java.util.ArrayList;

/**
 *
 * @author Victoria
 */
public class Classroom {
    
    private boolean amenities;
    private int size;
    private boolean seats;
    private ArrayList<Event> schedule;
    private int roomNumber;
    
    public Classroom(int roomNumber, boolean amenities, int size, boolean seats)
    {
        this.roomNumber = roomNumber;
        this.amenities = amenities;
        this.size = size;
        this.seats = seats;
        schedule = new ArrayList<>();
    }
    
    public int getRoomNumber()
    {
        return roomNumber;
    }
    
    public boolean getAmenities()
    {
        return amenities;
    }
    
    public int getSize()
    {
        return size;
    }
    
    public boolean getSeats()
    {
        return seats;
    }
    
    public void addEvent(Event e)
    {
        schedule.add(e);       
    }
    
    public void removeEvent(Event e)
    {
        schedule.remove(e);
    }
    
    public ArrayList<Event> getSchedule()
    {
        return schedule;
    }
}
