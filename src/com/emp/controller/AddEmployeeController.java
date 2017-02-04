package com.emp.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.bo.EmployeeBO;
import com.emp.exceptions.ApplicationException;
import com.emp.model.EmployeeTO;

/**
 * Servlet implementation class EmployeeController
 */
public class AddEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static EmployeeTO employeeTO;
	private static EmployeeBO employeeBO;
	private static int result;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployeeController() {
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
		employeeTO = new EmployeeTO();
		employeeBO = new EmployeeBO();
		
		String firstName = (String) request.getParameter("firstName");
		String lastName = (String) request.getParameter("firstName");
		//Date dob = (Date) request.getParameter("firstName");
		String gender = (String) request.getParameter("gender");
		String email = (String) request.getParameter("email");
		long mobileNumber = Long.parseLong(request.getParameter("mobileNumber"));
		String salary = (String) request.getParameter("salary");
		String street = (String) request.getParameter("street");
		String city = (String) request.getParameter("city");
		String state = (String) request.getParameter("state");
		String country = (String) request.getParameter("country");
		int pincode = Integer.parseInt(request.getParameter("pincode"));
		
		String startDate= request.getParameter("dob");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date = null;
		try {
			date = sdf1.parse(startDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		java.sql.Date dob = new java.sql.Date(date.getTime());
		
		employeeTO = new EmployeeTO(firstName, lastName, dob, gender, email, mobileNumber, salary, street, city, state, country, pincode);
		try {
			result = employeeBO.addEmployee(employeeTO);
			System.out.println("Employee Added");
		} catch (ApplicationException e) {
			e.printStackTrace();
		}
		
		
	}

}
