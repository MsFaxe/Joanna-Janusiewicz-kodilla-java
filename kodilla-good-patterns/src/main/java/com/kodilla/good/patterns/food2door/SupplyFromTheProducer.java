package com.kodilla.good.patterns.food2door;

import java.util.HashMap;

public interface SupplyFromTheProducer {
    void amountOfProducts();
    HashMap<Product, AmountOfProduct> getDeliveredProducts();
}
