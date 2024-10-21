package com.example.Loan_Application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Loan_Application.model.ApplicantDetail;
import com.example.Loan_Application.model.EligibilityResponse;
import com.example.Loan_Application.model.Product;
import com.example.Loan_Application.proxy.ProductServiceProxy;

@RestController
public class LoanApplicationController {

	@Autowired
    private ProductServiceProxy productServiceProxy;

    @PostMapping("/check-eligibility")
    public ResponseEntity<EligibilityResponse> isApplicantEligibility(@RequestBody ApplicantDetail applicantDetail) {
        
    	Product product = productServiceProxy.getProduct(applicantDetail.getLoanType());

        EligibilityResponse response = new EligibilityResponse();
        
        if (product != null && applicantDetail.getApplicantAge() >= product.getMinAge()
                && applicantDetail.getApplicantAge() <= product.getMaxAge()) {
            response.setEligibilityFlag(true);
            response.setMessage("Applicant is eligible for the loan.");
        } else {
            response.setEligibilityFlag(false);
            response.setMessage("Applicant is not eligible for the loan.");
        }

        return ResponseEntity.ok(response);
    }
}
