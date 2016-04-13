package edu.acc.java;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by lewis on 4/11/16.
 */
@WebServlet(name = "PrintOut", urlPatterns = "/PrintOut")
public class PrintOut extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
                    out.println("<h1>");
                    out.println(request.getAttribute("first"));
                    out.println(request.getAttribute("last"));
                    out.println("</h1>");


    }
}
