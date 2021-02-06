package com.excer.Test;

import com.excer.ATM.ATM;
import com.excer.Account.Account;
import com.excer.Account.AccountType;
import com.excer.Account.Card;
import com.excer.Account.Currency;

import java.util.Scanner;

/**
 * @ author Fei Gu
 * @ create 2021-02-04-12.13
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the Test class to simulate the real situation when the user use the card to operate the ATM
 * @ Version
 */
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Account myAccount = new Account(Currency.DKK,AccountType.Debit,"123456","12345678","001",10000);
        Card myCard = new Card("xxxx-xxxx","123456","MyName",false,myAccount);

        System.out.println("welcome ");
        System.out.println("please input the code");

        String input = scan.next();
        ATM usingAtm = new ATM(myCard);
        boolean loginOK = usingAtm.logIn(input);
        if(loginOK == true){
            usingAtm.showUserName();
            usingAtm.showSaveAmount();

            System.out.println(" you put 100 DKK in you account");
            usingAtm.deposite(Currency.DKK,100);
            usingAtm.showSaveAmount();

            System.out.println("you put 100 euro in ");
            usingAtm.deposite(Currency.Euro,100);
            usingAtm.showSaveAmount();
        }

        usingAtm.logOut();

    }
}
