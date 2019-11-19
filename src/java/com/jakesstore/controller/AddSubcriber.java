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
public class AddSubcriber extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        String Email = request.getParameter("email");
        String mess = "";
        request.setAttribute("MESS2", mess);
        DBHelper.updateSQL("INSERT INTO Subcribers (subcriberName) VALUES (N'" + Email + "');");
  
        request.getRequestDispatcher("subcriber.jsp").forward(request, response);
    }


}
