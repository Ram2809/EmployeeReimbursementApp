package com.ers.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class SignupEntity {
	@Column(nullable=false)
	private String firstName;
	@Column(nullable=false)
	private String lastName;
	@Column(nullable=false)
	private String dateOfBirth;
	@Column(nullable=false)
	private Integer age;
	@Column(nullable=false)
	private String gender;
	@Id
	private String email;
	@Column(nullable=false)
	private String contactNo;
	@Column(nullable=false)
	private String address;
	@Column(nullable=false)
	private String employeeType;
	@OneToOne(mappedBy = "user")
	private LoginCredentialsEntity loginCredentialsEntity;

	public SignupEntity() {
		super();
	}

	public SignupEntity(String firstName, String lastName, String dateOfBirth, Integer age, String gender, String email,
			String contactNo, String address, String employeeType, LoginCredentialsEntity loginCredentialsEntity) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.contactNo = contactNo;
		this.address = address;
		this.employeeType = employeeType;
		this.loginCredentialsEntity = loginCredentialsEntity;
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

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public LoginCredentialsEntity getLoginCredentialsEntity() {
		return loginCredentialsEntity;
	}

	public void setLoginCredentialsEntity(LoginCredentialsEntity loginCredentialsEntity) {
		this.loginCredentialsEntity = loginCredentialsEntity;
	}

	@Override
	public String toString() {
		return "SignupEntity [firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth
				+ ", age=" + age + ", gender=" + gender + ", email=" + email + ", contactNo=" + contactNo + ", address="
				+ address + ", employeeType=" + employeeType + ", loginCredentialsEntity=" + loginCredentialsEntity
				+ "]";
	}

}
