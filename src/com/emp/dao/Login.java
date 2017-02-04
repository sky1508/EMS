/**
 * 
 */
package com.emp.dao;

import com.emp.exceptions.ApplicationException;
import com.emp.model.UserTO;

/**
 * @author SKY
 *
 */
public interface Login {
	
	public UserTO getUserDetails(String user) throws ApplicationException;

}
