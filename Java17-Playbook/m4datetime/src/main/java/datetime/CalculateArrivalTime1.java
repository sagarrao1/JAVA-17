package datetime;

import java.time.*;

public class CalculateArrivalTime1 {
    public static void main(String[] args) {
        LocalDateTime departure = LocalDateTime.of(2002, Month.JULY, 22, 7, 0);
        LocalDateTime arrival = departure.plusHours(8);

        ZonedDateTime departureLondonPerspective = departure.atZone(ZoneId.of("Europe/London"));
        ZonedDateTime arrivalLondonPerspective = arrival.atZone(ZoneId.of("Europe/London"));
        System.out.println(departureLondonPerspective);
        System.out.println(arrivalLondonPerspective);

//        same alternative to above
        var alternative = ZonedDateTime.of(departure,ZoneId.of("Europe/London"));

        ZonedDateTime departureNYPerspective = departureLondonPerspective.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime arrivalNYPerspective = arrivalLondonPerspective.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(departureNYPerspective);
        System.out.println(arrivalNYPerspective);

    }
}
