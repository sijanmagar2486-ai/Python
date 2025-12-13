import java.util.Scanner;
/**
 * Write a description of class week6q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week6q3
{
    public static void main(String[] args){
        String[] students = {"Saroj", "Sushant", "Ujjwal", "Rabina", "Sandesh"};

        System.out.println("Initial Student List:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("\nName at index 2: " + students[2]);

        students[4] = "Bishal";
        System.out.println("Updated name at index 4: " + students[4]);
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a new name to update (replace index 1): ");
        students[1] = sc.nextLine();
        System.out.println("\nUpdated Student List:");
        for (String name : students) {
            System.out.println(name);
        }

    }
}



