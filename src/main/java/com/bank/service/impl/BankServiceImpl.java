package com.bank.service.impl;

import com.bank.BankAccount;
import com.bank.service.BankService;

public class BankServiceImpl implements BankService{

    @Override
    public void withdraw (BankAccount bankAccount, double amount){
       // try{
        if (amount > 0 && bankAccount.getBalance() > amount){
            bankAccount.setBalance(bankAccount.getBalance()-amount);
            bankAccount.setPrevTrans(bankAccount.getPrevTrans()-amount);
        }
       // }catch(RuntimeException runtimeException){
           // System.out.println("Insufficient funds");
          //  runtimeException.printStackTrace();
    //skriva ut meddelande till user och stacktrace för språning
   //     }
    }
    @Override
    public void deposit(BankAccount bankAccount, double amount){
        if(amount > 0){
            bankAccount.setBalance(bankAccount.getBalance() + amount);
            bankAccount.setPrevTrans(amount);
        }
    }
}

