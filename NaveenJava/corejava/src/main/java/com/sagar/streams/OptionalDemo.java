package com.sagar.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
        public static void main(String[] args) {
          List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
            Optional<String> result = names.stream()
                                        .filter(name -> name.startsWith("B"))
                                        .findFirst();

            System.out.println(result.orElse("No name found starting with 'b'"));


            // Method reference
            List<String> namesList = names.stream()
                       .map(name -> name.toUpperCase())
//                    .map(String::toUpperCase)
                    .toList();
//          1. forEach with lambda
//            for (String name : namesList) {
//                System.out.println(name);
//            }

//            2. forEach with method reference
//            namesList.forEach((i) -> System.out.println(i));
            namesList.forEach(System.out::println);
        }
}
