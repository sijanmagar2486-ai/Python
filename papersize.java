 import java.util.Scanner;
/**
 * papersize here.
 *
 * @author sijan
 * @version v9.0
 */
public class papersize
{
    public static void main(String[] args)
    {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter paper size (A0 – A5): ");
        String size = sc.next();

        switch(size) {

            case "a0":
                System.out.println("A0: 841 x 1189 mm (33.1 x 46.8 inches)");
                break;

            case "a1":
                System.out.println("A1: 594 x 841 mm (23.4 x 33.1 inches)");
                break;
            case "a2":
                System.out.println("A2: 420 x 594mm (16.5 x 23.4 inches)");
                break;
            case "a3":
                System.out.println("A3:297 x 420mm (11.7 x 16.5 inches)");
                break;
                
            case "a4":
                System.out.println("A4: 210 x 297mm (8.3 x 11.7 inches)");
                break;

            case "a5":
                System.out.println("A5: 148 x210 mm (5.8 x 8.3 inches)");
                break;

            default:
                System.out.println("Invalid input!");
        }
    }
}

