package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/payment/")
public class PaymentController {
	
	@Value("${server.port}")
	private int port ;
	
	@GetMapping("pay")
	public String  pay() {
		
		
		return "microservice payment choosed with the port number "+port;
}
}