package edu.acc.java;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by lewis on 4/27/16.
 */
@WebServlet(name = "ServletNonStandardPath", urlPatterns = "/CookiesRUs/test1")
public class ServletNonStandardPath extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie textedit = new Cookie("textdata", String.valueOf(java.util.UUID.randomUUID()));
        textedit.setPath("/CookiesRUs/test1");
        textedit.setMaxAge(30);
        Cookie ytextedit = new Cookie("textdatay", "If Returned then your a retarded moose");
        ytextedit.setPath("/CookiesRUs/test2");
        ytextedit.setMaxAge(30);
        PrintWriter out = response.getWriter();
        out.println("Success" + "\n");
        response.addCookie(textedit);
        response.addCookie(ytextedit);
        Cookie[] cookies = request.getCookies();
        String cookieName = "userIdCookie";
        String cookieValue = "";
        response.setContentType("text/plain");
        for (Cookie cookie: cookies) {

            out.print(cookie.getName());
            out.print(" " + cookie.getValue());
            out.print(" " + cookie.getPath() + "\n");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request, response);
    }
}
