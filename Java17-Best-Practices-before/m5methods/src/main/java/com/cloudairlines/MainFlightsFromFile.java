package com.cloudairlines;
import com.cloudairlines.flight.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class MainFlightsFromFile {

    public static void main(String[] args) {
        String path = "m5methods/src/main/resources/flights.json";
        String content = readFileBufferedReader(path);
        System.out.println("content : " +content);
        FlightSimpleStore flightSimpleStore = new FlightSimpleStore();

        List<Flight> flights = flightSimpleStore.getFlights(content);
        System.out.println(flights.size());
        flights.forEach(System.out::println);

    }

    private static String readFileBufferedReaderOld(String path) {
        BufferedReader bufferedReader = null;
        String fileContent = "";
        try {
            String strCurrentLine;
            bufferedReader = new BufferedReader(new FileReader(path));
            while ((strCurrentLine = bufferedReader.readLine()) != null) {
                fileContent += strCurrentLine;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return fileContent;
        }
    }

//    Memory efficient compare to above method because of using StringBuilder instead of String
    private static String readFileBufferedReader(String path) {
        BufferedReader bufferedReader = null;
        StringBuilder fileContent = new StringBuilder();
        try {
            String strCurrentLine;
            bufferedReader = new BufferedReader(new FileReader(path));
            while ((strCurrentLine = bufferedReader.readLine()) != null) {
                fileContent.append(strCurrentLine);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return fileContent.toString();
        }
    }
}
