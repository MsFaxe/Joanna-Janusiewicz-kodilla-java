package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class SaleRequestRetriever {
    public SaleRequest retrive(){
        User user = new User("xyz", "abc");

        LocalDateTime purchasesDate = LocalDateTime.of(2020, 5, 29, 12 ,0);

        return new SaleRequest(user, purchasesDate);
    }
}
