package edu.acc.java;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;


/**
 * Created by lewis on 4/6/16.
 */
//@WebServlet(name = "GetMethods")
@WebServlet("/GetMethods")
public class GetMethods extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    PrintWriter out = response.getWriter();
doGet(request, response);



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        Enumeration<String> headerNames = request.getHeaderNames();
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("ASCII");
        //response.setHeader("cache-control", "100");


        boolean test = false;
        out.println(" <script src=\"https://ajax.googleapis.com/ajax/libs/webfont/1.6.16/webfont.js\"></script>"
        );
        out.println("<script>\n" +
                "  WebFont.load({\n" +
                "    google: {\n" +
                "      families: ['Satisfy::latin', 'Montserrat::latin']\n" +
                "    }\n" +
                "  });\n" +
                "</script>");

        out.println("<h1 style=\"font-family: 'Montserrat', sans-serif;\"> Headers </h1>");
        String Headers = "";
        while (headerNames.hasMoreElements()) {
            out.println("<h2 style=\"font-family: 'Satisfy', cursive;\">");
            String HeaderName = headerNames.nextElement();
            out.println("Header Name: </h2>");
                    out.println("<h3>" + HeaderName + "</h3>");
            String HeaderValue = request.getHeader(HeaderName);
            out.print("<h2 style=\"font-family: 'Satisfy', cursive;\">" );
                    out.println(" Header Value: ");
                            out.print("</h2>");
                            out.print("<h3>" + HeaderValue + "</h3>");
        }
    }
}
