import java.util.Scanner;
/**
 *  SellingSwitch here.
 *
 * @author Sijan 
 * @version V5.0
 */
public class SellingSwitch
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Marked price of the item.");
        float mp=obj.nextInt();
        System.out.println("The MP of the item is:"+ mp);
        System.out.println("Enter the category amog A,B,C or D");
        char category=obj.next().charAt(0);
        switch(category)
        {
            case 'A':
            float sp=mp-(mp*60);
            System.out.println("The selling price of the item is:"+ sp);
            break;
            
            case 'B':
            float sp2=mp-(mp*40);
            System.out.println("The selling price of the item is:"+ sp2);
            break;
            
            case 'C':
            float sp3=mp-(mp*60);
            System.out.println("The selling price of the item is:"+ sp3);
            break;
            
            case 'D':
            float sp4=mp-(mp*60);
            System.out.println("The selling price of the item is:"+ sp4);
            break;
        }
    }
}