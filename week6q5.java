import java.util.Scanner;
/**
 * Write a description of class week6q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week6q5
{
  public static void main(String[] args)
  {

        String[] districts = {"Morang", "Kathmandu", "Kaski", "Sindhuli"};
        System.out.println("Initial Districts:");
        for (int i = 0; i < districts.length; i++) 
        {
            System.out.println((i + 1) + ". " + districts[i]);
        }
        Scanner obj=new Scanner(System.in);

        System.out.print("\nEnter number of districts: ");
        int n = obj.nextInt();
        obj.nextLine(); 

        String[] newDistricts =new String[n];
        System.out.println("Enter district names:");

        for (int i =0; i< n; i++) 
        {
            System.out.print("District " + (i + 1) + ": ");
            newDistricts[i] = obj.nextLine();
        }
        System.out.println("\nUpdated District List:");
        for (int i = 0; i < newDistricts.length; i++) 
        {
            System.out.println((i + 1) + ". " + newDistricts[i]);
        }

    }
}