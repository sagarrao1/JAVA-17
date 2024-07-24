package com.cloudairlines;


import java.util.Objects;

public class RecordDemo {

    public static void main(String[] args) {
        var flight = new Flight("London", "", "2024-07-16");
        System.out.println(flight.from()+"  "+ flight.to());
    }

    public record Flight(String from, String to, String date) {

        public Flight {
            Objects.requireNonNull(from);
            Objects.requireNonNull(to);
        }

    }
}
