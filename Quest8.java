import java.util.Scanner;
/**
 * Write a description of class Quest8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Quest8
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number whose multiplication table is required");
        int num=obj.nextInt();
        System.out.println("The number is:"+ num);
        
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+"x"+i+"="+(num*i) );
        }
        
    }
}