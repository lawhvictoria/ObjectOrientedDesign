/**
 *
 * @author Victoria
 */
public class Lecture extends Event{
    
    private int priority;
    
    public Lecture(int time, int length)
    {
        super(time, length);
        priority = 1;
    }
    
    public int getPriority()
    {
        return priority;
    }
    
    public String toString()
    {
        return("Lecture" + super.toString());
    }
}
