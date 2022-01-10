package com.loan;

import com.transact.Transaction;

import java.util.Scanner;

public class LoanAccount {
    public void doTransaction(String ch,double amt){
        if(ch.equals("C") || ch.equals("c"))
            System.out.println("Amount Credited:"+amt+"\nBalance:"+Transaction.credit(amt));
        else
            System.out.println("Amount Debited:"+amt+"\nBalance:"+Transaction.debit(amt));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LoanAccount ob = new LoanAccount();
        System.out.print("Credit(c) or Debit(d):");
        String ch = sc.next();
        double amt = sc.nextDouble();
        ob.doTransaction(ch,amt);
    }
}
