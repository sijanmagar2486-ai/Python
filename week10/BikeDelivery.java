package week7.workshop.week8.week9.week10;


/**
 * Write a description of class BikeDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BikeDelivery extends DeliveryPartner
{
    private double fuelAllowance;

    public BikeDelivery(int partnerId, String name, double basePay, double fuelAllowance) {
        super(partnerId, name, basePay);
        this.fuelAllowance = fuelAllowance;
    }

    @Override
    public double calculatePayment() {
        return super.calculatePayment() + fuelAllowance;
    }

    public double calculatePayment(int extraOrders) {
        return calculatePayment() + (extraOrders * 20);
    }

    @Override
    public String toString() {
        return super.toString() + ", Bike Fuel Allowance: " + fuelAllowance + ", Total Payment: " + calculatePayment();
    }

}