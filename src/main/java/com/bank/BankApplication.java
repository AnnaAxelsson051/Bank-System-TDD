package com.bank;

import com.bank.service.impl.BankServiceImpl;

import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 'Name' and 'CustomerId' to access your Bank account:");
        String name = sc.nextLine();
        String customerId = sc.nextLine();
        new BankMenu(new BankServiceImpl(), new BankAccount(name, customerId)).menu();
    }


}
