package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;


@WebServlet("/login")
public class FirstServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String em=req.getParameter("em");
		String em=req.getParameter("ps");
		resp.setContenType("text/html"();
		PrintWriter out=resp.getWriter();
		RequestDispatcher rd;
		if("demo@gmail.com".equals(em)  &&  "demo".equals(ps))
		{
			rd=req.getRequestDispatcher("/servlet2");
			rs.forward(req,resp);
		}
		else {
			out.print("h4> Invalid Email & Password </h4>");
			rd=req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
			
		}
			
		
		
	}

}
