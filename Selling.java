import java.util.Scanner;
/**
 * Selling here.
 *
 * @author Sijan
 * @version V7.0
 */
public class Selling
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the marked price of the item.");  
        float mp=obj.nextInt();
        System.out.println("The MP of the first item is:"+ mp);
        
        //For categories
        
        System.out.println("Enter the categories among A,B,C or D");
        char category=obj.next().charAt(0);
        if (category=='A')
        {
            float sp=mp-(mp*60);
            System.out.println("The selling price of the item is:"+ sp);
        }
        else if (category=='B')
        {
            float sp=mp-(mp*40);
            System.out.println("The selling price of the item is:"+ sp);
        }
        else if (category=='C')
        {
            float sp=mp-(mp*20);
            System.out.println("The selling price of the item is:"+ sp);
        }
        else if (category=='D')
        {
            float sp=mp-(mp*10);
            System.out.println("The selling price of the item is:"+ sp);
        }
        else 
        {
            System.out.println("The given item does not fall under the given category.");
        }
    }
}