package dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class HandlingRecurringEvents {

    public static void main(String[] args) {

        // Task - meeting every Friday. Print all meetings for the month

        LocalDate date = LocalDate.now();
        LocalDate startDate= date.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate endDate = date.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println("Start date " + startDate);
        System.out.println("End date " + endDate);

        LocalDate firstFriday = startDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));

        List<LocalDate> fridays = new ArrayList<>();
        while (firstFriday.isBefore(endDate) || firstFriday.isEqual(endDate)){
            fridays.add(firstFriday);
            firstFriday = firstFriday.plusWeeks(1);
        }

        System.out.printf("From %s to %s, Fridays will be on %s%n", startDate, endDate, fridays);

    }
}
