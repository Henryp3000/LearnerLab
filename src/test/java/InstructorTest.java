import static org.junit.jupiter.api.Assertions.*;
/*
Create a TestInstructor class.
Create a testImplementation method that asserts that an Instructor is an instanceof a Teacher.
Create a testInheritance method that asserts that a Instructor is an instanceof a Person.
Create a testTeach method that ensures when an Instructor invokes the teach method, a respective student's totalStudyTime instance variable is incremented by the specified numberOfHours.
Create a testLecture method that ensures when an Instructor invokes the lecture method, a respective array of students' totalStudyTime instance variables is incremented by numberOfHours/students.length.

 */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {
    @Test
    public void InstructorInstanceofTeacher() {

        Instructor instructor = new Instructor(215215L, "Henry");

        boolean actual = instructor instanceof Teacher;

        Assertions.assertTrue(actual);
    }

    @Test
    public void InstructorInstanceofPerson() {

        Instructor instructor = new Instructor(215215L, "Henry");

        boolean actual = instructor instanceof Person;

        Assertions.assertTrue(actual);


    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(235467L, "Henry");
        Student student = new Student(6789L, "Josh");
        double expected = 19.0;
        instructor.teach(student, 19.0);

        Double actual = student.getTotalStudyTime();

        assertEquals(expected, actual);


    }

    @Test
    public void testLecture() {
        Instructor instructor = new Instructor(123456L, "Henry");
        Student student = new Student(19191L, "Nysia");
        Student student2 = new Student(13579L, "Rob");


        Student[] students = {student, student2};
        instructor.lecture(students, 12);
        Double expected = 6.0;
        Double actual = student.getTotalStudyTime();

        Assertions.assertEquals(expected, actual);


    }

}