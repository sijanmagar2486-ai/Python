import java.util.Scanner;
/**
 * Write a description of class week6q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week6q4
{
    public static void main(String[] args) {
        int[] scores = {10, 20, 30, 40, 50};

        System.out.println("Scores:-");
        for (int score : scores) {
            System.out.println(score);
        }
        int sum = 0, highest = scores[0],lowest = scores[0];
        for (int score : scores) {
            sum += score;
            if (score> highest) highest = score;
            if (score<lowest) lowest= score;
        }

        double average = (double) sum / scores.length;

        System.out.println("Sum:" + sum);
        System.out.println("Average:" + average);
        System.out.println("Highest:" + highest);
        System.out.println("Lowest:" + lowest);

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter number of subjects: ");
        int n = sc.nextInt();

        int[] dynamicScores = new int[n];

        System.out.println("Enter the scores:");
        for (int i = 0; i < n; i++) {
            dynamicScores[i] = sc.nextInt();
        }
        System.out.println("\nUpdated Scores:");
        for (int score : dynamicScores) {
            System.out.println(score);
        }

        sum = 0;
        highest = dynamicScores[0];
        lowest = dynamicScores[0];

        for (int score : dynamicScores) {
            sum += score;
            if (score > highest) highest = score;
            if (score < lowest) lowest = score;
        }

        average = (double) sum / n;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);

    }
}