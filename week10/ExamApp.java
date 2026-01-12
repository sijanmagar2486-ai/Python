package week7.workshop.week8.week9.week10;


/**
 * Write a description of class ExamApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExamApp
{
    public static void main(String[] args) {

        ScienceStudent s1 = new ScienceStudent(101, "Vikash", 38);
        ManagementStudent m1 = new ManagementStudent(102, "Sijan", 55);

        System.out.println(s1);
        System.out.println("Result: " + s1.calculateResult());
        System.out.println("Result with Grace: " + s1.calculateResult(5));

        System.out.println();

        System.out.println(m1);
        System.out.println("Result: " + m1.calculateResult());
        System.out.println("Result with Grace: " + m1.calculateResult(5));
    }
}
