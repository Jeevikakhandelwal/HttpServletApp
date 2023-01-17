package com.abc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns ={"/demo"}, loadOnStartup =1)
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static {
		System.out.println("************TESTSERVLET LOADING****************");
	}
	public TestServlet() {
		System.out.println("************TESTSERVLET INSTANTIATION****************");
	}
	
	public void init() throws ServletException {
		super.init();
		System.out.println("************TESTSERVLET INTIALIZATION****************");
	}

	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp )throws ServletException, IOException {
		System.out.println("***************REQUEST PROCESSING LOGIC*********************");
	}
	
	public void destroy() {
		System.out.println("************TESTSERVLET DEINSTATIATION****************");
	}
}
