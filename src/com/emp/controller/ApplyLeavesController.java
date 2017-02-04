package com.emp.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.emp.model.EmployeeTO;

/**
 * Servlet implementation class ApplyLeavesController
 */
public class ApplyLeavesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static EmployeeTO employeeTO;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplyLeavesController() {
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
		String tempStartDate = request.getParameter("startDate");
		String tempEndDate = request.getParameter("endDate");
		
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date date1 = null;
		java.util.Date date2 = null;
		try {
			date1 = sdf1.parse(tempStartDate);
			date2 = sdf1.parse(tempEndDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		java.sql.Date startDate = new java.sql.Date(date1.getTime());
		java.sql.Date endDate = new java.sql.Date(date2.getTime());
		
		
		
		employeeTO.setLeaveStartDate(startDate);
		
		System.out.println(startDate+" "+endDate+" "+username);
	}

}
