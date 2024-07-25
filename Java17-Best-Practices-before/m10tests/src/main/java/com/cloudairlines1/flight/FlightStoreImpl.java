package com.cloudairlines1.flight;

import com.cloudairlines1.airport.Airport;
import com.cloudairlines1.airport.AirportStore;
import java.util.List;

public class FlightStoreImpl implements FlightStore {

    public static final Airport NEW_YORK_JFK = new Airport("USA", "New York", "JFK", List.of(1, 2, 3));
    public static final Airport LONDON_GATWICK = new Airport("UK", "London", "Gatwick", List.of(1, 2, 3));
    public static final Airport PARIS_CDG = new Airport("France", "Paris", "Charles De Gaulle", List.of(1, 2));


    public List<Flight> getFlights() {

        return List.of(
                new Flight(AirportStore.LONDON_GATWICK, AirportStore.NEW_YORK_JFK, "2022-10-15"),
                new Flight(AirportStore.LONDON_GATWICK, AirportStore.NEW_YORK_JFK, "2022-11-15"),
                new Flight(AirportStore.LONDON_GATWICK, AirportStore.PARIS_CDG, "2022-11-20")
        );
    }
}
