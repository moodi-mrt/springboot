package org.example;

public class CashDispenser {
    private final int INITIAL_COUNT = 500; // these are all $20 bills in the dispenser
    private  int count ;// assume that we have all $20 bills in the dispenser

    public void DashDispenser(){
        count = INITIAL_COUNT;
    }

    public Boolean isSufficientBalance(double amount){
        if (count >= amount/20){
            return true;
        }
        return false;
    }

    public void DispenseCash(int amount){
        int bills =  amount/20;

        count -= bills;

    }
}
