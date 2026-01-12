package week7.workshop.week8.week9.week10;


/**
 * Write a description of class CarDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDelivery extends DeliveryPartner
{
    private double maintenanceCost;

    public CarDelivery(int partnerId, String name, double basePay, double maintenanceCost) {
        super(partnerId, name, basePay);
        this.maintenanceCost = maintenanceCost;
    }

    @Override
    public double calculatePayment() {
        return super.calculatePayment() + maintenanceCost;
    }

    public double calculatePayment(int extraOrders) {
        return calculatePayment() + (extraOrders * 30);
    }

    @Override
    public String toString() {
        return super.toString() + ", Car Maintenance Cost: " + maintenanceCost +  ", Total Payment: " + calculatePayment();
    }
}

