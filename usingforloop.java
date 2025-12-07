
/**
 * Write a description of class usingforloop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class usingforloop
{
    public static void main(String[] args)
    {
        int i,j;
        System.out.println("The output is:");
        for (i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print( j + " ");
            }
            System.out.println();
        }
    }
}