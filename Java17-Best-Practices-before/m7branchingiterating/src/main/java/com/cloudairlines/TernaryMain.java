package com.cloudairlines;

import java.util.stream.IntStream;

public class TernaryMain {

    public static void main(String[] args) {

        int maxSeats = 150;
        long passengerCount = IntStream.rangeClosed(1, 151)
                .mapToObj(i -> new Passenger(i))
                .count();

        if(passengerCount > maxSeats) {
            System.out.println("Flight overbooked");
        } else {
            System.out.println("Flight not overbooked");
        }

//        better use ternary to reduce above if to reduce few lines of code
        String message = passengerCount <= maxSeats ? "Flight not overbooked" : "Flight overbooked";
        System.out.println(message);

    }

    public static class Passenger {
        int id;
        public Passenger(int id) {
            this.id = id;
        }
    }
}
