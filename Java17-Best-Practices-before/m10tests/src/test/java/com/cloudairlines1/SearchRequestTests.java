package com.cloudairlines1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.cloudairlines1.flight.*;

public class SearchRequestTests {

    @Test
    @DisplayName("Search rejects if from, to city is same")
    public void sameFromToCityNotAllowed() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new SearchRequest("London", "London", "2022-07-15"));
    }

    //    Writing message in test example
    @Test
    public void searchReturnsCorrectNumberOfFlights() {
        SearchRequest request = new SearchRequest("London", "New York", "2022-10-16");
        var flightSearch = new FlightSearch(new TestFlightStore());

        var foundFlights = flightSearch.search(request);

//        change 0 to 1 to see message
        Assertions.assertEquals(0, foundFlights.size(),
                " Test data contains multiple flights London to New york." +
                        " Search should provide exactly one flight for given unique date");
    }
}
