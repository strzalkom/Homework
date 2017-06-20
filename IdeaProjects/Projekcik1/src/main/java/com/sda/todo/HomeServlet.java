package com.sda.todo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by lenovo on 19.06.2017.
 */
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("**********Hello World***********");
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
        writer.println("<h1>Hello World</h1>");
//        Scanner scanner = new Scanner(getServletContext().getResourceAsStream("/test.txt"));
      InputStream stream = getServletContext().getResourceAsStream("/test.txt");
       Scanner scanner = new Scanner(stream);
       StringBuilder stringBuilder = new StringBuilder();
       stringBuilder.append("<ol>\n");
       while (scanner.hasNextLine()) {
           stringBuilder.append("<li>")
                   .append(scanner.nextLine())
                   .append("</li>\n");
       }
        stringBuilder.append("</ol>\n");
       writer.println(stringBuilder.toString());
    }
}
