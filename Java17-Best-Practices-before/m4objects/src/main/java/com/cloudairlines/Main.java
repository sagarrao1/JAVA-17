package com.cloudairlines;

import java.util.List;

public class Main {

    public static void main(String[] args) {

//        1st way
        FlightSearchService searchService = new FlightSearchService();
        List<Flight> foundFlights = searchService.search("f", "", "ff");
        foundFlights.forEach(System.out::println);

//        2nd way
        FlightSearchService searchService1 = FlightSearchService.newSearch();
        List<Flight> foundFlights1 = searchService1.search("f", "f", "f");// not using these values
        foundFlights1.forEach(System.out::println);

    }
}
