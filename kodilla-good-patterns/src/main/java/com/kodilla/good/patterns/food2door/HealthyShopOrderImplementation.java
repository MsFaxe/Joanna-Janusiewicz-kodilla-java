package com.kodilla.good.patterns.food2door;

import java.util.HashMap;

public class HealthyShopOrderImplementation implements OrderImplementation{

    @Override
    public boolean process(Order order, HashMap <Product, AmountOfProduct> deliveredProducts) {
        CheckProductAvailability checkProductAvailability = new CheckProductAvailability();
        boolean productAvailable = checkProductAvailability.productAvailable(order, deliveredProducts);

        Payment payment = new Payment();
        boolean paymentInAdvance = payment.paymentInAdvance();
        boolean cashOnDelivery = payment.cashOnDelivery();

        if (productAvailable) {
            if (paymentInAdvance) {
                System.out.println("Purchased: " + order.getShoppingList() + ", payment in advance");
                return true;
            } else if (cashOnDelivery){
                System.out.println("Purchased: " + order.getShoppingList() + ", cash on delivery");
                return true;
            } else {
                System.out.println("choose your payment method");
                return false;
            }
        } else {
            System.out.println("Error! Product unavailable");
            return false;
        }
    }
}
