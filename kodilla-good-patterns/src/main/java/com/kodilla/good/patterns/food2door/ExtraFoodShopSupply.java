package com.kodilla.good.patterns.food2door;

import java.util.HashMap;

public class ExtraFoodShopSupply implements SupplyFromTheProducer {

    private HashMap<Product, AmountOfProduct> deliveredProducts;

    @Override
    public void amountOfProducts() {

        ProductsMap productsMap = new ProductsMap();
        productsMap.addProductsToMap("strawberry", 10000);
        productsMap.addProductsToMap("cherry", 35000);

        this.deliveredProducts = productsMap.getAmountOfProduct();
    }

    public HashMap<Product, AmountOfProduct> getDeliveredProducts() {
        return deliveredProducts;
    }
}
