package com.cloudairlines;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Objects;

import static java.time.format.DateTimeFormatter.*;

public class SearchRequest {

    private static final String DATE_FORMAT = "yyyy-MM-dd";
    private String from;
    private String to;
    private LocalDate date;


    public SearchRequest(String[] args) {
//        this(args[0], args[1], args[2]);
        if (args.length != 3) {
            throw new IllegalArgumentException(
                    String.format("you must pass 3 arguments, but you passed %s arguments", args.length));
        }
        new SearchRequest(args[0], args[1], args[2]);
    }


    public SearchRequest(String from, String to, String date) {
        this.from = Objects.requireNonNull(from);
        this.to = Objects.requireNonNull(to);
//        System.out.println("Constructor");
        this.date = parseDate(date);
    }

    private LocalDate parseDate(String departDate) {
        LocalDate date;
        try {
            date = LocalDate.parse(departDate, ofPattern(DATE_FORMAT));
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException(
                    String.format("Failed to parse input %s, valid date format is "+DATE_FORMAT , departDate));
        }
        return date;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    /**
     * @return the date of the Search Request
     */
    public LocalDate getDate() {
        return date;
    }
}
