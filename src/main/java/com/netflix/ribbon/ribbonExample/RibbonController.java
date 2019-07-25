package com.netflix.ribbon.ribbonExample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class RibbonController {
	
	@RequestMapping("/abc")
	public void test() {
		
		System.out.println("aaaaaaaaaaa");
		
	}
	

}
