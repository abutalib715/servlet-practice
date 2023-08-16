package com.talib.servletapp;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class SecondServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Servicing from second servlet created by Generic Servlet!");

        servletResponse.setContentType("text/html");
        PrintWriter out = servletResponse.getWriter();
        out.println("<h1>Hello, From Generic Servlet</h1>");
    }
}
