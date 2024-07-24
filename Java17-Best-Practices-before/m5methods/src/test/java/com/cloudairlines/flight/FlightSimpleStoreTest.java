package com.cloudairlines.flight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//    test block introduced in jdk 15

class FlightSimpleStoreTest {
//    @BeforeEach
//    void setUp() {
//    }
    @Test
    void testWithoutTextBlock() {
        String json = "[\n" +
                "  {\n" +
                "    \"from\":\"New York\",\n" +
                "    \"to\":\"London\",\n" +
                "    \"date\":\"2022-07-07\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"from\":\"Tokyo\",\n" +
                "    \"to\":\"Singapore\",\n" +
                "    \"date\":\"2022-07-10\"\n" +
                "  }\n" +
                "]";

        FlightSimpleStore flightStore = new FlightSimpleStore();
        List<Flight> flights = flightStore.getFlights(json);
        assertEquals(2, flights.size());
    }

    @Test
    void testWithTextBlock() {
        String json = """
                [
                  {
                    "from":"New York",
                    "to":"London",
                    "date":"2022-07-07"
                  },
                  {
                    "from":"Tokyo",
                    "to":"Singapore",
                    "date":"2022-07-10"
                  }
                ]
                """;

        FlightSimpleStore flightStore = new FlightSimpleStore();
        List<Flight> flights = flightStore.getFlights(json);
        assertEquals(2, flights.size());
    }
}