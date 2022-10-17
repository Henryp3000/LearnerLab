import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/*
Create a TestPeople class.
Create a testAdd method which ensures that our personList in our People class populated with respective Person objects following invokation of the add method.
Create a testRemove method which ensures that the personList in a People object is depopulated with a respective Person object following the invokation of the remove method.
Create a testFindById method which ensures that a respective Person object with a respective id field is returned upon invokation of the findById method on a respective People object.

 */

public class PeopleTest {


    People people;

    @BeforeEach

    public void setUpBeforeEach() {
        people  = new People();
    }

    @Test
    public void addTest() {
        int expected =1;

        people.add(new Person(56767L, "Dave") {
            @Override
            public void teach(Learner learner, double numberOfHours) {

            }

            @Override
            public void lecture(Learner[] learners, double numberOfHours) {

            }
        });

        Assertions.assertEquals(expected, people.ArraylistSize());

    }

    @Test
    public void RemoveNameTest() {
        int expected = 0;

        Person person = new Person(56767L, "Dave") {
            @Override
            public void teach(Learner learner, double numberOfHours) {

            }

            @Override
            public void lecture(Learner[] learners, double numberOfHours) {

            }
        };

        people.add(person);

        people.RemovePersonObjecttoPersontoPersonList(person);

        Assertions.assertEquals(expected, people.ArraylistSize());


    }

    @Test
    public void testFindId(){

        long expected = 56767L;


        Person person = new Person(56767L, "Dave") {
            @Override
            public void teach(Learner learner, double numberOfHours) {

            }

            @Override
            public void lecture(Learner[] learners, double numberOfHours) {

            }
        };

        person.getId();

        Assertions.assertEquals(expected, person.getId());

    }


}