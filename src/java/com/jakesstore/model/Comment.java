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
public class Comment {
    private int commentID;
    private int userID;
    private int devicesID;
    private String commentary;
    private int star;

    public Comment(int userID, int devicesID, String commentary, int star) {
        this.userID = userID;
        this.devicesID = devicesID;
        this.commentary = commentary;
        this.star = star;
    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getDevicesID() {
        return devicesID;
    }

    public void setDevicesID(int devicesID) {
        this.devicesID = devicesID;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }
    
    
}
