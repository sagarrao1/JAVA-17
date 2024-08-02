package strings;

public class TransformStringDemo {

    public static void main(String[] args) {

        String lotteryWin = " 100 usd ";

//        1. using normal way
        String result  = lotteryWin
                .replaceAll("[a-z]", "")
                .strip();

        System.out.println("result :"+result);
        String formattedResult = formatNumber(result);
        System.out.println(formattedResult.toUpperCase());

//        2. using latest java version . this is better & shorter
        String finalResult = lotteryWin
                .replaceAll("[a-z]","")
                .strip()
                .transform(TransformStringDemo::formatNumber)
                .toUpperCase();

        System.out.println("finalResult:"+finalResult);

//        3. using transform method for all

        String finalResult2 = lotteryWin
                .transform(s -> s.replaceAll("[a-z]", ""))
                .transform(String::strip)
                .transform(TransformStringDemo::formatNumber)
                .transform(String::toUpperCase);

        System.out.println("finalResult2:"+finalResult2);

    }

    private static String formatNumber(String num) {
        if(Integer.parseInt(num) < 100) {
            return "Nice! You've won: " + num;
        } else {
            return "Great news! You've won: " + num;
        }
    }
}
