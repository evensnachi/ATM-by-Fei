package com.excer.Account;

/**
 * @ author Fei Gu
 * @ create 2021-02-04-12.12
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the account which has function about diposit, withdraw over the limit,
 * conversion the currency.
 * @ Version
 */
public class Account{

    Currency currency;
    AccountType accountType;

    private String userID;
    private String accountID;
    private String bankID;
    private double saveAmount;

    public Account(Currency currency, AccountType accountType, String userID, String accountID, String bankID, double saveAmount) {
        this.currency = currency;
        this.accountType = accountType;
        this.userID = userID;
        this.accountID = accountID;
        this.bankID = bankID;
        this.saveAmount = saveAmount;
    }

    public double getSaveAmount() {
        return saveAmount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public String getUserID() {
        return userID;
    }

    public String getAccountID() {
        return accountID;
    }

    public String getBankID() {
        return bankID;
    }

    public double conversAmount(Currency tragetCurrency, double amount) {
        double tragetRate = tragetCurrency.getRate();
        double rate = this.currency.getRate();
        return (rate * amount)/tragetRate;
        /*
        DKK/Euro = dkkRate/euroRate
         */

    }

    public double withDraw(double amount) {

        if(amount < this.saveAmount + this.accountType.reDrawLimit()){
            this.saveAmount -= amount;
            return amount;
        }else{
            return this.saveAmount + this.accountType.reDrawLimit();
        }
    }

    public void deposite(double amount) {
        saveAmount += amount;
    }


}
