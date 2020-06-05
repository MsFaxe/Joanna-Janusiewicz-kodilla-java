package com.kodilla.good.patterns.food2door;

public class AmountOfProduct {
    private final int amountOfProduct;

    public AmountOfProduct(int amountOfProduct) {
        this.amountOfProduct = amountOfProduct;
    }

    @Override
    public String toString() {
        return Integer.toString(amountOfProduct);
    }
}
