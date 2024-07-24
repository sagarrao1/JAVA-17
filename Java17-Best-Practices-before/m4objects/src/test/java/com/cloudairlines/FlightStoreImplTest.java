package com.cloudairlines;

import java.util.List;

public class FlightStoreImplTest implements FlightStore{
    @Override
    public List<Flight> getFlights() {

        return List.of(
                // ISO 8601 format YYYY-MM-DD
                new Flight("London", "New York", "2022-10-15"),
                new Flight("Frankfurt", "Moscow", "2023-03-10")
        );
    }
}
