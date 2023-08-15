package com.talib.servletapp;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class FirstServlet implements Servlet {

    // LIFECYCLE METHODS
    ServletConfig servletConfig;

    public void init(ServletConfig servletConfig) {
        this.servletConfig = servletConfig;
        System.out.println("Creating Object.....");
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Servicing.......");

        //Set Content Type
        res.setContentType("text/html");

        // Write response content
        PrintWriter out = res.getWriter();
        out.println("<h1>Response from my first servlet</h1>");
        out.println("<h2>Today's date and time is " + new Date().toString() + "</h2>");
    }

    public void destroy() {
        System.out.println("Going to destroy servlet object!");
    }


    // NON LIFECYCLE METHODS
    public ServletConfig getServletConfig() {
        return this.servletConfig;
    }

    public String getServletInfo() {
        return "This servlet is created by Talib. It's his first servlet ever!";
    }

}
