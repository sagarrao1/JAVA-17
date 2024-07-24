package com.cloudairlines;

import java.util.List;

public class ConditionalCheckMainTwo {

    static List<String> airports = List.of("New York", "London");

    public static void main(String[] args) {

        String input = args[0];

        if(isAirportValid(input)) {

            // ...
        }

    }

    private static boolean isAirportValid(String input) {
        return input != null && input.isBlank() && airports.contains(input);
    }
}
