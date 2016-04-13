package edu.acc.java;

import com.oracle.tools.packager.IOUtils;
import sun.nio.ch.IOUtil;


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
@WebServlet(urlPatterns = "/Servlet1", name = "ServletCBootStrap")
public class ServletBootStrap extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Enumeration<String> headerNames = request.getHeaderNames();
        String Headers = "";
        ReadInPlugin data = new ReadInPlugin();
        String inputhtml = "TopPart.html";


        out.println("<!DOCTYPE html>\n");
        out.println("<html lang=\"en\">\n");
        out.println( "<head>\n");
        out.println("<link rel=\"shortcut icon\" href=\"favicon.ico\" type=\"image/x-icon\">");
        out.println(  "  <title>Bootstrap Table Type </title>\n" );
        out.println("  <meta charset=\"utf-8\">\n");
        out.println("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
        out.println("  <link rel=\"stylesheet\" href=\"/css/bootstrap.min.css\">\n");
        out.println("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js\"></script>\n");
        out.println( "  <script src=\"/js/bootstrap.min.js\"></script>\n");
        out.println( "  <script src=\"https://ajax.googleapis.com/ajax/libs/webfont/1.6.16/webfont.js\"></script>\n");

        out.println("<script>\n" +
                "  WebFont.load({\n" +
                "    google: {\n" +
                "      families: ['Satisfy::latin', 'Montserrat::latin']\n" +
                "    }\n" +
                "  });\n" +
                "</script>");
        out.println("</head>\n");
        out.println("<body>\n");
        out.println("\n");
        out.println( "<div class=\"container\">\n");
        out.println("  <h2 style=\"font-family: 'Montserrat', latin;\"" +
                ">Headers</h2>\n");
        out.println("  <p></p>            \n");
        out.println("  <table class=\"table table-striped\">\n");
        out.println("    <thead>\n" );
        out.println("      <tr>\n");
        out.println("        <th>Header Name:</th>\n");
        out.println("        <th>Header Value:</th>\n");
        out.println("      </tr>\n");
        out.println("    </thead>\n");
        out.println("    <tbody>");



        while (headerNames.hasMoreElements()) {
            String HeaderName = headerNames.nextElement();
            String HeaderValue = request.getHeader(HeaderName);

            out.println("<tr>\n");
            out.println( "        <td style=\"font-family: 'Montserrat', latin;\" class=\"danger\">" + HeaderName + "</td>\n");
            out.println( "        <td style=\"font-family: 'Satisfy', cursive;\" class=\"success\">" + HeaderValue + "</td>\n");
            out.println("      </tr>");
        }

            out.println("</tbody>\n" );
        out.println("  </table>\n");
        out.println("</div>\n");
        out.println("\n");
        out.println("</body>\n");
        out.println("</html>");



    }
}