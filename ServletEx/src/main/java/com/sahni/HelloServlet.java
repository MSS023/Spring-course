package com.sahni;

import org.jetbrains.annotations.NotNull;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    public HelloServlet() {
        System.out.println("Servlet Initialised");
    }

    public void doGet(HttpServletRequest req, @NotNull HttpServletResponse res) throws IOException {
        System.out.println("In service");

        res.setContentType("text/html");

        res.getWriter().println("<h2><b>Hello World<b></h2>");
    }
}
