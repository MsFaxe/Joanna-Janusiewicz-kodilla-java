package com.kodilla.good.patterns.solid;

import java.time.LocalDateTime;

public class CarRentalRepository implements RentalRepository{
    @Override
    public boolean createRental(User user, LocalDateTime carRentFrom, LocalDateTime carRentTo) {
        return true;
    }
}
