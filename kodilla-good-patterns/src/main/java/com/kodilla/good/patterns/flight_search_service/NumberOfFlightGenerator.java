package com.kodilla.good.patterns.flight_search_service;

import java.util.Objects;
import java.util.Random;

public class NumberOfFlightGenerator {
    private final int numberOfFlight;

    public NumberOfFlightGenerator() {
        Random generator = new Random();
        this.numberOfFlight = generator.nextInt(100);
    }

    public int getNumberOfFlight() {
        return numberOfFlight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberOfFlightGenerator that = (NumberOfFlightGenerator) o;
        return numberOfFlight == that.numberOfFlight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfFlight);
    }
}
