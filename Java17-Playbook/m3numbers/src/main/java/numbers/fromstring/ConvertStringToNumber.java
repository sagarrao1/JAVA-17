package numbers.fromstring;

import java.util.List;

public class ConvertStringToNumber {

    public static void main(String[] args) {

        String num = "5";
        Integer integer = Integer.valueOf(num);
        List<Integer> ints = List.of(Integer.valueOf(num));
        int primitiveNum = Integer.parseInt(num);
        System.out.println(ints);
        System.out.println(primitiveNum);

//        2 methods
//        valueOf is wrapper class Integer
//        pasreInt will convert to premitive

    }
}
