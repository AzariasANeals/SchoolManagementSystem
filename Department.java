import java.util.ArrayList;

/**
 * This is the Department class. This includes the name of the department, a list of 
 * teachers, and a list of students. You are also able to add a new teacher and add a 
 * new student as well. You can also call the getter functions to get a list of all of the
 * teachers and a list of all of the students.
 */
public class Department
{
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private String name;

    public Department(String name){
        this.name = name;
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        ArrayList<Student> students = new ArrayList<Student>();
    }

    public void addTeacher(Teacher newTeacher){
        if(teachers == null){
            teachers = new ArrayList<Teacher>();
        }
        teachers.add(newTeacher);
    }

    public void addStudent(Student newStudent){
        if(students == null){
            students = new ArrayList<Student>();
        }
        students.add(newStudent);
    }

    public void setName(String name){
        this.name = name;
    }

    public ArrayList<Teacher> getAllTeachers(){
        return teachers;
    }

    public ArrayList<Student> getAllStudents(){
        return students;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(name + " Department\n");
        sb.append("-Teachers: ");
        boolean first = true;

        for(Teacher t: teachers){
            if(first){
                first = false;
            }
            else{
                sb.append(", ");
            }
            sb.append(t);
        }
        sb.append("\n");

        first = true;
        sb.append("-Students: ");
        for(Student s: students){
            if(first){
                first = false;
            }
            else{
                sb.append(", ");
            }            
            sb.append(s);
        }
        sb.append("\n");

        return sb.toString();
    }
}
