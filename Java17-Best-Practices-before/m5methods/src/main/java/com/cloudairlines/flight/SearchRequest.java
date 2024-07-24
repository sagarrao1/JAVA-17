package com.cloudairlines.flight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class SearchRequest {
    private String from;
    private String to;
    private LocalDate date;

//    constructor that accepts single array. only if you order is guaranteed
    public SearchRequest(String[] args) {
        this.from = args[0];
        this.to = args[1];
        this.date = parseDate(args[2]);
    }

    public SearchRequest(String from, String to, String date) {
//        you can add fail fast validation here like below
        this.from = Objects.requireNonNull(from);
        this.to = Objects.requireNonNull(to);;
        this.date = parseDate(date);
    }

    private LocalDate parseDate(String date) {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public LocalDate getDate() {
        return date;
    }
}
