/**
 *
 * @author Victoria
 */
public class Request {
    
    private int description;
    private int time;
    private int length;
    private boolean amenities;
    private int size;
    private boolean seats;
    
    public Request(int description, int time, int length, boolean amenities, int size, boolean seats)
    {
        this.description = description;
        this.time = time;
        this.length = length;
        this.amenities = amenities;
        this.size = size;
        this.seats = seats;
    }
    
    public int getDescription()
    {
        return description;
    }
        
    public int getLength()
    {
        return length;
    }
    
    public int getTime()
    {
        return time;
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
}
