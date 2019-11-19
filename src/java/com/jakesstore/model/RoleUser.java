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
public class RoleUser {
    private int roleId;
    private String roleName;

    public RoleUser() {
    }

    public RoleUser(int roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public int getCateId() {
        return roleId;
    }

    public void setCateId(int cateId) {
        this.roleId = cateId;
    }

    public String getName() {
        return roleName;
    }

    public void setName(String roleName) {
        this.roleName = roleName;
    }

    public RoleUser(String roleName) {
        this.roleName = roleName;
    }
    
    
}
