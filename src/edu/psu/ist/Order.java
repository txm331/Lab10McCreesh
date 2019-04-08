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

enum MenuItem {plain, meat, extra, veg}

public class Order {
    //Class Level Variables - Protect the data
    private int orderId;
    private int quantity;
    private MenuItem menuItem;
    private String customerName;

    //Constructor Method
    public Order(int _orderId){
        this.orderId = _orderId;


    }

    //Setters and Getters
    public int getorderId() { return orderId; }
    public void setorderId(int _orderId) {this.orderId = _orderId;}

    public int getQuantity(){return quantity;}
    public void setQuantity(int _quantity){this.quantity = _quantity;}

    public MenuItem getMenuItem(){return menuItem;}
    public void setMenuItem(MenuItem _menuItem){this.menuItem = _menuItem;}

    public String getCustomerName(){return customerName;}
    public void setCustomerName(String _customerName){this.customerName = _customerName;}

    //takes order ID and puts the orders info into oList
    public static void printOrders(ArrayList<Order> oList){
        for (Order order : oList){
            System.out.println("Order ID: " + order.getorderId());
            System.out.println("Menu Item: " + order.getMenuItem());
            System.out.println("Quantity: " + order.getQuantity());
            System.out.println("Customer: " + order.getCustomerName());
        }
    }
}

