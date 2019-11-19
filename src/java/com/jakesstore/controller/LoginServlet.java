/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jakesstore.controller;

import com.jakesstore.dao.DBHelper;
import com.jakesstore.dao.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jakes
 */

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        UserDAO ud = new UserDAO();
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        boolean success = DBHelper.authenticate(username.trim(), password.trim());
        if (success) {
            HttpSession httpSession = request.getSession();
            httpSession.setAttribute("sessUserID", ud.getValueInt(username.trim(), "userID"));
            httpSession.setAttribute("sessUserName", ud.getValueString(username.trim(), "userName"));
            httpSession.setAttribute("sessEmail", ud.getValueString(username.trim(), "email"));
            httpSession.setAttribute("sessUserDisplayName", ud.getValueString(username.trim(), "userDisplayName"));
            httpSession.setAttribute("sessAddress", ud.getValueString(username.trim(), "address"));
            httpSession.setAttribute("sessPhone", ud.getValueInt(username.trim(), "phone"));
            httpSession.setAttribute("sessRoleID", ud.getValueInt(username.trim(), "roleID"));
            httpSession.setAttribute("sessPoint", ud.getValueInt(username.trim(), "point"));
            httpSession.setAttribute("sessMoney", ud.getValueInt(username.trim(), "money"));
            
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        else{
             
             
              
              request.getRequestDispatcher("login.jsp").forward(request, response);
        }
         

    request.getRequestDispatcher("/index.jsp").forward(request, response);
    }


}
