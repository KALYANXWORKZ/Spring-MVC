package com.xworkz.dasara.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class LandController {

	public LandController() {

		System.out.println("LandController is created");
	}

	@RequestMapping("/Click.do")
	public String onClick() {
		System.out.println("calling onclick method");
		return "index.jsp";
	}

}
