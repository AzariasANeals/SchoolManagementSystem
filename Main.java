
/**
 * To run this program, first create a new Student() and a new Teacher().
 * Then create a Department() and a School(). Then add the teacher and students
 * to the department, and finally add the department to the school. Then you just
 * do a System.out.println() of the school and it will call a toString() method, and 
 * will display a list of the teacher, student, department, and school. 
 */
public class Main
{
    public static void main(String[] args){
        Student john = new Student("John", 2);
        Student jack = new Student("Jack", 3);
        Student mark = new Student("Mark", 1);
        Student ashley = new Student("Ashley", 2);
        Student eve = new Student("Eve", 1);
        Student joan = new Student("Joan", 3);

        Teacher max = new Teacher("Max", "English 101");
        Teacher bob = new Teacher("Bob", "Architecture 103");
        Teacher tom = new Teacher("Tom", "English 102");
        Teacher nicole = new Teacher("Nicole", "Architecture 201");

        Department dpt1 = new Department("English");
        Department dpt2 = new Department("Architecture");

        School school1 = new School("Greenville College");

        dpt1.addTeacher(max);
        dpt1.addTeacher(tom);

        dpt1.addStudent(john);
        dpt1.addStudent(jack);
        dpt1.addStudent(ashley);

        dpt2.addTeacher(bob);
        dpt2.addTeacher(nicole);

        dpt2.addStudent(mark);
        dpt2.addStudent(eve);
        dpt2.addStudent(joan);

        school1.addDepartment(dpt1);
        school1.addDepartment(dpt2);

        System.out.println(school1);
    }
}
