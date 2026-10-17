package org.example;

public class BankDatabase {
    private Account[] accounts; // array of Accounts

    public BankDatabase() {
        accounts = new Account[5]; // create array of Accounts
        accounts[0] = new Account(12345, 54321, 1000.0, 1200.0);
        accounts[1] = new Account(98765, 56789, 300.0, 200.0);
        accounts[2] = new Account(11223, 32211, 200.0, 200.0);
        accounts[3] = new Account(22334, 43322, 100.0, 200.0);
        accounts[4] = new Account(33445, 54433, 20.0, 200.0);

    }

    public Account getAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccount_number() == accountNumber) {
            return account;

            }
        }
        return null;
    }

    public Boolean AuthenticateAccount(int AccountNumber, int pin){
        Account account = getAccount(AccountNumber);

        if (account != null){
            return account.validatePin(pin);
        }
        return false;
    }

    public double getAvailableBalance(int AccountNumber){
        Account account = getAccount(AccountNumber);
        if (account != null){
            return account.getAvailableBalance();
        }
        return 0.0;
    }

    public double getTotalBalance(int AccountNumber){
        Account account = getAccount(AccountNumber);
        if (account !=null){
            return getTotalBalance(AccountNumber);
        }
        return 0.0;
    }

    public void credit(int AccountNumber, double amount){
        Account account = getAccount(AccountNumber);
        if (account != null){
            account.credit(amount);
        }

    }

    public void debit(int AccountNumber, double amount){
        Account account = getAccount(AccountNumber);
        if(account != null){
            account.Debite(amount);
        }
    }
}
