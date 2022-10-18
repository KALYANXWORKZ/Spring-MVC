package com.xworkz.shirtdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.shirtdetails.dto.ShirtDTO;
import com.xworkz.shirtdetails.service.ShirtService;

@Controller
@RequestMapping("/shirt")
public class ShirtController {
	@Autowired
	private ShirtService service;

	public ShirtController() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onSave(ShirtDTO shirtDTO) {
		System.out.println("calling onSave method");
		System.out.println("ShirtDTO" + shirtDTO);
		boolean validateAndSave = service.validateAndSave(shirtDTO);
		System.out.println(validateAndSave);

		if (validateAndSave) {
			System.out.println("Data validate and saved");
			return "DisplaySuccess";
		}

		else {
			System.out.println("Data is not valid and not saved");
			return "index";
		}
	}
}