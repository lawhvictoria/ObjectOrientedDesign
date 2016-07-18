import java.util.ArrayList;

/**
 *
 * @author Victoria
 */
public class CollegeBuilding {
    private ArrayList<Classroom> classrooms;
    
    public CollegeBuilding()
    {
        classrooms = new ArrayList<>();
    }
    
    public void addClassroom(Classroom classroom)
    {
        classrooms.add(classroom);
    }
    
    public ArrayList<Classroom> getClassrooms()
    {
        return classrooms;
    }
}
