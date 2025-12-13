
/**
 * Write a description of class week6q5in here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week6q5in
{
    public static void main(String[] args)
    {
        int[][] marks = {{80, 75}, {90, 85}  };

        System.out.println("Student\tNepali\tEnglish\tTotal");
        for (int i=0;i<2;i++) {
            int total = 0;
            System.out.print("S" + (i + 1) + "\t");

            for (int j=0;j<2;j++) {
                System.out.print(marks[i][j] + "\t");
                total += marks[i][j];
            }

            System.out.println(total);
        }
    }
}