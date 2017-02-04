/**
 * 
 */
package com.emp.model;

/**
 * @author SKY
 *
 */
public class UserTO {
	
	private String userid;
	
	/** The password. */
	private String password;
	
	public UserTO() {
	}
	
	public UserTO(String userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
