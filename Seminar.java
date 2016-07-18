/**
 *
 * @author Victoria
 */
public class Seminar extends Event{
 
    private int priority;
    
    public Seminar(int time, int length)
    {
        super(time, length);
        priority = 2;
    }
    
    public int getPriority()
    {
        return priority;
    }
    
    public String toString()
    {
        return("Seminar" + super.toString());
    }    
}
