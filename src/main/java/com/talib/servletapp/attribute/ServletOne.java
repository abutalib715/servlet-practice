package com.talib.servletapp.attribute;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ServletOne extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer n1 = Integer.parseInt(req.getParameter("n1"));
        Integer n2 = Integer.parseInt(req.getParameter("n2"));

        Integer sum = n1+n2;
        req.setAttribute("sum", sum);

        RequestDispatcher rd = req.getRequestDispatcher("servlet-two");
        rd.forward(req, resp);
    }
}
