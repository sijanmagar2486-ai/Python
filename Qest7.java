import java.util.Scanner;
/**
 * Write a description of class Qest7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Qest7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char choice ='y';

        while(choice =='y') {
            double a, b;
            char op;

            System.out.print("Enter first number:");
            a=sc.nextDouble();
            System.out.print("Enter second number:");
            b= sc.nextDouble();
            System.out.print("Enter operation:");
            op= sc.next().charAt(0);

            if(op=='+') {
                
                
                System.out.println("Result =" + (a + b));
                
            }
            else if(op== '-') {
                System.out.println("Result=" + (a - b));
                
                
            }
            else if(op == '*') {
                System.out.println("Result= " + (a * b));
            }
            else if(op == '/') {
                System.out.println("Result =" + (a / b));
            }
            else {
                System.out.println("Invalid operator!");
                
            }
            
            

            System.out.print("Do you want to continue: ");
            choice = sc.next().charAt(0);
        }
    }
    
}