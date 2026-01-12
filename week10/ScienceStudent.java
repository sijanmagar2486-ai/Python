package week7.workshop.week8.week9.week10;


/**
 * Write a description of class ScienceStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScienceStudent extends Student
{
 
    public ScienceStudent(int rollNo, String name, double marks) {
        super(rollNo, name, marks);
    }

    @Override
    public String calculateResult() {
        System.out.println("Science Student Result Calculation");
        return super.calculateResult();  // calling parent method
    }
}
