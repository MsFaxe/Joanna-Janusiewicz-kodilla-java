package com.kodilla.good.patterns.flight_search_service;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class AirportsSet {

    private final HashSet<Airport> airportSet;

    public AirportsSet() {
        airportSet = new HashSet<>();
        airportSet.add(new Airport(new AirportCode("KRK"), "Kraków"));
        airportSet.add(new Airport(new AirportCode("POZ"), "Poznań"));
        airportSet.add(new Airport(new AirportCode("WRO"), "Wrocław"));
        airportSet.add(new Airport(new AirportCode("WAW"), "Warszawa"));
        airportSet.add(new Airport(new AirportCode("KTW"), "Katowice"));
        airportSet.add(new Airport(new AirportCode("GDN"), "Gdańsk"));
    }

    public Airport getAirport(String airportName) {
        return airportSet.stream()
                .filter(e -> e.getAirportName().equals(airportName))
                .findAny().get();
        // zamiast collect(Collectors.toList()).get(0);
    }
}
