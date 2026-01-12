package week7.workshop.week8.week9.week10;


/**
 * Write a description of class ManagementStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ManagementStudent extends Student
{
    public ManagementStudent(int rollNo, String name, double marks) {
        super(rollNo, name, marks);
    }

    // Overriding calculateResult()
    @Override
    public String calculateResult() {
        System.out.println("Management Student Result Calculation");
        return super.calculateResult();  // calling parent method
    }
}
