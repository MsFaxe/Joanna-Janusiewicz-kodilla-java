package com.kodilla.good.patterns.food2door;

import java.util.HashMap;

public class ExtraFoodShopOrderImplementation implements OrderImplementation {

    @Override
    public boolean process(Order order, HashMap <Product, AmountOfProduct> deliveredProducts) {
        CheckProductAvailability checkProductAvailability = new CheckProductAvailability();
        boolean productAvailable = checkProductAvailability.productAvailable(order, deliveredProducts);

        Payment payment = new Payment();

        if (productAvailable) {
            if (payment.paymentInAdvance() || payment.cashOnDelivery()){
                System.out.println("Purchased: " + order.getShoppingList());
            } else {
                System.out.println("Purchased: " + order.getShoppingList() + "You have not selected a payment. Payment will be on delivery");
            }
            return true;
        } else {
            System.out.println("Error!");
            return false;
        }
    }
}
