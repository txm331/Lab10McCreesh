package edu.psu.ist;
/*
Project: Lab9McCreesh
Purpose Details: Pizza ordering application
Course: IST242
Author: Tim McCreesh
Date Developed: 3/14/19
Last Date Changed: 3/17/19
Rev: 1
 */
import java.util.ArrayList;

enum PaymentType {cash, credit, debit}

public class Transaction {
    //Class Level Variables - Protect the data
    private int transactionId;
    private int orderID;
    private PaymentType paymentType;

    //Constructor Method
    public Transaction(int _transactionId){
        this.transactionId = _transactionId;

    }

    //Setters and Getters
    public int getTransactionId() { return transactionId; }
    public void setTransactionId(int _transactionId) {this.transactionId = _transactionId;}

    public int getOrder(){return orderID;}
    public void setOrder(int _order){this.orderID = _order;}

    public PaymentType getPaymentType(){return paymentType;}
    public void setPaymentType(PaymentType _paymentType){this.paymentType = _paymentType;}



    //Takes the transaction ID and puts the transaction info into tList
    public static void listTransactions(ArrayList<Transaction> tList){
        for(Transaction transaction : tList){
            System.out.println("Transaction ID: " + transaction.getTransactionId());
            System.out.println("Order: " + transaction.getOrder());
            System.out.println("PaymentType: " + transaction.getPaymentType());

        }
    }

}

