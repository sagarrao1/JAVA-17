package com.cloudairlines;

import java.util.List;
import java.util.Objects;

public class FlightSearchService {

    private FlightStore flightStore;

//    constructor correct way so that code is testable by using dependency injection
//    by passing Flightstore implementation. testing code in FlightSearchServiceTest test2
    public FlightSearchService(FlightStore flightStore) {
        this.flightStore = Objects.requireNonNull(flightStore);
    }

//    constructor
    public FlightSearchService(){
        this.flightStore = new FlightStoreImpl();
    }

//    static method
    public static FlightSearchService newSearch(){
        return new FlightSearchService(new FlightStoreImpl());
    }

    public List<Flight> search(String fromDest, String toDest, String departDate){
        List<Flight> availableFlights = flightStore.getFlights();

        // we'll implement the search later

        System.out.println(availableFlights.size());
        return availableFlights;

    }
}
