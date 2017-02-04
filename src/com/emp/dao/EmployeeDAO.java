/**
 * 
 */
package com.emp.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.emp.exceptions.ApplicationException;
import com.emp.exceptions.DatabaseOperationException;
import com.emp.model.EmployeeTO;
import com.emp.model.UserTO;
import com.emp.util.DbUtil;

/**
 * @author SKY
 *
 */
public class EmployeeDAO implements Employee {
	int response = 0;// Variable for storing the response value
	private static EmployeeTO employeeTO;
	private Connection connection;
	private ResultSet resultSet;
	private PreparedStatement preparedStatement;

	/* (non-Javadoc)
	 * @see com.emp.dao.Employee#getEmployeeDetails(int)
	 */
	@Override
	public EmployeeTO getEmployeeDetails(int empID) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.emp.dao.Employee#addEmployeeDetails(int)
	 */
	@Override
	public int addEmployeeDetails(EmployeeTO employeeTO) throws ApplicationException {
		// TODO Auto-generated method stub
		
		String firstName = employeeTO.getFirstName();
		String lastName = employeeTO.getLastName();
		Date dob = employeeTO.getDob();
		String gender = employeeTO.getGender();
		String email = employeeTO.getEmail();
		long mobileNumber = employeeTO.getMobileNumber();
		String salary = employeeTO.getSalary();
		String street = employeeTO.getStreet();
		String city = employeeTO.getCity();
		String state = employeeTO.getState();
		String country = employeeTO.getCountry();
		int pincode = employeeTO.getPincode();
		
		/*String query = "insert into emp "
				+ "(firstName, lastName, dob, gender, email, mobileNumber, salary, street, city, state, country, pincode) values ("
				+firstName+","+ lastName +","+ dob +","+gender+","+email+","+mobileNumber+","+salary+","+street+","
				+city+","+state+","+country+","+pincode+")";*/
		
		String query = "insert into emp "
				+ "(firstName, lastName, dob, gender, email, mobileNumber, salary, street, city, state, country, pincode) values "
				+ "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			connection = DbUtil.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, firstName );
			preparedStatement.setString(2, lastName);
			preparedStatement.setDate(3, dob);
			preparedStatement.setString(4, gender);
			preparedStatement.setString(5, email);
			preparedStatement.setLong(6, mobileNumber);
			preparedStatement.setString(7, salary);
			preparedStatement.setString(8, street);
			preparedStatement.setString(9, city);
			preparedStatement.setString(10, state);
			preparedStatement.setString(11, country);
			preparedStatement.setInt(12, pincode);
            response = preparedStatement.executeUpdate();
            System.out.println(response);
		} catch (SQLException e) {
			throw new DatabaseOperationException("SQL Exception happened", e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			throw new ApplicationException(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new ApplicationException(e);
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}

				if (resultSet != null) {
					resultSet.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new DatabaseOperationException("SQL Exception happened",e);
			}

		}

		return response;
	}

	/* (non-Javadoc)
	 * @see com.emp.dao.Employee#deleteEmployeeDetails(int)
	 */
	@Override
	public EmployeeTO deleteEmployeeDetails(int empID)
			throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

}
