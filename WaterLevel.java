import java.util.Scanner;

/**
 *  WaterLevel 
 *
 * @author sijan
 * @version v6.0
 */
public class WaterLevel
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the water level:");
        
        int a=input.nextInt();
        System.out.println("The level of water is:");
        String isValid=(a>1000) ? "WARNING: Water level has reached more than 1000l !" : "STATUS: Normal.";
        System.out.println(isValid);
    }
}