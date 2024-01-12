package com.example.demo.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Product;
@FeignClient(name="BUYPRODUCT-SERVICE")

public interface ConsumeBuyService {

	@GetMapping("api/buyProduct/product_Info")
	
	public Product getInfo();
}
