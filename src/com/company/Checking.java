package com.company;

public class Checking extends Account {


    private int debitCard;
    private int debitCardPin;


    public Checking(String name,double deposit, String sSN) {
     super(name,deposit, sSN);
     accNum = "1" + accNum;
     System.out.println("Checking account");
     setDebitCard();
     setDebitCardPin();

    }

    private void setDebitCard() {
        debitCard = (int) (Math.random() * Math.pow(10,12));
    }

    private void setDebitCardPin() {
        debitCardPin = (int) (Math.random() * Math.pow(10,4));
    }

    @Override
    public double setRate() {
        return (15/100) * .25;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("\n Your interest rate is: " + setRate());
        System.out.println("\n Card number is " + debitCard);
        System.out.println("\n this your is Pin " + debitCardPin);
    }
}
