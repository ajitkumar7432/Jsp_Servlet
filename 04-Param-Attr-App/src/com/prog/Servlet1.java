package com.prog;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int fn=Integer.parseInt(req.Parameter("fn"));
		int sn=Integer.parseInt(req.Parameter("sn"));
		
		int sum=fn+sn;
		req.setAttribute("s", sum);
		RequestDispatcher rd=req.getRequestDispatcher("/servlet2");
		rd.forward(req,resp);
		
	}

	

	
}
