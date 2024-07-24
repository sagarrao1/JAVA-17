package com.cloudairlines;

import java.time.LocalDateTime;

public class ConditionalCheckMain {

    public static void main(String[] args) {

        int hour = LocalDateTime.now().getHour();

        if(isDay(hour)) {
            // display day shift flights
            System.out.println("isDay "+true);
        } else {
            // display night shift flights
        }
    }

    private static boolean isDay(int hour) {
        return hour > 6 && hour < 22;
    }
}
