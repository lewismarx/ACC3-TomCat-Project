package edu.acc.java;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lewis on 4/20/16.
 */
@WebServlet(name = "ServletG", urlPatterns = "/ServletG")
public class ServletG extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String host = request.getHeader("host");
        String accept = request.getHeader("accept");
        String useragent = request.getHeader("user-agent");
        //Put data in headerbean
        ServletBean1 headerbean = new ServletBean1(accept,host,useragent);
        //store where jsp can get to it
        request.setAttribute("bean", headerbean);
        //forward to jsp

        request.getRequestDispatcher("/ServletG.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request, response);
    }
}
