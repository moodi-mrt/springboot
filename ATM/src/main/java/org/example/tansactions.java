package org.example;

public class tansactions {
    private Screen screen;
    private BankDatabase bankDatabase;
    private  int Account_number;

    public tansactions(int account_number, Screen screen, BankDatabase bankDatabase){
        this.Account_number = account_number;
        this.screen = screen;
        this.bankDatabase = bankDatabase;
    }


    public int getAccount_number(){
        return Account_number;
    }

    public Screen getScreen(){
        return screen;
    }

    public BankDatabase getBankDatabase() {
        return bankDatabase;
    }
}
