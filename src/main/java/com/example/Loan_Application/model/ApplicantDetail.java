package com.example.Loan_Application.model;

public class ApplicantDetail {
	private String applicantName;
	private String loanType;
	private int loanAmount;
	private int applicantAge;
	
	public String getApplicantName() {
		return applicantName;
	}
	
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	
	public String getLoanType() {
		return loanType;
	}
	
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	
	public int getLoanAmount() {
		return loanAmount;
	}
	
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	public int getApplicantAge() {
		return applicantAge;
	}
	
	public void setApplicantAge(int applicantAge) {
		this.applicantAge = applicantAge;
	}
}
