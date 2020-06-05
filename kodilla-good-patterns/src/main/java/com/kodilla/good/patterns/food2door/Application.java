package com.kodilla.good.patterns.food2door;

public class Application {
    public static void main (String[] args) {
        ProducersList producersList = new ProducersList();
        producersList.revealProducersMap();

        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();


        Producer extraFoodShop = producersList.getProducer("ExtraFoodShop");

        SupplyFromTheProducer extraFoodShopSupply = extraFoodShop.getSupplyFromTheProducer();
        OrderImplementation extraFoodShopOrderImplementation = extraFoodShop.getOrderImplementation();

        extraFoodShop.loadProducts(extraFoodShopSupply);
        extraFoodShop.loadImplementation(extraFoodShopOrderImplementation, order, extraFoodShopSupply.getDeliveredProducts());


        Producer healthyShop = producersList.getProducer("HealthyShop");

        SupplyFromTheProducer healthyShopSupply = healthyShop.getSupplyFromTheProducer();
        OrderImplementation healthyShopOrderImplementation = healthyShop.getOrderImplementation();

        healthyShop.loadProducts(healthyShopSupply);
        healthyShop.loadImplementation(healthyShopOrderImplementation, order, healthyShopSupply.getDeliveredProducts());

    }
}
