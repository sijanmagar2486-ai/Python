import java.util.Scanner;
/**
 *GpaConversion here.
 *
 * @author Sijan
 * @version v7.0
 */
public class GpaConversion
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Gpa.");
        double gpa=obj.nextDouble();
        //validation of input
        if (gpa<4.0 && gpa>0.0)
        {
            System.out.println("The given GPA is Valid");
        }
        else
        {
            System.out.println("The given GPA is Invalid");
        }
        
        //converting gpa to grade
        if (gpa<4.0 && gpa>3.6)
        {
            System.out.println("The obtainded grade is A+");
        }
        else if (gpa<3.6 && gpa >3.2)
        {
            System.out.println("The obtainded grade is A");
        }
        else if (gpa<3.2 && gpa>2.8)
        {
            System.out.println("The obtainded grade is B+");
        }
        else if (gpa<2.8 && gpa>2.4)
        {
            System.out.println("The obtainded grade is B");
        }
        else if (gpa<2.4 && gpa>2.0)
        {
            System.out.println("The obtainded grade is C+");
        }
        else if (gpa<2.0 && gpa>1.6)
        {
            System.out.println("The obtainded grade is C");
        }
        else 
        {
            System.out.println("The OBtained grade is NG");
        }
    }
}