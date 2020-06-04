package com.kodilla.good.patterns.solid;

import java.time.LocalDateTime;

public class RentalDto {
    private User user;
    private boolean isRented;

    public RentalDto(User user, boolean isRented) {
        this.user = user;
        this.isRented = isRented;
    }
}
