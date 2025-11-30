import java.util.Scanner;
/**
 * \Scenarioweek4 here.
 *
 * @author sijan
 * @version (a version number or a date)
 */
public class Scenarioweek4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //age group
        System.out.println("Enter your age group : ");
        String ageGroup = sc.nextLine().toLowerCase();

        // movie language
        System.out.println("Enter movie language: ");
        String language = sc.nextLine().toLowerCase();

        //student
        System.out.println("Are you a student?: ");
        String studentInput = sc.nextLine().toLowerCase();
        boolean Student = studentInput.equals("yes");

        //festival day
        System.out.println("Is it a festival day?: ");
        String festivalInput = sc.nextLine().toLowerCase();
        boolean FestivalDay = festivalInput.equals("yes");

        double ticketPrice = 0;

        // Base price according to age group
        if (ageGroup.equals("child")) {
            ticketPrice = 150;
        } else if (ageGroup.equals("adult")) {
            ticketPrice = 250;
        } else if (ageGroup.equals("senior")) {
            ticketPrice = 120;
        } else {
            System.out.println("Invalid age group.");
            return;
        }
        if (language.equals("english")) {
            ticketPrice += 50;
        }
        if (Student) {
            ticketPrice = ticketPrice* 0.90;
        }
        if (FestivalDay) {
            ticketPrice = ticketPrice *1.20;
        }

        System.out.println("Final Ticket Price: Rs " + ticketPrice);
    }
}

