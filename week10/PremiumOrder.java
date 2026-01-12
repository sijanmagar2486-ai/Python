package week7.workshop.week8.week9.week10;


/**
 * Write a description of class PremiumOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumOrder extends Order
{

    public PremiumOrder(int orderId, String customerName, double amount) {
        super(orderId, customerName, amount);
    }

    @Override
    public double calculateFinalAmount() {
        double discount = getAmount() * 0.10;
        return super.calculateFinalAmount() - discount;
    }
}
