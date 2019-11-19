/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jakesstore.model;

/**
 *
 * @author jakes
 */
public class Bill {
    private int billID;
    private int userID;
    private int total;
    private int paymentMethod;
    private String address;
    private String date;

    public Bill() {
    }

    public Bill(int billID, int userID, int total, int paymentMethod, String address, String date) {
        this.billID = billID;
        this.userID = userID;
        this.total = total;
        this.paymentMethod = paymentMethod;
        this.address = address;
        this.date = date;
    }

    public Bill(int userID, int total, int paymentMethod, String address, String date) {
        this.userID = userID;
        this.total = total;
        this.paymentMethod = paymentMethod;
        this.address = address;
        this.date = date;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(int paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
