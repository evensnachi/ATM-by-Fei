package com.excer.Account;

import javax.jws.soap.SOAPBinding;

/**
 * @ author Fei Gu
 * @ create 2021-02-04-12.11
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the card which the user can through with the ATM to get the account.
 * @ Version
 */
public class Card {
    private String cardID;
    private String pinCode ;
    private String userName;

    private boolean removedStatus;
    Account account;

    public Card(String cardID, String pinCode, String userName, boolean removedStatus, Account account) {
        this.cardID = cardID;
        this.pinCode = pinCode;
        this.userName = userName;
        this.removedStatus = removedStatus;
        this.account = account;
    }

    public String getPinCode() {
        return pinCode;
    }

    public String getUserName() {
        return userName;
    }

    public boolean isRemovedStatus() {
        return removedStatus;
    }

    public Account getAccount() {
        return account;
    }
}