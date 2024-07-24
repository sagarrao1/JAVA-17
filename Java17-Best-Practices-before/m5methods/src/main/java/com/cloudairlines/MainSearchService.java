package com.cloudairlines;

import com.cloudairlines.flight.*;

import java.util.List;

public class MainSearchService {

    public static void main(String[] args) {
        String from = args[0];
        String to = args[1];
        String date = args[2];

        SearchRequest request = new SearchRequest(from, to, date);
        SearchRequest request2 = new SearchRequest(args);  // alternative to above

//        creating FlightSearch class using static method
        FlightSearch searchService = FlightSearch.newSearch();

        List<Flight> foundFlights = searchService.search(request);

//        List<Flight> foundFlights =
//                searchService.search("London", "New York", "2022-10-15");

    }
}
