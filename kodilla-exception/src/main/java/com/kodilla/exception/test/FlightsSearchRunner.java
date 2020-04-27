package com.kodilla.exception.test;

public class FlightsSearchRunner {
    public static void main(String[] args){
        FlightsSearch flightsSearch = new FlightsSearch();

        Flight flight1 = new Flight("LHR", "AMS");
        Flight flight2 = new Flight("LHR", "XYZ");
        Flight flight3 = new Flight("AMS", "LHR");

        try {
            flightsSearch.findFilght(flight1);
            flightsSearch.findFilght(flight3);
            flightsSearch.findFilght(flight2);
        } catch (RouteNotFoundException e){
            System.out.println("Exception: " + e);
        }
    }
}
