import java.util.Scanner;
/**
 * RikshawFare here.
 *
 * @author Sijan
 * @version v7.0
 */
public class RikshawFare
{
    public static void main(String[] args){
        
        //Base fare is Rs20.
        //fare /km is Rs35.
        //fare /minute is Rs25.
        //if customer is local then discount=10%.
        //if the ride is in night then extra charge=20%.
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter distance: ");
        double distance = obj.nextDouble();
        System.out.println("The distance is :"+ distance +"km");

        System.out.print("Enter waiting time");
        int time = obj.nextInt();
        System.out.println("The duration to reach is :"+ time +"minutes");

        System.out.print("Is the customer local? ");
        String local = obj.next();
        System.out.println(local);

        System.out.print("Is it night time? ");
        String night = obj.next();
        System.out.println(night);

        double fare = (distance * 35) + (time * 25);

        
        double discount = local.equals("yes") ? 0.10 : 0.0;
        double extra = night.equals("yes") ? 0.20 : 0.0;

        fare = fare -(fare * discount);
        fare =fare + (fare * extra);

        System.out.println("Final Fare: Rs. "+ fare);
    }
}