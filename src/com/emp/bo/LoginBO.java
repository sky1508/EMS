/**
 * 
 */
package com.emp.bo;

import com.emp.dao.LoginDAO;
import com.emp.exceptions.ApplicationException;
import com.emp.model.UserTO;

/**
 * @author SKY
 *
 */
public class LoginBO {
	private static LoginDAO loginDAO;
	private static UserTO userTO;
	
	public int loginValidation(String user, String pass) throws ApplicationException {
		userTO = new UserTO();
		loginDAO = new LoginDAO();
		userTO = loginDAO.getUserDetails(user);
		userTO.setUserid(user);
		if(userTO.getUserid().equals(user) && userTO.getPassword().equals(pass))
		{
			System.out.println("Success");
			return 1;
		}
		else
			return 0;
		
	}


}
