package com.talib.servletapp.cookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class ServletTwo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        Cookie[] cookies = req.getCookies();

        Boolean f = false;
        String name = "";

        if (cookies == null) {
            out.println("You are a new user, please go to home page and submit your name!");
            return;
        } else {
            for (Cookie c : cookies) {
                if (c.getName().equals("user_name")) {
                    f = true;
                    name = c.getValue();
                }
            }
        }

        if (f) {
            out.println("<h2>Welcome: " + name + "</h2>");
        } else {
            out.println("You are a new user, please go to home page and submit your name!");
        }
    }
}
