import java.util.ArrayList;

/**
 * The School class. This includes the name of the school, a list of the departments, and the
 * ability to add a department or get a list of all the departments.
 */
public class School
{
    private ArrayList<Department> departments;
    private String name;
    
    
    
    public School(String name)
    {
        departments = new ArrayList<Department>();
        this.name = name;
    }
    
    public void addDepartment(Department dept){
        if(departments == null){
            departments = new ArrayList<Department>();
        }
        
        departments.add(dept);
    }
    
    public ArrayList<Department> getAllDepartments(){
        return departments;
    }

    public String getName(){
        return name;
    }
    
    public void addDepartmentList(ArrayList<Department> d){
        departments = d;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("School: " + name);
        sb.append("\nDepartments: ");
        boolean first = true;
        
        for(Department d: departments){
            if(first){
                first = false;
            }
            else{
                sb.append(", ");
            }
            sb.append(d.getName());
        }
        
        sb.append("\n");
        
        for(Department d: departments){
            sb.append(d);
        }
        
        
        
        return sb.toString();
    }
}
