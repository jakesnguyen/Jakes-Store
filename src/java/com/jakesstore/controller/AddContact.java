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
public class AddContact extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String name = request.getParameter("name");
        String Email = request.getParameter("email");
        String message = request.getParameter("message");
        String mess = "Your message have been send to me!";
        request.setAttribute("MESS2", mess);
        DBHelper.updateSQL("INSERT INTO Contact (contactName, contactEmail, contactText) VALUES (N'" + name + "',N'" + Email + "',N'" + message + "');");
        request.getRequestDispatcher("contact.jsp").forward(request, response);
    }

}
