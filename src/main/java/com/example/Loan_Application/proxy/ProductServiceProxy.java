package com.example.Loan_Application.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Loan_Application.model.Product;

//@FeignClient(name="product-service", url="localhost:8000")
@FeignClient(name="product-service")
public interface ProductServiceProxy {
	@GetMapping("/product_info/{productName}")
	public Product getProduct(@PathVariable String productName);
}
