

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

/**
 * The test class SchoolTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SchoolTest
{
    /**
     * Default constructor for test class SchoolTest
     */
    public SchoolTest()
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
    public void testAddDepartment(){
        int expected = 1;
        int actual = 0;
        
        Department d = new Department("Chemistry");
        School tester = new School("Ingraham");
        
        tester.addDepartment(d);
        
        ArrayList<Department> dpts = tester.getAllDepartments();
        actual = dpts.size();
        assertEquals(expected, actual);
        
    }
    
    @Test
    public void testAddDepartmentName(){
        String expected = "Chemistry";
        String actual = "";
        
        Department d = new Department(expected);
        School tester = new School("Ingraham");
        
        tester.addDepartment(d);
        
        ArrayList<Department> dpts = tester.getAllDepartments();        
        actual = dpts.get(0).getName();
        
        assertEquals(expected, actual);
        
    }
    
    @Test
    public void testGetName(){
        String expected = "Ingraham";
        String actual = "";
        
        Department d = new Department("Chemistry");
        School tester = new School(expected);
        
        tester.addDepartment(d);
        actual = tester.getName();
        
        assertEquals(expected, actual);
        
    }
    
    // 3 edge case tests
    
    @Test
    public void testZeroDepartments(){
        // Because we did not add any departments, we are expecting an empty ArrayList.
        // No exception should be thrown.
        int expected = 0;
        
        School tester = new School("Ingraham");
        int actual = tester.getAllDepartments().size();
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddDepartmentNull(){
        // Because we can add a null department to a School object.
        // No exception should be thrown. The size of the ArrayList will be 1 with a null object.
        int expected = 1;
        School tester = new School("Ingraham");
        tester.addDepartment(null);
        int actual = tester.getAllDepartments().size();
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddDuplicateDepartments(){
        // Because we can add the same Department object multiple times.
        int expected = 2;
        String dptname = "Math";
        School tester = new School("Ingraham");
        Department d1 = new Department(dptname);
        
        tester.addDepartment(d1);
        tester.addDepartment(d1);
        int actual = tester.getAllDepartments().size();
        
        assertEquals(expected, actual);
        
    }
}
