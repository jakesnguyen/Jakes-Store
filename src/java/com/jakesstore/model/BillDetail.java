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
public class BillDetail {
    private int billDetailID;
     private int billID;
      private int devicesID;
       private int price;
        private int quantity;
        private String status;

    public BillDetail(int billDetailID, int billID, int devicesID, int price, int quantity, String status) {
        this.billDetailID = billDetailID;
        this.billID = billID;
        this.devicesID = devicesID;
        this.price = price;
        this.quantity = quantity;
        this.status = status;
    }

    public int getBillDetailID() {
        return billDetailID;
    }

    public void setBillDetailID(int billDetailID) {
        this.billDetailID = billDetailID;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public int getDevicesID() {
        return devicesID;
    }

    public void setDevicesID(int devicesID) {
        this.devicesID = devicesID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
        
        
}
