package com.bank;

import com.bank.service.impl.BankServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankServiceImplTest {
    private BankServiceImpl bankserviceImpl = new BankServiceImpl();

    private BankAccount bankAccount = new BankAccount("Lisa", "2");

//best case scenarios
    @Test
    public void testThatWithdrawMethodWithdrawsAmountWhenBalanceIsNotBelowAmount(){
        bankAccount.setBalance(200);
        double amount = 100;
        double balance = bankAccount.getBalance() - amount;
        bankserviceImpl.withdraw(bankAccount, amount);
        Assertions.assertEquals(balance, bankAccount.getBalance());
    }

        @Test
        public void testThatDepositMethodDepositsAmountWhenAmountIsNotNegative(){
            bankAccount.setBalance(200);
            double amount = 100;
            double balance = bankAccount.getBalance() + amount;
            bankserviceImpl.deposit(bankAccount, amount);
            Assertions.assertEquals(balance, bankAccount.getBalance());
        }

        //If user tries to withdraw too much
        @Test
    public void testThatWithdrawMethodDoesNotWithdrawWhenToHighWithdrawAmountIsPassed(){
            bankAccount.setBalance(200);
            double amount = 300;
            double balance = bankAccount.getBalance();
            bankserviceImpl.withdraw(bankAccount, amount);
            Assertions.assertEquals(balance, bankAccount.getBalance());
        }

        //If user tries to deposit -100
    @Test
    public void testThatDepositMethodDoesNotDepositWhenPassedNegativeAmount(){
        bankAccount.setBalance(200);
        double amount = -100;
        double balance = bankAccount.getBalance();
        bankserviceImpl.deposit(bankAccount, amount);
        Assertions.assertEquals(balance, bankAccount.getBalance());
    }


}