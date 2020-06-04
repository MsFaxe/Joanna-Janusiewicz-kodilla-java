package com.kodilla.good.patterns.solid;

import java.time.LocalDateTime;

public class RentRequestRetriever {

    public RentRequest retrive() {
        User user = new User("Adam", "Kowalski");

        LocalDateTime rentFrom = LocalDateTime.of(2017, 8, 1, 12, 0);
        LocalDateTime rentTo = LocalDateTime.of(2017, 8, 10, 12, 0);

        return new RentRequest(user, rentFrom, rentTo);
    }
}
