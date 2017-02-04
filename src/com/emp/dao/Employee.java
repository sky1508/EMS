/**
 * 
 */
package com.emp.dao;

import com.emp.exceptions.ApplicationException;
import com.emp.model.EmployeeTO;

/**
 * @author SKY
 *
 */
public interface Employee {
		
		public EmployeeTO getEmployeeDetails(int empID) throws ApplicationException;
		
		public int addEmployeeDetails(EmployeeTO employeeTO) throws ApplicationException;
		
		public EmployeeTO deleteEmployeeDetails(int empID) throws ApplicationException;
}
