package edu.acc.java;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by lewis on 4/27/16.
 */
@WebServlet(name = "ServletPostInput", urlPatterns = "/SessionPassing/servlet1")
public class ServletPostInput extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String paramater_storage = "";

        String username = request.getParameter("firstName");
        String password = request.getParameter("lastName");
        PrintWriter IOutWriter = response.getWriter();
        String[] Paramater_Array = {username,password};
        request.setAttribute("Parameter_Array", Paramater_Array);
        IOutWriter.println(username + " " + password);


    }

    //protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    //}
}
