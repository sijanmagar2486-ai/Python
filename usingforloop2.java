
/**
 * Write a description of class usingforloop2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class usingforloop2
{
     public static void main(String[] args)
    {
        int i,j,k;
        System.out.println("The output is:");
        for (i=1;i<=5;i++)
        {
            for(k=4;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print( j );
            }
            System.out.println();
        }
    }
}