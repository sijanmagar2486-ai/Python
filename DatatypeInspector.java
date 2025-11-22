
/**
 * Write a description of class DatatypeInspector here.
 *
 * @author sijan
 * @version v3.0
 */
public class DatatypeInspector
{
    public static void main(String[] args)
    {
        byte byteValue = 100;
        short shortValue = 30000;
        int intValue = 123456789;
        long longValue = 12345678900L;     
        float floatValue = 5.75f;          
        double doubleValue = 19.99;        
        char charValue = 'A';
        boolean booleanValue = true;

        // Printing values with descriptive labels
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Int Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Char Value: " + charValue);
        System.out.println("Boolean Value: " + booleanValue);
    }
}