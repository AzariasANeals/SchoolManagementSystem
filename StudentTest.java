
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class StudentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentTest
{
    /**
     * Default constructor for test class StudentTest
     */
    public StudentTest()
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
    public void testToString(){
        String expected = "Bob(Grade 2)";
        Student tester = new Student("Bob", 2);
        String actual = tester.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetName(){
        String expected = "Bob";
        Student tester = new Student("Bob", 2);
        String actual = tester.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetGradeLevel(){
        int expected = 2;
        Student tester = new Student("Bob", 2);
        int actual = tester.getGradeLevel();
        assertEquals(expected, actual);
    }

    // 3 Edge Case Tests
    @Test
    public void testNullStudent(){
        String expected = null;
        Student tester = new Student(null, 2);
        String actual = tester.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void testNegativeGradeLevel(){
        int expected = -1;
        Student tester = new Student("Bob", -1);
        int actual = tester.getGradeLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyToString(){
        String expected = "(Grade 2)";
        Student tester = new Student("", 2);
        String actual = tester.toString();
        assertEquals(expected, actual);
    }
}