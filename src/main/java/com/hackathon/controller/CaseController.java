package com.hackathon.controller;

import com.hackathon.model.Case;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class CaseController {

	@GetMapping("/cases")
	public String cases(){
		return "cases";
	}

	@GetMapping("/create_case")
	public String createCase(Model model){
		model.addAttribute("case", new Case());

		return "create_case";
	}
}
