/**
 *
 * @author Victoria
 */
public abstract class Event {
    
    private int startTime;
    private int length;
    private int endTime;
    
    public Event(int startTime, int length)
    {
        this.startTime = startTime;
        this.length = length;
        this.endTime = startTime + length;
    }
    
    public int getStartTime()
    {
        return startTime;
    }
    
    public int getLength()
    {
        return length;
    }
    
    public int getEndTime()
    {
        return endTime;
    }
    
    public abstract int getPriority();
    
    public String toString()
    {
        return("\nStart Time: " + getStartTime() +
                "\nEnd Time: " + getEndTime());
    }
}
