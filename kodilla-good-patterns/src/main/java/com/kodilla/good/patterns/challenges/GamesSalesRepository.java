package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class GamesSalesRepository implements SaleRepository {

    @Override
    public boolean createSale(User user, LocalDateTime purchaseDate) {
        return true;
    }
}
