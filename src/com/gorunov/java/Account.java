package com.gorunov.java;

/**
 * Created by Fedor on 20.05.2017.
 */
public class Account {
    private  String name;
    private  String adress;
    private  double balance;

    public Account(String name, String adress, double balance) {
        this.name = name;
        this.adress = adress;
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", balance=" + balance +
                '}';
    }
}
