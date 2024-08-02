package numbers;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramDemo {

    public static void main(String[] args) {

//        var locale = Locale.forLanguageTag(args[0]);
//        var style = NumberFormat.Style.valueOf(args[1]);

        List<String> nums = List.of("37000000", "20000000", "11000000");
        // [37 Millionen, 20 Millionen, 11 Millionen]

        var formatter = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.LONG);

        List<String> formattedNums= nums.stream()
                .map(i -> Integer.parseInt(i))
//                .map(Integer ::parseInt) // both parseInt same
                .map(formatter::format)
                .toList();
        System.out.println(formattedNums);

        List<String> formatted2 = new ArrayList<>();
//        StringBuilder stringBuilder = new StringBuilder();
        for (String num : nums) {
            int i = Integer.parseInt(num);
            formatted2.add(formatter.format(i));
//            stringBuilder.append(formatter.format(i));
        }

        formatted2.forEach(System.out::println);
//        System.out.println(stringBuilder.toString());
    }
}
