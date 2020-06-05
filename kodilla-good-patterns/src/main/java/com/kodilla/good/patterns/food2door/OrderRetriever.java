package com.kodilla.good.patterns.food2door;

public class OrderRetriever {

    public Order retrieve() {
        ProductsMap productsMap = new ProductsMap();
        productsMap.addProductsToMap("strawberry", 100);
        productsMap.addProductsToMap("milk", 20);

        return new Order(productsMap.getAmountOfProduct());
    }
}
