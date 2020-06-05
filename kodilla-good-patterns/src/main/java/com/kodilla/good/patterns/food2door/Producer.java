package com.kodilla.good.patterns.food2door;

import java.util.HashMap;

public class Producer {

    private final NipAndRegon nipAndRegon;
    private final String name;
    private final SupplyFromTheProducer supplyFromTheProducer;
    private final OrderImplementation orderImplementation;

    public Producer(NipAndRegon nipAndRegon, String name, SupplyFromTheProducer supplyFromTheProducer, OrderImplementation orderImplementation) {
        this.nipAndRegon = nipAndRegon;
        this.name = name;
        this.supplyFromTheProducer = supplyFromTheProducer;
        this.orderImplementation = orderImplementation;
    }

    public String getName() {
        return name;
    }

    public SupplyFromTheProducer getSupplyFromTheProducer() {
        return supplyFromTheProducer;
    }

    public OrderImplementation getOrderImplementation() {
        return orderImplementation;
    }

    public void loadProducts(SupplyFromTheProducer supplyFromTheProducer){
        supplyFromTheProducer.amountOfProducts();
    }

    public void loadImplementation(OrderImplementation orderImplementation, Order order, HashMap<Product, AmountOfProduct> deliveredProducts){
        orderImplementation.process(order, deliveredProducts);
    }

}
