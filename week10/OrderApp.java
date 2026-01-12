package week7.workshop.week8.week9.week10;


/**
 * Write a description of class OrderApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderApp
{
    public static void main(String[] args) {

        NormalOrder normalOrder =
                new NormalOrder(101, "Rahul Sharma", 5000);

        PremiumOrder premiumOrder =
                new PremiumOrder(102, "Anita Verma", 8000);

        System.out.println("----- NORMAL ORDER INVOICE -----");
        System.out.println(normalOrder);
        System.out.println("Final Amount: " +
                normalOrder.calculateFinalAmount());

        System.out.println("\n----- PREMIUM ORDER INVOICE -----");
        System.out.println(premiumOrder);
        System.out.println("Final Amount: " +
                premiumOrder.calculateFinalAmount());

        System.out.println("\n----- PREMIUM ORDER WITH EXTRA DISCOUNT -----");
        System.out.println("Final Amount: " +
                premiumOrder.calculateFinalAmount(500));
    }
}

