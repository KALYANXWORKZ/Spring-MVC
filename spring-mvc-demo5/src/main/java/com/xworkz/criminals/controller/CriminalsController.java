package com.xworkz.criminals.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.criminals.dto.CriminalsDTO;
import com.xworkz.criminals.service.CriminalsService;

@Controller
@RequestMapping("/Criminal")
public class CriminalsController {
	@Autowired
	private CriminalsService criminalsService;

	public CriminalsController() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onSave(CriminalsDTO criminalsDTO, Model model) {
		System.out.println("calling on save method");
		System.out.println("CriminalsDTO"+criminalsDTO);
		Boolean validateAndSave= criminalsService.validateAndSave(criminalsDTO);

		if(validateAndSave) {
			System.out.println("Data is valid and saved");
			model.addAttribute("records", "Records are Saved");
			return "index";
		}
		else {
			System.out.println("Data is Invalid and not saved");
			return "index";
		}
	}

		@GetMapping
		public String readAll(Model model) {
			System.out.println("calling read All method");
			List<CriminalsDTO> dtos=criminalsService.findAll();
			if(dtos !=null && !dtos.isEmpty()) {
				System.out.println("dtos are found"+dtos.size());
				model.addAttribute("CriminalDetails", dtos);
				System.out.println("Calling Model");
				model.addAttribute("size", "Total Criminals found: "+dtos.size());
			}
			else {
				System.out.println("dtos are not found");
				model.addAttribute("msg", "Data is Empty");
			}
			return "ShowAll";

		}
	}


