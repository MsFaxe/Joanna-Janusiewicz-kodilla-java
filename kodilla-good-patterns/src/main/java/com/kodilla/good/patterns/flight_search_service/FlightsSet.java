package com.kodilla.good.patterns.flight_search_service;

import java.util.HashMap;
import java.util.HashSet;

public class FlightsSet {

    private final HashSet<Flight> flightsSet = new HashSet<>();

    public FlightsSet() {
        AirportsSet airportsSet = new AirportsSet();

        flightsSet.add(new Flight(new NumberOfFlightGenerator().getNumberOfFlight(),
                airportsSet.getAirport("Kraków"),
                        airportsSet.getAirport("Gdańsk")));
        flightsSet.add(new Flight(new NumberOfFlightGenerator().getNumberOfFlight(),
                airportsSet.getAirport("Gdańsk"),
                        airportsSet.getAirport("Warszawa")));
    }

    public HashSet<Flight> getFlightsSet() {
        return flightsSet;
    }
}
