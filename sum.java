
/**
 * Write a description of class sum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sum
{
    public static void main(String[] args)
    {
        int i=1,sum=0;
        System.out.println("the sum of squares of first natural numbers is:");
        do
        {
            System.out.println(i*i);
            sum=sum+i;
            System.out.println("The sum is "+ sum);
        }while(i<=10);
    }
    
}