package org.example;

public class Main {
    public static int balance = 15000;
    public static String accountName = "myAccount";


    public void main (String[] args) throws OutOfMoneyException {
        System.out.println (Deduct("myAccount", 5000));
    }

    public static int Deduct (String calledAcc, int cashToReceive) throws OutOfMoneyException {
        if(accountName.equals(calledAcc)){
            throw new WrongNameException ("wrong name!!!");
        }
        if (cashToReceive>balance) {
            throw new OutOfMoneyException ("Out of money");
        }
        balance = balance- cashToReceive;
        return balance;
    }



    }


