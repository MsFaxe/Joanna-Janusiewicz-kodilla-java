package com.kodilla.good.patterns.flight_search_service;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FlightsService {

    private final FlightsSet flightsSet;

    public FlightsService() {
        flightsSet = new FlightsSet();
    }

    public ArrayList<Flight> searchFlightsFrom(String airport) {
        return (ArrayList<Flight>) flightsSet.getFlightsSet().stream()
                .filter(e -> e.getFlightFrom().getAirportName().equals(airport))
                .collect(Collectors.toList());
    }

    public ArrayList<Flight> searchFlightsTo(String airport) {
        return (ArrayList<Flight>) flightsSet.getFlightsSet().stream()
                .filter(e -> e.getFlightTo().getAirportName().equals(airport))
                .collect(Collectors.toList());
    }

    public ArrayList<Flight> searchFlightsFromAndThroughAndTo(String airportFrom, String airportThrough, String airportTo) {
        ArrayList<Flight> flightsThroughList = new ArrayList<>();
        flightsThroughList.addAll(flightsSet.getFlightsSet().stream()
                .filter(e -> e.getFlightFrom().getAirportName().equals(airportFrom))
                .filter(e -> e.getFlightTo().getAirportName().equals(airportThrough))
                .collect(Collectors.toList()));
        flightsThroughList.addAll(flightsSet.getFlightsSet().stream()
                .filter(e -> e.getFlightFrom().getAirportName().equals(airportThrough))
                .filter(e -> e.getFlightTo().getAirportName().equals(airportTo))
                .collect(Collectors.toList()));

        return flightsThroughList;
    }
}
