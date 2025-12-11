import java.util.Scanner;
/**
 * Divisible here.
 *
 * @author Sijan
 * @version V6.0
 */
public class Divisible
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number.");
        int num=obj.nextInt();
        if (num%5==0)
        {
            if(num%3==0)
            {
                System.out.println("The number is divisible by both 3 and 5.");
            }
        }
        else
        {
            System.out.println("The number is not divisible by both 3 and 5.");
        }
    }
}