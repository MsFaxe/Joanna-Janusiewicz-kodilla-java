package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface SaleRepository {
    boolean createSale(User user, LocalDateTime purchaseDate);
}
