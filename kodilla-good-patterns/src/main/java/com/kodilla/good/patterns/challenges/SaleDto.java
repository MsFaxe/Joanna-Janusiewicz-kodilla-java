package com.kodilla.good.patterns.challenges;

public class SaleDto {
    public User user;
    public boolean productAvailable;

    public SaleDto(User user, boolean productAvailable) {
        this.user = user;
        this.productAvailable = productAvailable;
    }

    public User getUser() {
        return user;
    }

    public boolean isProductAvailable() {
        return productAvailable;
    }
}
