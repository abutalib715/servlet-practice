package com.talib.servletapp.filter;

import jakarta.servlet.*;

import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
//        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Before Filter!");

        chain.doFilter(request, response);

        System.out.println("After Filter!");
    }

    @Override
    public void destroy() {
//        Filter.super.destroy();
    }
}
