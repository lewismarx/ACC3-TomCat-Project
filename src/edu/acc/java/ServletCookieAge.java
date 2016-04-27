package edu.acc.java;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lewis on 4/25/16.
 */
@WebServlet(name = "ServletCookieAge", urlPatterns = "/CookieAge")
public class ServletCookieAge extends HttpServlet {
    final static int maxage = 60;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie hiroshima = new Cookie("nagisaki", String.valueOf(java.util.UUID.randomUUID()));
        hiroshima.setMaxAge(maxage);
        hiroshima.setPath("/");
        response.addCookie(hiroshima);

        ServletBeanCookie storage1 = new ServletBeanCookie(hiroshima.getName(), hiroshima.getValue(), hiroshima.getMaxAge());
        request.setAttribute("storage1", storage1);
        String cookienames = "";
        String cookievals = "";
        for(Cookie cookie : request.getCookies()) {
           String namevalue = cookie.getName();
            String valvalue = cookie.getValue();
            cookienames += namevalue + " ";
            cookievals += valvalue + " ";
            System.out.println(valvalue);
            System.out.println(namevalue);

        }
        request.setAttribute("cookienamelist", String.valueOf(cookienames));
        request.setAttribute("cookievallist", String.valueOf(cookievals));
        request.getRequestDispatcher("/just_for_grins/cookiereader.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request,response);
    }
}
