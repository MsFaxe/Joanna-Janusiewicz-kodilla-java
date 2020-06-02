package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface SaleRepository {
    SaleRepository createRental(User user, LocalDateTime purchaseDate);
}
