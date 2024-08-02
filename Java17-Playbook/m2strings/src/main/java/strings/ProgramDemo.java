package strings;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ProgramDemo {

    static String text = """
            Tokyo,    37000000
            New York, 20_000_000
            Paris,    11.000.000
            """;
    public static void main(String[] args) {

//        1. Normal way
        List<String> populations = new ArrayList<>();
        String[] lines = text.split("\n");
        for (String line : lines) {
            String split = line.split(",")[1];  // will get index 1 into split , index 0 is city
//            System.out.println(split);
            String sanitized = split.replaceAll("[^\\d]","");  // remove all non numbers
//            System.out.println(sanitized);
            populations.add(sanitized);
        }
        System.out.println(populations);


//        2. Same in Modern way using functional/streams
        List<String> populations2 =  text.lines()
                .map(line -> line.split(",")[1])  // split and get 2nd token at index 1
                .map(population -> population.replaceAll("[^\\d]","")) // sanitize remove non numbers
                .toList();
        System.out.println(populations2);

//        3. create function and use it in stream
        Function<String,String> extractSecondToken = line -> line.split(",")[1];
        Function<String, String> sanitizeNumber = numberAsString -> numberAsString.replaceAll("[^\\d]","");

        List<String> populations3 = text.lines()
                .map(extractSecondToken.andThen(sanitizeNumber))
                .toList();
        System.out.println(populations3);
    }
}
