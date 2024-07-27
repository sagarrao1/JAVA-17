import java.time.Clock;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Calendar;

public class ScheduleDemo {

    public static void main(String[] args) {
        Clock testClock = Clock.fixed(Instant.EPOCH, ZoneOffset.UTC);
        System.out.println(testClock);

        // create a calendar
        Calendar calendar = Calendar.getInstance();


        // add some tasks to the calendar


        // add some work periods to the calendar
        // add an event to the calendar
        // create a working schedule
        // and print it out

    }
}
