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

/**
 *
 * @author jakes
 */
public class ProductDetail extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             response.setContentType("text/html;charset=UTF-8");
        String index = "1";
        if (request.getParameter("id") != null) {
            index = request.getParameter("id");
        }
        DBHelper.updateSQL("UPDATE Devices\n"
                + "SET viewCount = viewCount +1\n"
                + "WHERE devicesID = " + index + " ;");
        request.setAttribute("id", index);
        request.getRequestDispatcher("ProductDetail.jsp").forward(request, response);
    }
    
}
