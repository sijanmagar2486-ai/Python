import java.util.Scanner;

/**
 * Write a description of class calculator here.
 *
 * @author sijan
 * @version v5.0
 */
public class calculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNum= input.nextInt();
        System.out.println("Enter second number:");
        int secondNum= input.nextInt();
        int sum,diff,product;
        sum = firstNum+secondNum;
        System.out.println("Sum of the two number is:"+ sum);
        diff=secondNum-firstNum;
        System.out.println("Difference of the two number is:"+ diff);
        product=firstNum*secondNum;
        System.out.println("Product of the two number is:"+ product);
        
    }
}