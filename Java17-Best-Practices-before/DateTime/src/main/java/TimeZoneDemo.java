import java.time.ZoneId;

public class TimeZoneDemo {

    public static void main(String[] args) {

        ZoneId systemDefault = ZoneId.systemDefault();
//        System.out.println(systemDefault);

        ZoneId zoneId = ZoneId.of("Europe/Athens");
        System.out.println(zoneId.getRules());

        zoneId.getRules().getTransitionRules().forEach(System.out::println);


    }
}
