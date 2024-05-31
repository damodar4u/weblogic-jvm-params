package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class TestServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String dbUsername = System.getProperty("db.username");
        String dbPassword = System.getProperty("db.password");

        response.setContentType("text/plain");
        response.getWriter().println("Database Username: " + dbUsername);
        response.getWriter().println("Database Password: " + dbPassword);
    }
}
