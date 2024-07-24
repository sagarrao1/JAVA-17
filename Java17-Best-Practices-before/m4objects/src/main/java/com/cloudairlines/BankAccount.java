package com.cloudairlines;

public class BankAccount {

    private double balance;
    private double interest;

    BankAccount() {
        this(0);
    }

    BankAccount(double balance) {
//        if(balance < 0){
//            throw new IllegalArgumentException("Starting balance can't be less than 0");
//        }
//        this.balance = balance;
        this(balance, 0.1);
    }

    BankAccount(double balance, double interest) {
        if(balance < 0){
            throw new IllegalArgumentException("Starting balance can't be less than 0");
        }

        if(interest < 0){
            throw new IllegalArgumentException("Interest rate can't be less than 0");
        }

        this.balance = balance;
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", interest=" + interest +
                '}';
    }
}
