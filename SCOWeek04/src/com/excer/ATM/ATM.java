package com.excer.ATM;

import com.excer.Account.Card;
import com.excer.Account.Currency;

/**
 * @ author Fei Gu
 * @ create 2021-02-04-12.11
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the ATM Operation System which has the function about:
 * 1. User can insert the Card to login with the UserId and the pincode.
 * 2. Show information about the user and the account when the login is succeed.
 * @ Version
 */
public class ATM {

    private Card card;

    public ATM(Card card) {
        this.card = card;
    }

    public boolean logIn(String inputPinCode){
        if(card.isRemovedStatus() == false){
            boolean loginOK = true;
            while(loginOK) {
                if (card.getPinCode().equals(inputPinCode)) {
                    System.out.println("Welcome");
                    loginOK = false;

                } else {
                    System.out.println("Please try again:");
                }
            }
            return true;
        }else{
            System.out.println("your card is been removed!");
            return false;
        }
    }

    public void logOut(){
        card = null;
    }

    public void showUserName(){
        System.out.println("the user name is :" + card.getUserName());
    }

    public void showSaveAmount(){
        System.out.println(" you have : " + card.getAccount().getSaveAmount() + "in your account! ");
    }

    public double withDraw(Currency currency,double amount){
        if(currency.equals(card.getAccount().getCurrency())){
            return card.getAccount().withDraw(amount);
        }else{
            double convers = card.getAccount().conversAmount(currency,amount);
            card.getAccount().withDraw(convers);
            return amount;
        }
    }

    public void deposite(Currency currency,double amount){
        if(currency.equals(card.getAccount().getCurrency())){
            card.getAccount().deposite(amount);
        }else{
            double conver = card.getAccount().conversAmount(currency,amount);
            card.getAccount().deposite(conver);
        }
    }


}
