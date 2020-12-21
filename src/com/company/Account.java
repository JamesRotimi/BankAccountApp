package com.company;

public abstract class Account implements IBaseRate {

    protected String name;
    protected String sSN;
    protected double balance;
    public static int index = 10000;
    public String accNum;

    public Account() {}

    public Account(String name, double deposit, String sSN) {
        this.name = name;
        this.balance = deposit;
        this.sSN = sSN;
        this.accNum = accountNum();
        index++;
        setRate();
    }

    private String accountNum() {
        int acc = (int) (Math.random() * Math.pow(10,3));
        int uniqueId = index;
        String lastTwoSsn = getsSN().substring(getsSN().length() - 2);
                return lastTwoSsn + uniqueId + acc;
    }

    public abstract double setRate();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsSN() {
        return sSN;
    }

    public void setsSN(String sSN) {
        this.sSN = sSN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }



    public void deposit(int amount) {
         balance += amount;
        System.out.println("\n You've deposited " + amount + ", Your new balance is " + balance);
    }

    public void withdraw(int amount) {
        balance -= amount;
        System.out.println("\n You've with withdrawn: " + amount + "\n your new balance is " + balance);
    }

    public void transfer(String to, int amount) {
        balance -= amount;
        System.out.println("You have transferred " + amount + "to" + to + " your new balance is " + balance);
    }

    public void showInfo() {
        System.out.println("\n Welcome " + this.name + "\n your balance is " + this.balance +
                "\n your social security number is " + sSN + "\n your acc number is " + this.accNum);
    }
}
