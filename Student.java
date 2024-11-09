
/**
 * This is the Student class. This includes the name of the student and their grade level.
 * You are also able to call a getName() function to receive the name of the student, and a 
 * getGradeLevel() function to receive the grade level the student currently has.
 */
public class Student
{
    private String name;
    private int gradeLevel;
    
    public Student(String name, int gradeLevel)
    {
        this.name = name;
        this.gradeLevel = gradeLevel;
    }

    public String getName(){
        return name;
    }
    
    public int getGradeLevel(){
        return gradeLevel;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("(Grade " + gradeLevel + ")");

        return sb.toString();
    }
}
