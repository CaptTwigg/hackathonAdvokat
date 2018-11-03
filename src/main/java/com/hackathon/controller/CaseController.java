package com.hackathon.controller;

import com.hackathon.model.Case;
import com.hackathon.model.ModelFiles;
import com.hackathon.view.CaseView;
import org.springframework.stereotype.Controller;
import com.hackathon.model.ModelFiles;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.ArrayList;

@Controller
public class CaseController {

	@GetMapping("/cases")
	public String cases(Model model){
		try {
			model.addAttribute("cases", (ArrayList<Case>) ModelFiles.load("src/main/resources/files/cases.txt"));
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return "cases";
	}

	@GetMapping("/create_case")
	public String createCase(Model model){
		model.addAttribute("case", new Case());
		return "create_case";
	}

	@PostMapping("/create_case")
	public String saveCase(Case c) throws IOException, ClassNotFoundException {
		ArrayList cases = ModelFiles.load("src\\main\\resources\\files\\cases.txt");
		cases.add(c);
		System.out.println(cases);
//		ModelFiles.save("C:\\Users\\marti\\Dropbox\\KEA - Datamatiker\\GitHub\\hackathonAdvokat\\src\\main\\resources\\files\\cases.txt", cases);
		return "redirect:/cases";
	}

	@GetMapping("case/{casenumber}")
	public String caseDetail(Model model, @PathVariable("casenumber") int casenumber) throws IOException, ClassNotFoundException {
		ArrayList<Case> cases = CaseView.getCases();
		for (Case c: cases) {
			if (casenumber == c.getCasenumber()){
				model.addAttribute("case", c);
			}
		}
		return "case_details";
	}

	@GetMapping("case_stats")
	public String singleCaseStats(){
		return "single_case_stats";
	}
}
