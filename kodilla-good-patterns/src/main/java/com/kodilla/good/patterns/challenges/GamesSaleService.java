package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class GamesSaleService implements SaleService{
    @Override
    public boolean sale(User user, LocalDateTime purchaseDate) {
        System.out.println("Purchased!");
        System.out.println("Game: abc \nuser: " + user.toString());
        return true;
    }
}
