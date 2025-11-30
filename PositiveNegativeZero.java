import java.util.Scanner;
/**
 * PositiveNegativeZero here.
 *
 * @author Sijan
 * @version V4.0
 */
public class PositiveNegativeZero
{
    public static void main(String[] args)
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter a number.");
        int Number=obj.nextInt();
        if(Number>0)
        {
            System.out.println("The number is Positive. ");
        }
        else if(Number==0)
        {
            System.out.println("The number is Zero.");
        }
        else
        {
            System.out.println("The number is Negative.");
        }
    }
}