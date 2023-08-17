package com.talib.servletapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("Welcome to register page");
        String terms = req.getParameter("terms");
        String name = req.getParameter("userName");
        String password = req.getParameter("userPassword");
        String email = req.getParameter("userEmail");
        String gender = req.getParameter("gender");
        String course = req.getParameter("course");

        if (terms != null) {
            if (terms.equals("checked")) {
                out.println("<h3>Name: " + name + "</h3>");
                out.println("<h3>Email: " + email + "</h3>");
                out.println("<h3>Password: " + password + "</h3>");
                out.println("<h3>Gender: " + gender + "</h3>");
                out.println("<h3>Course: " + course + "</h3>");
            } else {
                out.println("<h3>Please accept terms and conditions!</h3>");
            }
        } else {
            out.println("<h3>Please accept terms and conditions!</h3>");
        }


    }
}
