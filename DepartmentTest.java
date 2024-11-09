

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

/**
 * The test class DepartmentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DepartmentTest
{
    /**
     * Default constructor for test class DepartmentTest
     */
    public DepartmentTest()
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
    
    // 3 normal test cases
    @Test
    public void testAddTeacher(){
        int expected = 1;
        int actual = 0;
        
        Department dept = new Department("English");
        Teacher mark = new Teacher("Mark", "English 101");
        dept.addTeacher(mark);
        
        actual = dept.getAllTeachers().size();
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddStudent(){
        int expected = 1;
        int actual = 0;
        
        Department dept = new Department("English");
        Student john = new Student("John", 4);
        dept.addStudent(john);
        
        actual = dept.getAllStudents().size();
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetName(){
        String expected = "English";
        String actual = "";
        
        Department dept = new Department("English");
        
        actual = dept.getName();
        assertEquals(expected, actual);
    }
    
    
    // Test 3 Edge Cases
    @Test
    public void testNullStudent(){
        //Because we can add a null student to a Department object.
        // No exception should be thrown. The size of the ArrayList will be 1
        // with a null object.
        int expected = 1;
        
        Department dept = new Department("English");
        dept.addStudent(null);
        int actual = dept.getAllStudents().size();
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNullTeacher(){
        // Because we can add a null teacher to a Department object.
        // No exception should be thrown. The size of the ArrayList will be 1
        // with a null object.
        int expected = 1;
        
        Department dept = new Department("English");
        dept.addTeacher(null);
        int actual = dept.getAllTeachers().size();
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddDuplicateStudents(){
        // Because we can add the same student multiple times
        int expected = 2;
        
        Department dept = new Department("English");
        Student mark = new Student("Mark", 3);
        dept.addStudent(mark);
        dept.addStudent(mark);
        
        int actual = dept.getAllStudents().size();
        
        assertEquals(expected, actual);
        
    }
    
}
