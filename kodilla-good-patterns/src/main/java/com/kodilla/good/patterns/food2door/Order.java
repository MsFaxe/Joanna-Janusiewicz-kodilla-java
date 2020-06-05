package com.kodilla.good.patterns.food2door;

import java.util.HashMap;

public class Order {
    private final HashMap<Product, AmountOfProduct> shoppingList;

    public Order(HashMap<Product, AmountOfProduct> shoppingList) {
        this.shoppingList = shoppingList;
    }

    public HashMap<Product, AmountOfProduct> getShoppingList() {
        return shoppingList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "shoppingList=" + shoppingList +
                '}';
    }
}
