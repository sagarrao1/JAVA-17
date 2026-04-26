package com.sagar.intrface.chapter17;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);
        /*
         * int result=0; for (Integer i : values) { result=result+i*2; }
         * System.out.println(result);
         */
       /* Function<Integer, Integer> f = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer t) {
                return t * 2;
            }
        };
		System.out.println(f.apply(5));*/

//        BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer t, Integer u) {
//                return t + u;
//            }
//        };
//		System.out.println(b.apply(5,4));

//        Stream<Integer> s= values.stream();
//        Stream<Integer> s1=s.map( t -> t*2  );

        //Integer result= values.stream().map( t -> t*2  ).reduce(0,   ( t, u) ->  t+u);

        System.out.println(values.stream().map(t -> t * 2)
//				.reduce(0, (t, u) -> t + u)
		);
        //System.out.println("result="+result);
        //System.out.println(values.stream());
        //s1.forEach(System.out::println);

    }
}
