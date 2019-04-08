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
import java.util.Scanner;


public class Main {
    int cCount = 1;
    int oCount = 1;
    int tCount = 1;
    public static void main(String[] args) {
        Main main = new Main();
        final char EXIT_CODE = 'E';
        final char CUST_CODE = 'C';
        final char CUST_PRINT = 'P';
        final char MENU_CODE = 'M';
        final char ORDE_CODE = 'O';
        final char ORDE_PRINT = 'R';
        final char TRAN_CODE = 'T';
        final char TRAN_PRINT = 'A';
        final char HELP_CODE = '?';
        char userAction;
        final String PROMPT_ACTION = "Add 'C'ustomer, List 'M'enu, Add 'O'rder, List 'T'ransaction,'?'Help or 'E'xit: ";
        ArrayList<Customer> cList = new ArrayList<>();
        ArrayList<Menu> mList = new ArrayList<>();
        ArrayList<Order> oList = new ArrayList<>();
        ArrayList<Transaction> tList = new ArrayList<>();

        Customer cust1 = new Customer();
        //creating menu objects
        Menu menu1 = new Menu(1, "Plain", 7.50);
        Menu menu2 = new Menu(2, "Meat", 9.50);
        Menu menu3 = new Menu(3, "Extra", 12.00);
        Menu menu4 = new Menu(4, "Veg", 8.50);

        //creating order objects
                /*Order order1 = new Order(1);
                Order order2 = new Order(2, 1, menu2, cust2);
                Order order3 = new Order(3, 2, menu3, cust3);
                Order order4 = new Order(4, 1, menu4, cust4);
                //creating transaction objects
                /*Transaction trans1 = new Transaction(1, order1, PaymentType.cash);
                Transaction trans2 = new Transaction(2, order2, PaymentType.credit);
                Transaction trans3 = new Transaction(3, order3, PaymentType.debit);
                Transaction trans4 = new Transaction(4, order4, PaymentType.cash);*/

        //adding menu items to mList
        mList.add(menu1);
        mList.add(menu2);
        mList.add(menu3);
        mList.add(menu4);

        //adding customers to cList
                /*cList.add(cust1);
                cList.add(cust2);
                cList.add(cust3);
                cList.add(cust4);

                //adding orders to oList
                oList.add(order1);
                oList.add(order2);
                oList.add(order3);
                oList.add(order4);

                //adding transactions to tList
                tList.add(trans1);
                tList.add(trans2);
                tList.add(trans3);
                tList.add(trans4);*/

        userAction = getAction(PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            switch (userAction) {
                case CUST_CODE:
                    cList.add(main.addCustomer());
                    break;
                case CUST_PRINT:
                    Customer.printCustomer(cList);
                    break;
                case MENU_CODE:
                    Menu.listMenu(mList);
                    break;
                case ORDE_CODE:
                    oList.add(main.addOrders());
                    break;
                case ORDE_PRINT:
                    Order.printOrders(oList);
                case TRAN_CODE:
                    Transaction.listTransactions(tList);
                    break;
                case TRAN_PRINT:
                    tList.add(main.addTransactions());
                    break;
                case HELP_CODE:
                    getAction(PROMPT_ACTION);
                    break;
            }

            userAction = getAction(PROMPT_ACTION);
        }
    }

    public static char getAction(String prompt) {
        Scanner scnr = new Scanner(System.in);
        String answer = "";
        System.out.println(prompt);
        answer = scnr.nextLine().toUpperCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;
    }

    public Customer addCustomer() {
        Customer cust = new Customer(cCount++);
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please Enter your Name: ");
        cust.setCustomerName(scnr.nextLine());
        System.out.println("Please Enter your Phone: ");
        cust.setCustomerPhoneNumber(scnr.nextLine());
        System.out.println("Please enter your email: ");
        cust.setCustomerEmail(scnr.nextLine());
        return cust;
    }

    public Order addOrders() {

        Order order = new Order(oCount++);
        Scanner scnr = new Scanner(System.in);
        System.out.println("Customer Name: ");
        order.setCustomerName(scnr.nextLine());
        System.out.println("What type of pizza would you like: ");
        order.setMenuItem(MenuItem.valueOf(scnr.nextLine()));
        System.out.println("How many pizzas would you like: ");
        order.setQuantity(scnr.nextInt());
        return order;
    }
    public Transaction addTransactions() {
        Transaction transaction = new Transaction(tCount++);
        Scanner scnr = new Scanner(System.in);
        transaction.setOrder(oCount++);
        System.out.println("What payment type do you prefer: ");
        transaction.setPaymentType(PaymentType.valueOf(scnr.nextLine()));
        return transaction;
    }
}


