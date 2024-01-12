package com.example.demo.Controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Model.Product;

@RestController
@RequestMapping("api/buyProduct/")
public class buyProductController {

	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("buy")
	public String buyProuct() {
		
		String a =restTemplate.getForObject("http://PAYMENT-SERVICE/api/payment/pay", String.class);
		
		return a ;
		
	}
	@GetMapping("/product_Info")
	
	public Product getInfo() {
		
		return new Product("IPHONE", new Random().nextInt(1000)+1000); //get number between 1000 and 2000
	}
	

}
 