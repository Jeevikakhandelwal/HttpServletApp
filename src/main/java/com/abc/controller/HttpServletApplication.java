package com.abc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class HttpServletApplication extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static {
		System.out.println("************SERVLET LOADING****************");
	}
	public HttpServletApplication() {
		System.out.println("************SERVLET INSTANTIATION****************");
	}
	public void init(ServletConfig config) throws ServletException {
		System.out.println("************SERVLET INTIALIZATION****************");
	}

	public void destroy() {
		System.out.println("************SERVLET DEINSTATIATION****************");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Setting the MIME response
		response.setContentType("text/html");
		
		//Sending dynamic response to the client
		Date date = new Date();
		
		//printWriter Stream to get the printWriter
		PrintWriter out=response.getWriter();
		
		out.println("<html><head><title>Response</title></head>");
		out.println("<body>");
		out.println("<h1>Todays date is::  "+date.toString()+"</h1>");
		out.println("</body>");
		
		//Closing the stream 
		out.close();
	}

}
