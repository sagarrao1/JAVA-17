package com.cloudairlines1.utils;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class TestDataUtils {

    /** Stream of testData can be used in multiple Test cases
     *
     * @return Stream of arguments of Invalid dates
     */
    public static Stream<Arguments> getInvalidDates(){
        return Stream.of(
                Arguments.of("2022-07/15"),
                Arguments.of("2022-13-15"),
                Arguments.of("01-01-2024"));
    }
}
