package com.talib.servletapp.cookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class ServletOne extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");

        Cookie cookie = new Cookie("name", name);
        resp.addCookie(cookie);

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<h2>Welcome: " + name +"</h2>");
        out.println("<a href='cookie-two'>Goto second servlet</a>");
    }
}
