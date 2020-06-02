package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface SaleService {
    boolean sale(User user, LocalDateTime purchaseDate);
}
