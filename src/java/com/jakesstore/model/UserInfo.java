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
public class UserInfo {
    private int userID;
    private String userName;
    private String Email;
    private String userDisplayName;
    private String Password;
    private String Phone;
    private String Address;
    private int point;
    private int roleID;
    private int money;

    public UserInfo(int userID, String userName, String Email, String userDisplayName, String Password, String Phone, String Address, int point, int roleID, int money) {
        this.userID = userID;
        this.userName = userName;
        this.Email = Email;
        this.userDisplayName = userDisplayName;
        this.Password = Password;
        this.Phone = Phone;
        this.Address = Address;
        this.point = point;
        this.roleID = roleID;
        this.money = money;
    }

    public UserInfo() {
    }

    public UserInfo(String userName, String Email, String userDisplayName, String Password, String Phone, String Address, int point, int roleID, int money) {
        this.userName = userName;
        this.Email = Email;
        this.userDisplayName = userDisplayName;
        this.Password = Password;
        this.Phone = Phone;
        this.Address = Address;
        this.point = point;
        this.roleID = roleID;
        this.money = money;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUserDisplayName() {
        return userDisplayName;
    }

    public void setUserDisplayName(String userDisplayName) {
        this.userDisplayName = userDisplayName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
    
}
