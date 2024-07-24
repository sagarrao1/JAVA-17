package com.cloudairlines.flight;

import com.cloudairlines.passenger.SearchRequest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class FlightSearch {

    private FlightStore flightStore;

    public FlightSearch(FlightStore store) {
        this.flightStore = Objects.requireNonNull(store);
    }

    public static FlightSearch newSearch() {
        return new FlightSearch(new FlightStoreImpl());
    }

    public List<Flight> search(String from, String to, String date) {
        if (from == null || to == null || date == null) {
            throw new IllegalArgumentException(
                    String.format("Input must be non null and valid. you have provided " +
                            "From:%s, To:%s, date:%s ", from, to, date));
        }
        return Collections.emptyList();
    }

    public List<Flight> search(SearchRequest request) {

        if (request == null) {
            throw new IllegalArgumentException("Request cannot be null");
        }

        List<Flight> availableFlights = flightStore.getFlights();

        String from = request.getFrom();
        String to = request.getTo();
        LocalDate date = request.getDate();

        List<Flight> foundFlights = new ArrayList<>();

//        for (Flight flight : availableFlights) {
////            System.out.println(flight);
//                if(flight.getFromCity().equals(from)  &&
//                     flight.getToCity().equals(to) &&
//                        flight.getDate().equals(date)
//                   ) {
//                    foundFlights.add(flight);
//                }
//        }
//        return foundFlights;

//   above for loop filter Using streams
        return availableFlights.stream()
                .filter(f -> f.getFromCity().equals(from))
                .filter(f -> f.getToCity().equals(to))
                .filter(f -> f.getDate().equals(date))
                .toList();
    }
}