package com.kodilla.good.patterns.flight_search_service;

import java.util.ArrayList;

public class ListOfSearchedFlights {
    private final ArrayList<Flight> flightsList;

    public ListOfSearchedFlights(ArrayList<Flight> flightsList) {
        this.flightsList = flightsList;
    }

    public void showFlightsList() {
        System.out.println("List of flights: ");
        System.out.println(flightsList);
    }
}
