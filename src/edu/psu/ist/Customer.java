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
    public class Customer {
        //Class Level Variables - Protect the data
        private int customerId;
        private String customerName;
        private String customerPhoneNumber;
        private String customerEmail;

        //Constructor Method
        public Customer(int _customerId){
            this.customerId = _customerId;


        }

        public Customer(){
        }

        //Setters and Getters
        public int getcustomerId() { return customerId; }
        public void setcustomerId(int _customerId) {this.customerId = _customerId;}

        public String getCustomerName(){return customerName;}
        public void setCustomerName(String _customerName){this.customerName = _customerName;}

        public String getCustomerPhoneNumber(){return customerPhoneNumber;}
        public void setCustomerPhoneNumber(String _customerPhoneNumber){this.customerPhoneNumber = _customerPhoneNumber;}

        public String getCustomerEmail(){return customerEmail;}
        public void setCustomerEmail(String _customerEmail){this.customerEmail = _customerEmail;}

        //Takes customer ID and puts the customers info into cList
        public static void printCustomer(ArrayList<Customer> cList){
            for (Customer customers : cList){
                System.out.println("Customer ID: " + customers.getcustomerId());
                System.out.println("Customer Name: " + customers.getCustomerName());
                System.out.println("Customer Phone Number: " + customers.getCustomerPhoneNumber());
                System.out.println("Customer email: " + customers.getCustomerEmail());
            }
        }
    }


