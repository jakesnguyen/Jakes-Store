/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jakesstore.dao;

import com.jakesstore.model.Category;
import com.jakesstore.model.Devices;
import com.jakesstore.model.DevicesStatus;
import com.jakesstore.model.UserInfo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jakes
 */
public class DBHelper {

    // get all from Devices table
    public ArrayList<Devices> getAllDevices() {
        try {
            Connection con = DBConnect.getConnection();
            String sql = "SELECT * FROM Devices ORDER BY viewCount DESC";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            ArrayList<Devices> dList = new ArrayList<Devices>();
            while (rs.next()) {
                dList.add(new Devices(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11),rs.getFloat(12)));
            }

            stmt.close();
            con.close();
            return dList;
        } catch (Exception e) {
            e.printStackTrace();
            Logger.getLogger(Devices.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public ArrayList<DevicesStatus> getAllDevicesStatus() {
        try {
            Connection con = DBConnect.getConnection();
            String sql = "SELECT * FROM DevicesStatus";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            ArrayList<DevicesStatus> devicesStatusList = new ArrayList<DevicesStatus>();
            while (rs.next()) {
                devicesStatusList.add(new DevicesStatus(rs.getInt(1), rs.getInt(2), rs.getString(3)));
            }
            stmt.close();
            con.close();
            return devicesStatusList;
        } catch (Exception e) {
            e.printStackTrace();
            Logger.getLogger(DevicesStatus.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    // get all from Category table
    public ArrayList<Category> getAllCategory() {
        try {
            Connection con = DBConnect.getConnection();
            String sql = "SELECT * FROM Category";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            ArrayList<Category> cateList = new ArrayList<Category>();
            while (rs.next()) {
                cateList.add(new Category(rs.getInt(1), rs.getString(2)));
            }
            stmt.close();
            con.close();
            return cateList;
        } catch (Exception e) {
            e.printStackTrace();
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public static boolean authenticate(String username, String password) {

        UserDAO cd = new UserDAO();
        UserInfo u;
        u = cd.login(username, password);
        try {
            if (u.getUserName() != null && u.getPassword() != null) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void updateSQL(String sql) {
        try {
            Connection con = DBConnect.getConnection();
            Statement stmt = con.createStatement();
            PreparedStatement ps = con.prepareCall(sql);
            ps.executeUpdate();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            Logger.getLogger(UserInfo.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public String getValue(String username, String value) {
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

    public int countPages(String dieukien) throws SQLException, ClassNotFoundException {
        int count;
        try (Connection con = DBConnect.getConnection()) {
            String sql = "SELECT * FROM Devices " + dieukien;
            PreparedStatement ps = (PreparedStatement) con.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            count = 0;
            while (rs.next()) {
                count++;
            }
        }
        return count;
    }

    public boolean checkUserName(String userName) {
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM UserInfo WHERE userName = '" + userName + "'";
        PreparedStatement ps;
        try {
            ps = connection.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                connection.close();
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        DBHelper db = new DBHelper();
        ArrayList<Devices> d = db.getAllDevices();
     
        for (int item = 12 * (3 - 1) ; item < 36;item++) {
            System.out.println(d.get(item).toString());
        }
        
    }
}
