package com.ers.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ReimbursementRequestService")
public class ReimbursementRequestEntity {
	@ManyToOne
	@JoinColumn(name = "email", nullable = false)
	private SignupEntity userEmail;
	@Id
	private String reqId;
	@Column(nullable = false)
	private String reqType;
	@Column(nullable = false)
	private Double reqAmount;
	@Column(nullable = false)
	private String reqDate;
	@Column(nullable = false)
	private String reqStatus;
	@Column(nullable = false)
	private String reqDescription;

	public ReimbursementRequestEntity() {
		super();
	}

	public String getReqId() {
		return reqId;
	}

	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	public String getReqType() {
		return reqType;
	}

	public void setReqType(String reqType) {
		this.reqType = reqType;
	}

	public Double getReqAmount() {
		return reqAmount;
	}

	public void setReqAmount(Double reqAmount) {
		this.reqAmount = reqAmount;
	}

	public String getReqDate() {
		return reqDate;
	}

	public void setReqDate(String reqDate) {
		this.reqDate = reqDate;
	}

	public String getReqStatus() {
		return reqStatus;
	}

	public void setReqStatus(String reqStatus) {
		this.reqStatus = reqStatus;
	}

	public String getReqDescription() {
		return reqDescription;
	}

	public void setReqDescription(String reqDescription) {
		this.reqDescription = reqDescription;
	}

	public SignupEntity getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(SignupEntity userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return "ReimbursementRequestEntity [userEmail=" + userEmail + ", reqId=" + reqId + ", reqType=" + reqType
				+ ", reqAmount=" + reqAmount + ", reqDate=" + reqDate + ", reqStatus=" + reqStatus + ", reqDescription="
				+ reqDescription + "]";
	}

}
