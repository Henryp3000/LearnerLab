import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*
Create a TestPerson class.
Create a testConstructor method which ensures that a Person object's id and name field are being set upon construction.
Create a testSetName method which ensures that a Person object's name variable is being set by invoking the .setName method.

 */

public class PersonTest {
    @Test
    public void TestConstructor(){
        Person person = new Person(101010L, "Henryp") {
            @Override
            public void teach(Learner learner, double numberOfHours) {

            }

            @Override
            public void lecture(Learner[] learners, double numberOfHours) {

            }
        };

        long expectedId = 101010L;
        String expectedName = "Henryp";

        Assertions.assertEquals(expectedId, person.getId());
        Assertions.assertEquals(expectedName, person.getName());

    }

    @Test
    public void testSetName() {
        Person person = new Person(19996L, "Tom") {
            @Override
            public void teach(Learner learner, double numberOfHours) {

            }

            @Override
            public void lecture(Learner[] learners, double numberOfHours) {

            }
        };

        String expected = "Tom";

        person.setName(expected);
        String actual = person.getName();

        Assertions.assertEquals(expected, actual);
    }


}
