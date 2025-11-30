import java.util.Scanner;
/**
 * ScholarshipChecker here.
 *
 * @author Sijan
 * @version v7.0
 */
public class ScholarshipChecker
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Gpa.");
        double gpa=obj.nextDouble();
        System.out.println("The given GPA is :"+ gpa);
        
        System.out.println("Enter the attendance rate.");
        int attendance=obj.nextInt();
        System.out.println("The attendance rate is :"+ attendance);
        
        System.out.println("Enter the attitude score.");
        int attitude=obj.nextInt();
        System.out.println("The attitude score is:"+ attitude);
        
        // Eligibility checkintg
        
        if(gpa>=3.2)
        {
            if(attendance>=80)
            {
                if(attitude<=5)
                {
                    System.out.println("The student is eligible for scholarship");
                }
            }
        }
        else
        {
            System.out.println("The student is not eligible for the scholarship");
        }
        
    }
}