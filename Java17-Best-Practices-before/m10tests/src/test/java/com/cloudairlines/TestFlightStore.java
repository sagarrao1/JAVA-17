package com.cloudairlines;

import com.cloudairlines.airport.AirportStore;
import com.cloudairlines.flight.Flight;
import com.cloudairlines.flight.FlightStore;

import java.util.List;

public class TestFlightStore implements FlightStore {

    @Override
    public List<com.cloudairlines.flight.Flight> getFlights() {
        return List.of(
                new Flight(AirportStore.LONDON_GATWICK, AirportStore.NEW_YORK_JFK, "2022-10-15"),
                new Flight(AirportStore.LONDON_GATWICK, AirportStore.NEW_YORK_JFK, "2022-11-15"),
                new Flight(AirportStore.LONDON_GATWICK, AirportStore.PARIS_CDG, "2022-11-20")

        );
    }
}
