package com.kodilla.good.patterns.flight_search_service;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        FlightsService flightsService = new FlightsService();
        ListOfSearchedFlights flightsListFrom =
                new ListOfSearchedFlights(flightsService.searchFlightsFrom("Kraków"));
        flightsListFrom.showFlightsList();

        ListOfSearchedFlights flightsListTo =
                new ListOfSearchedFlights(flightsService.searchFlightsTo("Warszawa"));
        flightsListTo.showFlightsList();

        ListOfSearchedFlights flightsListFromThroughTo =
                new ListOfSearchedFlights(flightsService
                        .searchFlightsFromAndThroughAndTo("Kraków", "Gdańsk", "Warszawa"));
        flightsListFromThroughTo.showFlightsList();
    }
}
