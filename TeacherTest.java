

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TeacherTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TeacherTest
{
    /**
     * Default constructor for test class TeacherTest
     */
    public TeacherTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    // 3 Normal Test Cases
    @Test
    public void testGetName(){
        String expected = "Mark";
        Teacher tester = new Teacher("Mark", "Science");
        String actual = tester.getName();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetSubject(){
        String expected = "Science";
        Teacher tester = new Teacher("Mark", "Science");
        String actual = tester.getSubject();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString(){
        String expected = "Mark(Science)";
        Teacher tester = new Teacher("Mark", "Science");
        String actual = tester.toString();
        assertEquals(expected, actual);
    }
    
    // 3 Edge Test Cases
    @Test
    public void testNullGetName(){
        String expected = null;
        Teacher tester = new Teacher(null, "Science");
        String actual = tester.getName();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNullGetSubject(){
        String expected = null;
        Teacher tester = new Teacher("Mark", null);
        String actual = tester.getSubject();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEmptyToString(){
        String expected = "()";
        Teacher tester = new Teacher("", "");
        String actual = tester.toString();
        assertEquals(expected, actual);
    }
}
