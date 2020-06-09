package com.kodilla.good.patterns.flight_search_service;

public class Flight {

    private final int numberOfFlight;
    private final Airport flightFrom;
    private final Airport flightTo;

    public Flight(int numberOfFlight, Airport flightFrom, Airport flightTo) {
        this.numberOfFlight = numberOfFlight;
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
    }

    public Airport getFlightFrom() {
        return flightFrom;
    }

    public Airport getFlightTo() {
        return flightTo;
    }

    @Override
    public String toString() {
        return "Flight {" +
                "number: " + numberOfFlight +
                ", from = " + flightFrom +
                ", to = " + flightTo +
                '}';
    }
}

