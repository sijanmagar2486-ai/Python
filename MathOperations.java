
/**
 * MathOperations here.
 *
 * @author Sijan
 * @version v1.0
 */
public class MathOperations
{
    public static void main(String[] args)
    {
        int a=10,b=2;
        int sum,diff,product,division;
        //arithmetic operations
        sum = a+b;
        System.out.println("The sum of two numbers is:"+ sum);
        diff = a-b;
        System.out.println("The difference of two numbers is:"+ diff);
        product = a*b;
        System.out.println("The product of two numbers is:"+ product);
         division = a/b;
        System.out.println("The difference of two numbers is:"+ division);
        System.out.println();
        //unary operations
        System.out.println(++a);
        System.out.println(a++);
        
        //relational operators
        
        String vlaue=(a>b) ? "a is greater than b" : "b is greater than a";
        String vlaue1=(a==b) ? "a is equal to b" : "a is not equal";
        String vlaue2=(a<b) ? "a is less than b" : "b is less than a";
        String vlaue3=(a!=b) ? "a is not equal to b" : "a is equal to bd";
        
        //logical operations
        
        boolean p = true, q = false;
        if (a >= 18 && p) {
            System.out.println("You are allowed to enter.");
        } else {
            System.out.println("Access denied.");
        }
        
        if (b <= 18 || q) {
            System.out.println("You are allowed to enter.");
        } else {
            System.out.println("Access denied.");
        }
        
        
        
    }
}