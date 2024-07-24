package com.cloudairlines.flight;


import com.cloudairlines.airport.Airport;
import com.cloudairlines.passenger.Passenger;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Flight {

    private Airport fromAirport;
    private Airport toAirport;

    @JsonProperty("from")
    private String fromCity;
    @JsonProperty("to")
    private String toCity;
    @JsonProperty("date")
    private LocalDate date;

    private int seatCapacity;
    private List<Passenger> passengerList;

    public Flight() {}
    public Flight(String fromCity, String toCity, String date) {
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.date = parseDate(date);
    }

    private LocalDate parseDate(String date) {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }


    public Flight(Airport fromAirport, Airport toAirport, String date, List<Passenger> passengerList) {
        this.fromAirport = fromAirport;
        this.fromCity = fromAirport.city();

        this.toAirport = toAirport;
        this.toCity = toAirport.city();

        this.date = parseDate(date);
        this.passengerList = passengerList;
        this.seatCapacity = 150;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public String getFromCity() {
        return fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "fromCity='" + fromCity + '\'' +
                ", toCity='" + toCity + '\'' +
                ", date=" + date +
                '}';
    }
}
