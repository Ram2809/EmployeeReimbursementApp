package com.ers.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.ers.model.Signup;

@Entity
@Table(name = "employee")
public class SignupEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private Integer age;
	private String gender;
	private String email;
	private String contactNo;
	private String address;
	private String employeeType;
	@OneToOne(cascade=CascadeType.ALL,targetEntity=LoginCredentialsEntity.class)
	@JoinColumn(name="loginId")
	private Signup signup;
	public SignupEntity() {
		super();
	}
	public SignupEntity(Integer empId, String firstName, String lastName, String dateOfBirth, Integer age,
			String gender, String email, String contactNo, String address, String employeeType, Signup signup) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.contactNo = contactNo;
		this.address = address;
		this.employeeType = employeeType;
		this.signup = signup;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
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
	public Signup getSignup() {
		return signup;
	}
	public void setSignup(Signup signup) {
		this.signup = signup;
	}
	@Override
	public String toString() {
		return "SignupEntity [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", age=" + age + ", gender=" + gender + ", email=" + email + ", contactNo=" + contactNo
				+ ", address=" + address + ", employeeType=" + employeeType + ", signup=" + signup + "]";
	}

	

}
