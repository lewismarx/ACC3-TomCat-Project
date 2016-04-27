package edu.acc.java;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Created by lewis on 4/25/16.
 */
@WebServlet(name = "ServletRanName", urlPatterns = "/ranname")
public class ServletRanName extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random rannum1 = new Random();
        char inttochar = inttochar = (char) rannum1.nextInt(256);
        char storage = inttochar;

       String chara = String.valueOf(storage);
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.println(chara);
        Cookie namegen = new Cookie("RanLetter", chara);
        response.addCookie(namegen);
        String datavalue = "";
        for (Cookie data : request.getCookies()) {
            datavalue += " " + data.getValue();
        }
        out.println(datavalue);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request,response);
    }
}
