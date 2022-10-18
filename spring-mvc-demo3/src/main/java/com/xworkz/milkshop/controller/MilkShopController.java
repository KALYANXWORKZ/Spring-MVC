package com.xworkz.milkshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.milkshop.dto.MilkShopDTO;
import com.xworkz.milkshop.service.MilkShopService;

@Controller
@RequestMapping("/milk")
public class MilkShopController {
	@Autowired
	private MilkShopService milkShopService;
	
	public MilkShopController() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	@PostMapping
	public String onSave(MilkShopDTO milkShopDTO) {
		System.out.println("calling onSave method");
		System.out.println("MilkShopDTO"+milkShopDTO);
		boolean validateAndSave=milkShopService.validateAndSave(milkShopDTO);
		System.out.println(validateAndSave);
		
		if(validateAndSave) {
			System.out.println("Data validate and saved");
			return "DisplaySuccess";
		}
		
		else {
			System.out.println("Data is not valid and not saved");
			return "index";
		}
		
		
	}

}
