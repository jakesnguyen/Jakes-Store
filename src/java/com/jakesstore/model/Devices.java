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
public class Devices {

    private int devicesID;
    private String devicesName;
    private int quantity;
    private int price;
    private int cateID;
    private String img1;
    private String img2;
    private String img3;
    private String img4;
    private String detail;
    private String brand;
    private int viewCount;
    private double star;
    

    public Devices(int devicesID, String devicesName, int quantity, int price, int cateID, String img1, String img2, String img3, String img4, String detail, String brand,int viewCount, double star) {
        this.devicesID = devicesID;
        this.devicesName = devicesName;
        this.quantity = quantity;
        this.price = price;
        this.cateID = cateID;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.detail = detail;
        this.brand = brand;
        this.viewCount = viewCount;
        this.star = star;
    }

    public int getDevicesID() {
        return devicesID;
    }

    public void setDevicesID(int devicesID) {
        this.devicesID = devicesID;
    }

    public String getDevicesName() {
        return devicesName;
    }

    public void setDevicesName(String devicesName) {
        this.devicesName = devicesName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCateID() {
        return cateID;
    }

    public void setCateID(int cateID) {
        this.cateID = cateID;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    public String getImg4() {
        return img4;
    }

    public void setImg4(String img4) {
        this.img4 = img4;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getViewCount() {
        return star;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public double getStar() {
        return star;
    }

    public void setStar(double star) {
        this.star = star;
    }

    @Override
    public String toString() {
        return "Devices{" + "devicesID=" + devicesID + ", devicesName=" + devicesName + ", quantity=" + quantity + ", price=" + price + ", cateID=" + cateID + ", img1=" + img1 + ", img2=" + img2 + ", img3=" + img3 + ", img4=" + img4 + ", detail=" + detail + ", brand=" + brand + ", viewCount=" + viewCount + ", star=" + star + '}';
    }


}
