package com.sagar.exception;

public class ExceptionCreateNew {
    public static void main(String[] args) {
        int i = 5;

        try {
            if (i < 10)
                throw new MyException("new error..");
        } catch (MyException e) {
            System.out.println("New exceptopn: " +e);
        }
    }
}

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

