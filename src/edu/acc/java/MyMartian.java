package edu.acc.java;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Random;
import java.nio.file.Files;

/**
 * Created by lewis on 4/4/16.
 */
@WebServlet("/Martian")
public class MyMartian extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random test = new Random();
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");


        Double number = test.nextDouble();

        out.println("<h3>" + number.toString() + "</h3>");
    ;



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request, response);
    }




}


