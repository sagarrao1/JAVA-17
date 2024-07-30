import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;

public class DateTimeFormatterDemo {

    public static void main(String[] args) {

        TemporalAccessor temporalAccessor = DateTimeFormatter.ISO_LOCAL_DATE.parse("2022-03-02");
        System.out.println("temporalAccessor :" +temporalAccessor);
        LocalDate localDate = LocalDate.from(temporalAccessor);
        System.out.println("localDate :"+localDate);

        TemporalAccessor temporalAccessor1 = DateTimeFormatter.ISO_LOCAL_DATE_TIME.parse("2022-03-02T10:15:30");
        LocalDateTime localDateTime = LocalDateTime.from(temporalAccessor1);
        System.out.println("localDateTime :"+localDateTime);

        String format = DateTimeFormatter.ISO_LOCAL_DATE.format(localDateTime);
        System.out.println("format : "+format);


//        Predefined format style
        String style = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(temporalAccessor1);
        System.out.println("style: "+style);

        // different style date and time
        String style1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.MEDIUM).format(temporalAccessor1);
        System.out.println("style1: "+style1);

//        wil Local style
        String style2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM)
                .withLocale(Locale.FRANCE).format(temporalAccessor1);
        System.out.println("style2: "+style2);

//        Using custom pattern
        System.out.println(DateTimeFormatter.ofPattern("E").format(localDateTime));
        System.out.println(DateTimeFormatter.ofPattern("EEEE").format(localDateTime));

        //adding optional seconds like this
        TemporalAccessor pattern = DateTimeFormatter.ofPattern("HH':'mm").parse("13:16");
        System.out.println("pattern : "+pattern);
        LocalTime time = LocalTime.from(pattern);
        System.out.println("time:"+ time);

        TemporalAccessor pattern1 = DateTimeFormatter.ofPattern("HH':'mm[':'ss]").parse("13:16:12");
        System.out.println("pattern1 : "+pattern1);

        TemporalAccessor pattern2 = DateTimeFormatter.ofPattern("HH':'mm[':'ss]").parse("13:16");
        System.out.println("pattern1 : "+pattern2);

        TemporalAccessor pattern3 = DateTimeFormatter.ofPattern("HH':'mm[':'ss[':'nnnnn]]").parse("13:16:12:00865");
        System.out.println("pattern1 : "+pattern3);

        TemporalAccessor pattern4 = DateTimeFormatter.ofPattern("uuuu MM dd").parse("2022 03 21");
        System.out.println("pattern4 : "+pattern4);

//      Converting Java.time to legacy Java.Util.* and Java.sql.* converting methods are added to Util and sql classes not
//        to time class for clear way like sometime they they will go away
//        .from or .valuesOf are used to convert from java.time to legacy dates
//        .toLocalDate are used to convert from  legacy dates to java.time to
//        Java.Util.Date.from();
//        LocalDate localDate1 = Java.sql.Date.toLocalDate();
        LocalDate localDate3 = LocalDate.now();
        Date sqlDate = Date.valueOf(localDate3);
        System.out.println("sqlDate:"+sqlDate);


    }
}
