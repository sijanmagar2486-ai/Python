import java.util.Scanner;

/**
 *scanner 
 *
 * @author Sijan
 * @version v2.0
 */
public class Jhorley2
{
    public static void main(String[] args)
    {
        //scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        
        int firstNum= input.nextInt();
        
        System.out.println("Enter the second number:");
        
        double secondNum= input.nextInt();
        
        System.out.println("My first number is: "+ firstNum);
        System.out.println("My second number is: "+ secondNum);
        
        //post and pre increment operator
        
        int h=1;
        int j=++h;
        int k=h++;
        System.out.println("h+j+k");
        
        
        //Ternery operator
        int age=18;
        
        String isValid=(age>=18) ? "Driving is allowed" : "Driving is not allowed";
        System.out.println(isValid);
        
    }
}