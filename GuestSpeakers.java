/**
 *
 * @author Victoria
 */
public class GuestSpeakers extends Event{
    
    private int priority;    
    
    public GuestSpeakers(int time, int length)
    {
        super(time, length);
        priority = 3;
    }
    
    public int getPriority()
    {
        return priority;
    }
    
    public String toString()
    {
        return("Guest Speaker" + super.toString());
    }    
}
