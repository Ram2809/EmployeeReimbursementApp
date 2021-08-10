package com.ers.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.ers.model.Signup;


@Entity
@Table(name = "LoginCredential")
public class LoginCredentialsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer loginId;
	private String userName;
	private String passWord;
	@OneToOne(cascade = CascadeType.ALL, targetEntity = SignupEntity.class)
	@JoinColumn(name = "empId")
	private SignupEntity empId;

	public LoginCredentialsEntity() {
		super();
	}

	public LoginCredentialsEntity(String userName, String passWord, SignupEntity signupEntity) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.empId = signupEntity;
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

	public SignupEntity getEmpId() {
		return empId;
	}

	public void setEmpId(SignupEntity signupEntity) {
		this.empId = signupEntity;
	}

	@Override
	public String toString() {
		return "LoginCredentialsEntity [userName=" + userName + ", passWord=" + passWord + ", signup=" + empId + "]";
	}

}
