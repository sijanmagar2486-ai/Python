/**
 * week6q6 here.
 *
 * @author Sijan
 * @version v5.0
 */
public class week6q6
{ 
   public static void main(String[] args)
   {
       String[][] seat=new String[2][3]; 
       seat[0][1]="Ram";
       seat[0][2]="Shyam";
       seat[0][3]="Hari";
       
       for(int i=0;i<2;i++)
       {
           for(int j=0;j<3;j++)
           {
                if(seat[i][j]==null || seat[i][j].equals("")) {
                    System.out.print("empty");
                } else {
                    System.out.print(seat[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}