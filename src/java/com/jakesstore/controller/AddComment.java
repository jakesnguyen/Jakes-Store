/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jakesstore.controller;

import com.jakesstore.dao.DBHelper;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jakes
 */
public class AddComment extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userID = request.getParameter("userID");
        String devicesID = request.getParameter("devicesID");
        String commentary = request.getParameter("commentary");
        String rating = request.getParameter("rating");
        String sql = "insert into Comment(userID,devicesID,commentary,star) values (N'"+userID+"',N'"+devicesID+"',N'"+commentary+"',"+rating+");";
        DBHelper.updateSQL(sql);
        String sql2 = "UPDATE SET star = (star+" + rating + ")/2 WHERE devicesID = " + devicesID + ";";
        DBHelper.updateSQL(sql2);

        request.getRequestDispatcher("ProductDetail?id=" + devicesID + "").forward(request, response);
    }

}
