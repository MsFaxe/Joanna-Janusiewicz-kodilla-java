package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightsSearch {
    public void findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightsMap = new HashMap<>();
        flightsMap.put("LHR", true); //London - Heathrow Airport
        flightsMap.put("CDG", true); //Paris - Charles de Gaulle Airport
        flightsMap.put("AMS", false); //Amsterdam - Amsterdam Airport Schiphol
        flightsMap.put("FRA", true); //Frankfurt am Main Airport
        flightsMap.put("MAD", false); //Madrid - Adolfo Suárez Madrid–Barajas Airport
        flightsMap.put("BCN", true); //Barcelona - Barcelona–El Prat Josep Tarradellas Airport


        if (flightsMap.get(flight.getArrivalAirport()) != null) {
            System.out.println("Airport is open: " + flightsMap.get(flight.getArrivalAirport()));
        } else throw new RouteNotFoundException();
    }
}
