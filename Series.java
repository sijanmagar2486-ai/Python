
/**
 * Write a description of class Series here.
 *
 * @author Sijan
 * @version V9.0
 */
public class Series
{
    public static void main (String[] args)
    {
        //using for loop 
        int i;
        System.out.println("The given series using for loop");
        for(i=1;i<=10;i++)
        {
            System.out.println(2*i);
        }
        
        //using while loop
        System.out.println("The given  series unsing while loop");
        int j=1;
        while (j<=10)
        {
            System.out.println(2*i);
            j++;
        }
        
        //using do while loop
        
        System.out.println("The given series using do-while loop");
        int k=1;
        do
        {
            System.out.println(2*k);
            k++;
        }while(k<=10);
    }
}