package edu.psu.ist;
/*
Project: Lab10McCreesh
Purpose Details: Pizza ordering application
Course: IST242
Author: Tim McCreesh
Date Developed: 3/14/19
Last Date Changed: 3/26/19
Rev: 2
 */


import java.util.ArrayList;
public class Menu {
    //Class Level Variables - Protect the data
    private int menuId;
    private String menuItem;
    private double menuPrice;


    //Constructor Method
    public Menu(int _menuId, String _menuItem, double _menuPrice){
        this.menuId = _menuId;
        this.menuItem = _menuItem;
        this.menuPrice = _menuPrice;


    }

    //Setters and Getters
    public int getmenuId() { return menuId; }
    public void setmenuId(int _menuId) {this.menuId = _menuId;}

    public String getmenuItem() { return menuItem; }
    public void setmenuItem(String _menuItem) {this.menuItem = _menuItem;}

    public double getPrice(){return menuPrice;}
    public void setMenuPrice(double _menuPirce){this.menuPrice = _menuPirce;}

    //takes menu item and stores its info into mlist
    public static void listMenu(ArrayList<Menu> mList){
        for (Menu menu: mList){
            System.out.println("Item ID: " + menu.getmenuId());
            System.out.println("Menu Item: " + menu.getmenuItem());
            System.out.println("Item price: " + menu.getPrice());
        }
    }

}

