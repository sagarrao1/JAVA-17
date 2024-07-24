package com.cloudairlines;

import com.cloudairlines.flight.Flight;
import com.cloudairlines.flight.FlightStoreImpl;
import com.cloudairlines.passenger.Passenger;
import com.cloudairlines.passenger.PassengerSearch;
import com.cloudairlines.passenger.SeatClass;

public class MainFlagArgument {
    public static void main(String[] args) {
        Flight flight = new FlightStoreImpl().getFlights().get(0);
        PassengerSearch paxSearch = new PassengerSearch();

        System.out.println("====== Economy ======");
//        List<Passenger> economyPassengers = paxSearch.findEconomyPassengers(flight, true);
//        for (Passenger economyPassenger : economyPassengers) {
//            System.out.println(economyPassenger);
//        }

//        Alternative to above. short form using streams
        paxSearch.
                findEconomyPassengers(flight, true )
                .forEach(System.out::println);

        System.out.println("====== Non Economy ======");
        paxSearch.
                findEconomyPassengers(flight, false )
                .forEach(System.out::println);

        System.out.println("====== Cleaner approach for using findPassengersBySeat instead of boolean as argmnt ======");
        System.out.println("====== Economy ======");
//        List<Passenger> economyPassengers = paxSearch.findPassengersBySeatClass(flight, SeatClass.ECONOMY);
//        for (Passenger economyPassenger : economyPassengers) {
//            System.out.println(economyPassenger);
//        }

//        Alternative to above. short form using streams
        paxSearch
                .findPassengersBySeatClass(flight, SeatClass.ECONOMY )
                .forEach(System.out::println);
//
        System.out.println("====== Business class ======");
        paxSearch.
                findPassengersBySeatClass(flight, SeatClass.BUSINESS)
                .forEach(System.out::println);
    }
}
