package com.xworkz.laptop.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.laptop.dto.SuicideDTO;

@Component
@RequestMapping("/")
public class CommitedSuicideController {
	
	public CommitedSuicideController() {
		System.out.println("created"+this.getClass().getSimpleName());
	}

	@RequestMapping("/Create.do")
	public String onCreated(SuicideDTO dto) {
		System.out.println("calling onCreated");
		System.out.println("Fetching data from dto"+dto);
		
		return "CommitedSuicide.jsp";
	}
}
