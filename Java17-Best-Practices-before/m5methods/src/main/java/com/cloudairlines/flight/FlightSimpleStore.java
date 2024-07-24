package com.cloudairlines.flight;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class FlightSimpleStore {
    public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public List<Flight> getFlights(String json){
        List<Flight> flights = null;
        try {
            flights = OBJECT_MAPPER.readValue(json, new TypeReference<>() {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flights;
    }
}
