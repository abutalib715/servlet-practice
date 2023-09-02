package com.talib.servletapp.registration;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Register extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");

        PrintWriter out = resp.getWriter();


        try {
            Thread.sleep(3000);
            Class.forName("com.mysql.cj.jdbc.Driver"); // Check driver class name
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_registration", "root", "");

            if (conn != null) {
                String query = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
                PreparedStatement stmt = conn.prepareStatement(query);

                // Assuming username, password, and email are initialized elsewhere
                stmt.setString(1, username);
                stmt.setString(2, password);
                stmt.setString(3, email);

                int rowsAffected = stmt.executeUpdate();

                if (rowsAffected > 0) {
                    out.println("success");
                } else {
                    out.println("error");
                }

                conn.close(); // Close the connection when done
            } else {
                out.println("error");
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            out.println("Error: MySQL JDBC driver not found.");
        } catch (SQLException ex) {
            ex.printStackTrace();
            out.println("Error: " + ex.getMessage());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
