package com.emp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.emp.bo.LoginBO;
import com.emp.exceptions.ApplicationException;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static LoginBO loginBO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = (String) request.getParameter("username");
		String password = (String) request.getParameter("password");
		HttpSession session = request.getSession();
		session.setAttribute("username", username);
		try {
			loginBO = new LoginBO();
			int result = loginBO.loginValidation(username, password);
			System.out.println(result);
			if(result==1)
			{
				response.sendRedirect("AdminHome.jsp"); 
			}
			else
			{
				System.out.println("LoginCtrllr Error"+result);
			}
			
		} catch (ApplicationException e) {
			e.printStackTrace();
		}
	}

}
