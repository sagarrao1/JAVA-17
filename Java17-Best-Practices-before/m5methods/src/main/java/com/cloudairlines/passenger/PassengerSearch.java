package com.cloudairlines.passenger;

import com.cloudairlines.flight.Flight;

import java.util.ArrayList;
import java.util.List;

public class PassengerSearch {

    public List<Passenger> findEconomyPassengers(Flight flight , boolean economy){
        List<Passenger> foundPassengers = new ArrayList<>();

        List<Passenger> passengerList = flight.getPassengerList();
        for (Passenger passenger : passengerList) {
            if (economy) {
                if (passenger.getSeatClass().equals(SeatClass.ECONOMY)) {
                    foundPassengers.add(passenger);
                }
            } else {
                if (!passenger.getSeatClass().equals(SeatClass.ECONOMY)){
                    foundPassengers.add(passenger);
                }
            }
        }

        return foundPassengers;
    }

//    clean approach for above method
    public List<Passenger> findPassengersBySeatClass(Flight flight , SeatClass seatClass){
        List<Passenger> foundPassengers = new ArrayList<>();

        List<Passenger> passengerList = flight.getPassengerList();
        for (Passenger passenger : passengerList) {
                if (passenger.getSeatClass().equals(seatClass)) {
                    foundPassengers.add(passenger);
                }
        }

        return foundPassengers;
    }
}
