package com.cloudairlines;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;


public class FlightSearchServiceTest {

    @Test
    public void quickFlightSearchTest() {
        var search = new FlightSearchService();
        List<Flight> flights = search.search("London", "Paris", "2022-07-22");
//         assert things
        Assertions.assertEquals(8,flights.size());
    }

    @Test
    public void quickFlightSearchTest2(){
        var search = new FlightSearchService(new FlightStoreImplTest());
        List<Flight> flights= search.search("London", "New York", "2022-10-15");

        Assertions.assertEquals(2,flights.size());
    }
}
