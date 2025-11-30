import java.util.Scanner;
/**
 * week4WS here.
 *
 * @author Sijan
 * @version V4.0
 */
public class week4WS
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Percentage of the student.");
        int Percentage=obj.nextInt();
        if (Percentage>35)
        {
            System.out.println("The student is passed.");
        }
        else
        {
            System.out.println("The student is failed.");
        }
    }
}