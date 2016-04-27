package edu.acc.java;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by lewis on 4/25/16.
 */
@WebServlet(name = "ServletSession", urlPatterns = "/Sessions")
public class ServletSession extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    HttpSession sessionidobject = request.getSession();
        request.setAttribute("id", String.valueOf(sessionidobject.getId()));
        request.setAttribute("xnew", String.valueOf(sessionidobject.isNew()));
        sessionidobject.setMaxInactiveInterval(60);
        request.getRequestDispatcher("/just_for_grins/sessionid.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request,response);
    }
}
