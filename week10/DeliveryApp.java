package week7.workshop.week8.week9.week10;


/**
 * Write a description of class DeliveryApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryApp

{
    public static void main(String[] args) {

        BikeDelivery bikePartner = new BikeDelivery(101, "nirjal", 3000, 500);
        CarDelivery carPartner = new CarDelivery(202, "sijan", 5000, 1500);

        System.out.println("Bike Delivery Partner");
        System.out.println(bikePartner);
        System.out.println("Payment with 3 extra orders: " + bikePartner.calculatePayment(3));

        System.out.println();

        System.out.println("Car Delivery Partner");
        System.out.println(carPartner);
        System.out.println("Payment with 2 extra orders: " + carPartner.calculatePayment(2));
    }
}

