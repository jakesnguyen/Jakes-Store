/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jakesstore.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author jakes
 */
public class DBConnect {

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            con = DriverManager.getConnection("jdbc:sqlserver://JAKESNGUYEN\\SQLEXPRESS:58871;databaseName=JakesStore;", "vietthuan", "thuan1998");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Fail");
        }
        return con;
    }

}
