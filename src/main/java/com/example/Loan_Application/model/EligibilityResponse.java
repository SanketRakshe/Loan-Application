package com.example.Loan_Application.model;

public class EligibilityResponse {
	private boolean eligibilityFlag;
	private String message;
	
	public boolean isEligibilityFlag() {
		return eligibilityFlag;
	}
	
	public void setEligibilityFlag(boolean eligibilityFlag) {
		this.eligibilityFlag = eligibilityFlag;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
