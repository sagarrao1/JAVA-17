import java.time.*;

public class DateTimeDemo {

    public static void main(String[] args) {

//        The new API has many different time representations, each suitable for different use cases:
//
//        Instant – represents a point in time (timestamp)
//        LocalDate – represents a date (year, month, day)
//        LocalDateTime – same as LocalDate, but includes time with nanosecond precision
//        OffsetDateTime – same as LocalDateTime, but with time zone offset
//        LocalTime – time with nanosecond precision and without date information
//        ZonedDateTime – same as OffsetDateTime, but includes a time zone ID
//        OffsetLocalTime – same as LocalTime, but with time zone offset
//        MonthDay – month and day, without year or time
//        YearMonth – month and year, without day or time
//        Duration – amount of time represented in seconds, minutes and hours. Has nanosecond precision
//        Period – amount of time represented in days, months and years

        Instant instant = Instant.now();
        System.out.println("instant: "+instant);


//      LocalDate with date and without time and zone
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate :"+localDate);

//      LocalTime with time and without date and zone
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime :"+localTime);

//      LocalDateTime with date and time without zone
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime:"+localDateTime);

//        OffsetDateTime is Date, Time, Offset
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println("offsetDateTime:"+offsetDateTime);

//        ZonedDateTime with Date, Time and Zone offset
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime:"+zonedDateTime);

    }
}
