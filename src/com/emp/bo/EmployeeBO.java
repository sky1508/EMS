/**
 * 
 */
package com.emp.bo;

import com.emp.dao.EmployeeDAO;
import com.emp.exceptions.ApplicationException;
import com.emp.model.EmployeeTO;

/**
 * @author SKY
 *
 */
public class EmployeeBO {
	//private static EmployeeTO employeeTO;
	private static EmployeeDAO employeeDAO;
	private static int response;
	
	public int addEmployee(EmployeeTO employeeTO) throws ApplicationException{
		employeeDAO = new EmployeeDAO();
		response = employeeDAO.addEmployeeDetails(employeeTO);
		return response;
	}
	
	public int ApplyLeaves() {
		
		return response;
	}
	

}
