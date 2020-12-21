package com.company;

public class Savings extends Account {

    private int safetyDepositBox;
    private int safetyDepositBoxKey;

    public Savings(String name,double deposit, String sSN) {
        super(name, deposit, sSN);
        accNum = "2" + accNum;
        System.out.println("Savings account");
        setSafetyDepositBox();
        setSafetyDepositBoxKey();
    }


    private void setSafetyDepositBox() {
        safetyDepositBox = (int) (Math.random() * Math.pow(10,3));
    }

    private void setSafetyDepositBoxKey() {
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10,4));
    }

    @Override
    public double setRate() {
        return 0;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("\n Your safety box number is "
         + safetyDepositBox + "\n your box key is " + safetyDepositBoxKey);
        System.out.println("\n Your interest rate is: " + setRate());
    }
}
