package numbers.formatting;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class ProgramDemo3 {
    public static void main(String[] args) {

        List<String> prices = List.of("20.15","37.22","58.19");

        List<BigDecimal> bigDecimals = prices.stream()
                .map(Double::parseDouble)
                .map(d -> (d + d * .2))
                .map(d -> BigDecimal.valueOf(d).setScale(2, RoundingMode.HALF_UP))
                .toList();

        System.out.println(bigDecimals);
    }
}
