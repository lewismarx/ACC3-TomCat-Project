package edu.acc.java;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lewis on 4/18/16.
 */
@WebServlet(name = "AmazonServlet", urlPatterns = "/AmazonServlet")
public class AmazonServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String search_param = request.getParameter("keywords");
        if (search_param == "null") {
            search_param = "";

        }
        response.sendRedirect("http://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=" + search_param);
        //keywords=toiletpaper

    }
}
