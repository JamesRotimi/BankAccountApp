package com.company;

import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {


        String file = "C:\\Users\\Rotimi\\Desktop\\NewBankAccounts.csv";

        List<String[]> newAccountHolders = new CSV().read(file);
        for(String[] accountHolder : newAccountHolders) {
            System.out.println("New account holder");
            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
            System.out.println(accountHolder[3]);
        }
}
}

// write your code here

//        Checking account = new Checking("James",1000,"123435643543");
//        account.showInfo();
//        account.deposit(2100);
//        account.withdraw(1234);
//
//        System.out.println("*******");
//
//        Savings savings = new Savings("Peter",1400,"123435643543");
//        savings.showInfo();
//        savings.deposit(3300);
//        savings.withdraw(1000);
//    }