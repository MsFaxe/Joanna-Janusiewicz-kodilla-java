package com.kodilla.good.patterns.food2door;

import java.util.HashMap;

public class ProductsMap {
    private final HashMap<Product, AmountOfProduct> amountOfProduct = new HashMap<>();

    public void addProductsToMap(String product, int amount) {
        amountOfProduct.put(new Product(product), new AmountOfProduct(amount));
    }

    public HashMap<Product, AmountOfProduct> getAmountOfProduct() {
        return amountOfProduct;
    }
}
