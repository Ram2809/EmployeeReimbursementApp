package com.ers.entity;

public class LoginEntity {
	private Integer loginId;
	private String userName;
	private String passWord;
	private String email;

	public LoginEntity() {
		super();
	}

	public LoginEntity(Integer loginId, String userName, String passWord, String email) {
		super();
		this.loginId = loginId;
		this.userName = userName;
		this.passWord = passWord;
		this.email = email;
	}

	public Integer getLoginId() {
		return loginId;
	}

	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "LoginEntity [loginId=" + loginId + ", userName=" + userName + ", passWord=" + passWord + ", email="
				+ email + "]";
	}

}
