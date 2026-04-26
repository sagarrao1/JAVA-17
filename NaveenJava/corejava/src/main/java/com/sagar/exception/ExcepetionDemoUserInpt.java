package com.sagar.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExcepetionDemoUserInpt {

    public static void main(String[] args) {
        int i, j, k = 0;

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        i = 8;
        try {
            System.out.println("Enter a number");
            //j = Integer.parseInt(br.readLine());
            j = sc.nextInt();
            k = i / j;
            System.out.println("k value is: " + k);

        } /*
         * catch (NumberFormatException | IOException e) { // TODO Auto-generated catch
         * block e.printStackTrace(); }
         */ catch (ArithmeticException e) {
            System.out.println(" can not devide  by zero: " + e);
            //e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            System.out.println("FInally Bye ...");
            sc.close();
        }

    }

}
