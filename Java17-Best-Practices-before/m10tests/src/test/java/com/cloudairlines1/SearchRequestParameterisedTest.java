package com.cloudairlines1;

import com.cloudairlines1.flight.SearchRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.stream.Stream;

class SearchRequestParameterisedTest {

    @ParameterizedTest
    @CsvSource({
            "    ,New York,2022-10-16",
            "London,    ,2022-10-16"
//            "London,London,2022-10-16"
    })
    public void invalidInputIsRejected(String from, String to, String date){
        if (from == null || to == null){
            Assertions.assertThrows(NullPointerException.class,
                    () -> new SearchRequest(from, to, date));
        } /*else {
            Assertions.assertThrows(IllegalArgumentException.class,
                    () -> new SearchRequest(from, to, date));
        }*/
    }

    @Test
    public void searchRejectsInvalidDateFormat() {
        List<String> invalidDates = List.of("2022-07/15", "2022-13-15", "01-01-2024");
        for(String date : invalidDates) {
            Assertions.assertThrows(IllegalArgumentException.class,
                    () -> new SearchRequest("London", "New York", date));
        }
    }

    //    Avoid for loops in test like above and rewrite using parameterised tests
    @ParameterizedTest
    @ValueSource(strings = {"2022-07/15", "2022-13-15", "01-01-2024"})
    public void searchRejectsInvalidDateFormat1(String invalidDate) {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new SearchRequest("London", "New York", invalidDate));
    }

    //   We can rewrite using testData wrapper class in parameterised tests
    @ParameterizedTest
    @MethodSource("getInvalidDates")
    public void searchRejectsInvalidDateFormat2(String invalidDate) {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new SearchRequest("London", "New York", invalidDate));
    }

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

    //   Using getInvalidDates testData from TestDataUtils class in different package
//    Reusable from Utils package
    @ParameterizedTest
    @MethodSource("com.cloudairlines1.utils.TestDataUtils#getInvalidDates")
    public void searchRejectsInvalidDateFormat3(String invalidDate) {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new SearchRequest("London", "New York", invalidDate));
    }


}