package com.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstProgram implements Servlet {

    @Override
    public void destroy() {
        System.out.println("destroy method called");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void init(ServletConfig arg0) throws ServletException {
        System.out.println("init method called");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service method called");
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        out.println("Welcome to Servlet");
        out.println("Today"+new Date().toString());
    }

}
