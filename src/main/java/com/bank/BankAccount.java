package com.bank;

public class BankAccount {
    double balance;
    double prevTrans;
    String customerName;
    String customerId;

    BankAccount(String customerName,String customerId){
        this.customerName=customerName;
        this.customerId=customerId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getPrevTrans() {
        return prevTrans;
    }

    public void setPrevTrans(double prevTrans) {
        this.prevTrans = prevTrans;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    void getPreviousTrans(){
        if(prevTrans>0){
            System.out.println("Deposited: "+prevTrans);
        }
        else if(prevTrans<0){
            System.out.println("Withdrawn: "+Math.abs(prevTrans));
        }
        else{
            System.out.println("No transaction occured");
        }
    }
}
