package com.table;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JavaTable extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		int n1=Integer.parseInt(req.getParameter("Number"));
		out.print("<html><body>");
		for(int i=1;i<=10;i++) {
			out.print("<h3>"+n1+"x"+i+"="+n1+"</h3>");
		}
		out.print("</body></html>");
	}

}
