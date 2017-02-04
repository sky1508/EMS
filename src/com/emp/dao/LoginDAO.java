/**
 * 
 */
package com.emp.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.emp.exceptions.ApplicationException;
import com.emp.exceptions.DatabaseOperationException;
import com.emp.model.UserTO;
import com.emp.util.DbUtil;

/**
 * @author SKY
 *
 */
public class LoginDAO implements Login {
		int response = 0;// Variable for storing the response value
		private static UserTO userTO;
		private Connection connection;
		private Statement statement;
		private ResultSet resultSet;

	/* (non-Javadoc)
	 * @see com.emp.dao.Login#getUserDetails(com.emp.model.UserTO)
	 */
	@Override
	public UserTO getUserDetails(String user) throws ApplicationException {
		
		String query = "SELECT * FROM emplogin where username="+"\""+user+"\"";
	    

		try {
			connection = DbUtil.getConnection();
			statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                /*int id = resultSet.getInt(1);
                System.out.println("id=" + id);
            	
                String name = resultSet.getString(1);
                userTO.setUserid(name);*/
                
                String pass = resultSet.getString(1);
                userTO = new UserTO();
                userTO.setPassword(pass);
                
                System.out.println("pass "+pass); 
              }
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
				if (statement != null) {
					statement.close();
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

		return userTO;
	}

}
