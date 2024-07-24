package com.cloudairlines;
public class Flight {

    private static final int DEFAULT_CAPACITY = 100;
    private String fromDest;
    private String toDest;
    private String date;
    int seatCapacity;

    public Flight(String fromDest, String toDest, String date) {
//        this.fromDest = fromDest;
//        this.toDest = toDest;
//        this.date = date;
        this(fromDest, toDest, date, DEFAULT_CAPACITY);
    }

    public Flight(String fromDest, String toDest, String date, int seatCapacity) {
        this.fromDest = fromDest;
        this.toDest = toDest;
        this.date = date;
        this.seatCapacity = seatCapacity;
    }

    public Flight(String fromCountry, String fromCity, String fromTerminal,
                  String toCountry, String toCity,String toterminal,
                  String date) {
      // set all fields
    }

    public Flight(Airport from,
                  Airport to,
                  String date) {
        // set all fields
        this.fromDest = from.getCity();
    }
}
