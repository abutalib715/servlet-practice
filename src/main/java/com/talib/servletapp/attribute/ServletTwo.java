package com.talib.servletapp.attribute;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class ServletTwo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer n1 = Integer.parseInt(req.getParameter("n1"));
        Integer n2 = Integer.parseInt(req.getParameter("n2"));


        Integer sum = (int) req.getAttribute("sum");
        Integer product = n1 * n2;

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("Sum is" + sum);
        out.println("Product is " + product);


    }
}
