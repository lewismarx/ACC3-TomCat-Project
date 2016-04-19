package edu.acc.java;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by lewis on 4/13/16.
 */
@WebServlet(name = "Servlety")
public class Servlety extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String universal = getServletContext().getInitParameter("universal");
        out.println("<h2>" + getServletContext().getInitParameter("universal"));
        String my_parm = getInitParameter("my_param");
        out.println(my_parm + "</h2>");
    }
}
