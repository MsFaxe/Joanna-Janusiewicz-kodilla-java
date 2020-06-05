package com.kodilla.good.patterns.food2door;

import java.util.HashMap;

public interface OrderImplementation {
    boolean process(Order order, HashMap <Product, AmountOfProduct> deliveredProducts);
}
