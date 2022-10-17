public class Student extends Person implements Learner {

    /*
    Create a Student class such that:
Student is a subclass of Person
Student implements the Learner interface
Student should have an instance variable totalStudyTime of type double
Student should have a concrete implementation of the learn method which increments -
the totalStudyTime variable by the specified numberOfHours argument.
Student should have a getTotalStudyTime() method which returns the totalStudyTime instance variable.

     */

    private double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {

    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {

    }


    @Override
    public void learn(double numberOfHours) {
        //increments total study time
        //by specified number of hours

        totalStudyTime += numberOfHours;

    }


    @Override
    public double getTotalStudyTime() {
        return totalStudyTime;
    }

}

