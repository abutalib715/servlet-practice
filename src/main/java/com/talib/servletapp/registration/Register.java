package com.talib.servletapp.registration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


@MultipartConfig
public class Register extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");

        Part part = req.getPart("image");
        String fileName = part.getSubmittedFileName();

        PrintWriter out = resp.getWriter();

//        out.println(fileName);

        try {
//            Thread.sleep(3000);
            Class.forName("com.mysql.cj.jdbc.Driver"); // Check driver class name
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_registration", "root", "");

            if (conn != null) {
                String query = "INSERT INTO users (username, password, email,imageName) VALUES (?, ?, ?, ?)";
                PreparedStatement stmt = conn.prepareStatement(query);

                // Assuming username, password, and email are initialized elsewhere
                stmt.setString(1, username);
                stmt.setString(2, password);
                stmt.setString(3, email);
                stmt.setString(4, fileName);

                int rowsAffected = stmt.executeUpdate();

                InputStream is = part.getInputStream();
                byte[] data = new byte[is.available()];

                is.read(data);

                String path ="/img" + File.pathSeparator + fileName;
                System.out.println(path);

                FileOutputStream fos = new FileOutputStream(path);
                fos.write(data);
                fos.close();

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
        }


    }
}
