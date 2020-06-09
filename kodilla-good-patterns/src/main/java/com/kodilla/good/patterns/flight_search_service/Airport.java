package com.kodilla.good.patterns.flight_search_service;

public class Airport {

    private final AirportCode code;
    private final String airportName;

    public Airport(AirportCode code, String airportName) {
        this.code = code;
        this.airportName = airportName;
    }

    public String getAirportName() {
        return airportName;
    }

    @Override
    public String toString() {
        return "Airport {'"  + code +
                "', " + airportName + '}';
    }
}
