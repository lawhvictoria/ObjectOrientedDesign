/**
 *
 * @author Victoria
 */
public class ClubMeetings extends Event{
    
    private int priority;    
    
    public ClubMeetings(int time, int length)
    {
        super(time, length);
        priority = 4;
    }
    
    public int getPriority()
    {
        return priority;
    }
    
    public String toString()
    {
        return("Club Meeting" + super.toString());
    }
}
