package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Product;
import com.example.demo.feignClient.ConsumeBuyService;

@RestController
@RequestMapping("api/check/")
public class CheckConroller {
	
	@Autowired
	private ConsumeBuyService consumeServiceBuyProduct;
	
	
	@GetMapping("product")
	public String checkProduct() {
		Product p = consumeServiceBuyProduct.getInfo();
		if (p.getPrice()>1500) return "product <span style='color:green'> perfect</span> cause he's over than 1500";
		if (p.getPrice()==1500) return "product <span style='color:blue'> Normal</span> cause he's equal than 1500";
		if (p.getPrice()<1500) return "product <span style='color:red'> bad Quality</span> cause he's less than 1500";
			return "";
	}
}
