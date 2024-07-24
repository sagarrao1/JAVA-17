package com.cloudairlines;

import java.time.LocalDate;

public class SearchRequestDemo {

    public static void main(String[] args) {
//        Execute using command prompt
//        var request = new SearchRequest(args);

        String[] searchInputs = {"From", "To", "50-60-70"};
        var request = new SearchRequest(searchInputs);
//        LocalDate date = request.getDate();
//        date.toString();  // NPE


    }
}
