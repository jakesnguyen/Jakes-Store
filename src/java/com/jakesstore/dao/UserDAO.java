/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jakesstore.dao;


import com.jakesstore.model.UserInfo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author jakes
 */
public class UserDAO {

    public static UserInfo login(String userName, String password) {
        Connection con = DBConnect.getConnection();
        String sql = "select * from UserInfo where userName = '" + userName + "' and Password = '" + password + "'";
        PreparedStatement ps;
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                UserInfo u = new UserInfo();
                u.setUserID(rs.getInt("userID"));
                u.setUserName(rs.getString("userName"));
                u.setEmail(rs.getString("email"));
                u.setUserDisplayName(rs.getString("userDisplayName"));
                u.setPassword(rs.getString("password"));
                u.setAddress(rs.getString("address"));
                u.setPhone(rs.getString("phone"));
                u.setRoleID(rs.getInt("roleID"));
                u.setPoint(rs.getInt("point"));
                u.setMoney(rs.getInt("money"));
                con.close();
                return u;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getValueString(String username, String value) {
        Connection con = DBConnect.getConnection();
        String sql = "select * from UserInfo where userName = '" + username + "'";
        PreparedStatement ps;
        String name = null;
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                name = rs.getString(value);
                con.close();
                return name;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int getValueInt(String username, String value) {
        Connection con = DBConnect.getConnection();
        String sql = "select * from UserInfo where userName = '" + username + "'";
        PreparedStatement ps;
        int id;
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(value);
                con.close();
                return id;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public String getOldpassword(String userName) {
        Connection con = DBConnect.getConnection();
        String sql = "select * from userInfo where userName = '" + userName + "'";
        PreparedStatement ps;
        String old = "";
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                old = rs.getString("Password");
                con.close();
                return old;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return old;
    }
    
public static void main(String[] args){
    UserDAO.login("admin", "admin");
}

}
