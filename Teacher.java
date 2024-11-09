
/**
 * This is the Teacher class.
 * This includes the teacher name and and the subject they teach. You can also
 * call a getName() function to receive the name, and a getSubject() function
 * to receive the subject the teacher teaches.
 */
public class Teacher
{
    private String name;
    private String subject;
    
    
    public Teacher(String name, String subject)
    {
        this.name = name;
        this.subject = subject;
    }
    
    public String getName(){
        return name;
    }
    
    public String getSubject(){
        return subject;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append(name);
        sb.append("(" + subject + ")");
        
        return sb.toString();
    }
    
}
