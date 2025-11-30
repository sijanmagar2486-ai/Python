import java.util.Scanner;
/**
 *divisible here.
 *
 * @author Sijan
 * @version V4.0
 */
public class divisible
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number.");
        int num=obj.nextInt();
        if(num%3==0)
        {
            if(num%5==0)
        {
            System.out.println("The number is divisible by both 3 and 5");
        }
        else 
        {
            System.out.println("The number is divisible by 5 only");
        }
        
        }
        else
        {
           System.out.println("The number is divisible by 3 only"); 
        }
        
        
    }
}