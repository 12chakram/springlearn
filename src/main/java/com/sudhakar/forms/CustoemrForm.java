/**
 * 
 */
package com.sudhakar.forms;

import java.util.Date;
/**
 * @author sudhakar5589
 *
 */
public class CustoemrForm {
	
	private String UID;
	private String firstName;
	private String lastName;
	private String password;
	private String cnfmpassword;
	private long mobile;
	private String email;
	public String getUID() {
		return UID;
	}
	public void setUID(String uID) {
		UID = uID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCnfmpassword() {
		return cnfmpassword;
	}
	public void setCnfmpassword(String cnfmpassword) {
		this.cnfmpassword = cnfmpassword;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
