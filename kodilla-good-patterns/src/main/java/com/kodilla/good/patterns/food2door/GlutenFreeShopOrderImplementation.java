package com.kodilla.good.patterns.food2door;

import java.util.HashMap;

public class GlutenFreeShopOrderImplementation implements OrderImplementation{

    @Override
    public boolean process(Order order, HashMap <Product, AmountOfProduct> deliveredProducts) {
        Payment payment = new Payment();
        boolean paymentInAdvance = payment.paymentInAdvance();

        if (paymentInAdvance) {
            CheckProductAvailability checkProductAvailability = new CheckProductAvailability();
            boolean productAvailable = checkProductAvailability.productAvailable(order, deliveredProducts);
            if (productAvailable) {
                System.out.println("Purchased: " + order.getShoppingList());
                return true;
            } else {
                System.out.println("Error! Product unavailable");
                return false;
            }
        } else {
            System.out.println("Error! Payment method only in advance");
            return false;
        }
    }
}
