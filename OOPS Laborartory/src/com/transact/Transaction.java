package com.transact;

import java.util.Scanner;

public class Transaction {
    public static int balance;

    public static double credit(double amt){
        balance+=amt;
        return balance;

    }
    public static double debit(double amt){
        balance-=amt;
        return balance;
    }
}
