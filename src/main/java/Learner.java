/*

Create a Learner interface.
Learner should declare method signature:
Method name: learn
Method parameters: double numberOfHours
Method return-type: void
Learner should declare method signature:
Method name: getTotalStudyTime
Method return-type: Double

 */
public interface Learner {
    void learn (double numberOfHours);
    double getTotalStudyTime();
}