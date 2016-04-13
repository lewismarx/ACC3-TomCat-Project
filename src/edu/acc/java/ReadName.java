package edu.acc.java;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lewis on 4/11/16.
 */
@WebServlet(name = "ReadName", urlPatterns = "/ReadName")
public class ReadName extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String first = request.getParameter("first");
        String last = request.getParameter("last");
        if(request.getParameter("first") != null) {
            request.setAttribute("first", request.getParameter("first"));
        }
        if(request.getParameter("last") != null) {
            request.setAttribute("last", request.getParameter("last"));
        }
        request.getRequestDispatcher("/PrintOut").forward(request, response);

    }
}
