import java.util.Scanner;
/**
 * Write a description of class week3question2 here.
 *
 * @author sijan
 * @version v2.0
 */
public class week3question2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        int grade = sc.nextInt();

        // Using ternary operator
        String result = (grade >= 40) ? "Pass" : "Fail";

        System.out.println("Result: " + result);
    }
}