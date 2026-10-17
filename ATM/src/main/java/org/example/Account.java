package org.example;

public class Account {
    private int Account_number;
    private int pin;
    private  float Available_balance;
    private  float Total_balance;

    public Account(int account_number, int pin, float available_balance, float total_balance){
        this.Account_number = account_number;
        this.pin = pin;
        this.Available_balance = available_balance;
        this.Total_balance = total_balance;
    }

    public int getAccount_number() {
        return Account_number;
    }

    public boolean validatePin(int pin){
        return this.pin == pin;
    }

    public double getAvailableBalance(){
        return Available_balance;
    }

    public double getTotalBalance(){
        return Total_balance;
    }

    public void credit(double amount){
        Available_balance += amount;
        Total_balance += amount;

    }

    public void Debite(double amount){
        if (amount > Available_balance){
            throw new IllegalArgumentException("insufficient balance") ;
        }
        Available_balance -= amount;
        Total_balance -= amount;
    }
}

