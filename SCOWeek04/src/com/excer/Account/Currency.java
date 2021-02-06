package com.excer.Account;

/**
 * @ author Fei Gu
 * @ create 2021-02-04-12.12
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description
 * @ Version
 */
public enum Currency {
    DKK{
        public double getRate(){
            double rate = 1;
            return rate;
        }
    },
    Euro{
        public double getRate(){
            double rate = 7.5;
            return rate;
        }
    };
    public abstract double getRate();
}
