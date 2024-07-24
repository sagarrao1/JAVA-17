package com.cloudairlines;

public class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount);

        BankAccount bankAccount1 = new BankAccount(23);
        System.out.println(bankAccount1);

        BankAccount bankAccount2 = new BankAccount(44,5);
        System.out.println(bankAccount2);
    }
}
