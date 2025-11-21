
/**
 * week3 here.
 *
 * @author Sijan
 * @version v2.0
 */
public class week3
{
    int qty; // instance variable
    static int rrt;// static variable
    
    public static void main(String[] args){
        int age=18;// local variable
        System.out.println(age);
        System.out.println(week3.rrt);
        
        //implicit typecasting
        
        double dtr=age;
        System.out.println(dtr);
        
        //explicit typecasting
        
        double db = 10.09;
        int itr=(int)db;
        System.out.println(itr);
        
        //exceptions in arithmetic
        
        byte b1=10;
        byte b2=11;
        
        byte sum=(byte)(b1+b2);
        
        //minimum, maximum, sizes, bytes
        
        System.out.println(Byte.MAX_VALUE);//maximum vlaue
        System.out.println(Byte.MIN_VALUE);//minimum value
        System.out.println(Byte.SIZE);//bits
        System.out.println(Byte.BYTES);//bytes
         
        
        //escape sequence
        System.out.println("Hello\nWorld");
        System.out.println("Hamro\n\tNepal");
        System.out.println("She said\" Hi \" ");
        
        //unicode escape sequence
        
        System.out.println("\u2764");
        
    }
}