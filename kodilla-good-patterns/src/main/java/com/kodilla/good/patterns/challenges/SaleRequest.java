package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class SaleRequest {
    private User user;
    private LocalDateTime purchasesDate;

    public SaleRequest(User user, LocalDateTime purchasesDate) {
        this.user = user;
        this.purchasesDate = purchasesDate;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getPurchasesDate() {
        return purchasesDate;
    }
}
