package com.excer.Account;

/**
 * @ author Fei Gu
 * @ create 2021-02-05-07.46
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description
 * @ Version
 */
public enum AccountType {
    Debit{
        public double reDrawLimit(){
            int limit = -200;
            return limit ;
        }
    },
    Credit{
        public double reDrawLimit(){
            int limit = -20000;
            return limit ;
        }
    },
    SuperCustomer{
        public double reDrawLimit(){
            int limit = -200000;
            return limit ;
        }
    },
    Other{
        public double reDrawLimit(){
            int limit = 0;
            return limit ;
        }
    };

    public abstract double reDrawLimit();

}
