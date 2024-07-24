package com.cloudairlines;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {

    }
    public static String readFileBufferedReader(String path) {
        BufferedReader objReader = null;
        StringBuilder fileContent = new StringBuilder();
        try {
            String strCurrentLine;
            objReader = new BufferedReader(new FileReader(path));
            while ((strCurrentLine = objReader.readLine()) != null) {
                fileContent.append(strCurrentLine);
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        } finally {

            if (objReader != null) {
                try {
                    objReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        return fileContent.toString();
    }

//    Same with try resources to avoid finally block
    public static String readFileBufferedReaderSimpler(String pathToFile) {
        try(BufferedReader reader = new BufferedReader(new FileReader(pathToFile))) {
            // while loop > build a string > return
        } catch (IOException e) {
            // handle
        }
        return "";
    }

    /**
     *
     * @param pathToFile
     * @return
     */
    public static String readSmallFile(String pathToFile) {
        try {
            return Files.readString(Path.of(pathToFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
