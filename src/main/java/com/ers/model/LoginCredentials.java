package com.ers.model;

public class LoginCredentials {
	private String userName;
	private String passWord;
	private Integer empId;

	public LoginCredentials() {
		super();
	}

	public LoginCredentials(String userName, String passWord, Integer empId) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.empId = empId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "LoginCredentials [userName=" + userName + ", passWord=" + passWord + ", empId=" + empId + "]";
	}

}
