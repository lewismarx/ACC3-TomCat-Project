package edu.acc.java;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lewis on 4/13/16.
 */
@WebServlet(name = "ServletD", urlPatterns = "/ServletD")
public class ServletD extends HttpServlet {
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
        request.setAttribute("useragent", request.getHeader("user-agent"));
        request.setAttribute("host", request.getHeader("host"));
        request.setAttribute("accept", request.getHeader("accept"));
        request.getRequestDispatcher("ServletD1.jsp").forward(request, response);

    }
    }

