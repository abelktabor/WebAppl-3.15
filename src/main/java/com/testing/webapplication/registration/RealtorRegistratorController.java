package com.testing.webapplication.registration;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/registration")
public class RealtorRegistratorController {
	private RegisService regisService;

	public RealtorRegistratorController() {
		// TODO Auto-generated constructor stub
	}
	
	//methods 
	
	public String register(@RequestBody RegisRequest request) {
		return regisService.register(request);
	}

}
