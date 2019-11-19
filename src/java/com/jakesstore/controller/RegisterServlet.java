/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jakesstore.controller;

import com.jakesstore.dao.DBHelper;
import com.jakesstore.model.UserInfo;
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
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        String userName = request.getParameter("username");
        String Email = request.getParameter("email");
        String Password = request.getParameter("password");
        String userDisplayName = request.getParameter("userdisplayname");
        String Address = request.getParameter("address");
        String Phone = request.getParameter("phone");
        String notification = "";
        notification = request.getParameter("notification");

        request.setAttribute("notification", notification);
        request.getRequestDispatcher("login.jsp").forward(request, response);
        DBHelper.updateSQL("INSERT INTO UserInfo (userName, email, userDisplayName,password,phone,address,point,roleID,money) VALUES (N'" + userName + "',N'" + Email + "',N'" + userDisplayName + "',N'" + Password + "',N'" + Phone + "',N'" + Address + "',0,2,0);");
        request.getRequestDispatcher("login.jsp").forward(request, response);

    }

}
