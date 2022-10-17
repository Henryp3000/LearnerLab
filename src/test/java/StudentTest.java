import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
Create a TestStudent class.
Create a testImplementation method that asserts that a Student is an instanceof a Learner.
Create a testInheritance method that asserts that a Student is an instanceof a Person.
Create a testLearn method that ensures a Student's totalStudyTime instance variable is incremented by the specified numberOfHours by invoking the .learn method.
 */

public class StudentTest {
    @Test
    public void StudentLearnerTest() {
        Student student = new Student(215215L, "Henry");

        boolean actual = student instanceof Learner;

        Assertions.assertTrue(actual);


    }

    @Test
    public void StudentPersonTest() {


        Student student = new Student(302302L, "Nyshia");

        boolean actual = student instanceof Person;

        Assertions.assertTrue(actual);

    }

    @Test
    public void testLearn() {
        Student student = new Student(12345L, "Rob");
        Double expected = 10.0;
        student.learn(10);
        Double actual = student.getTotalStudyTime();

        Assertions.assertEquals(expected, actual);


    }
}