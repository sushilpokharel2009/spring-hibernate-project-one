package com.stosh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@RequestMapping(value="abc")
	public String studentForm() {
		return "student-form";
	}
	
	@RequestMapping(value="add-student")
	public ModelAndView addStudnt(@RequestParam("studentName") String studentName, @RequestParam("studentAddress") String studentAddress) {
		
		System.out.println("a -->> "+ studentName);
		System.out.println("b -->> "+ studentAddress);
		
		ModelAndView mv = new ModelAndView("student-list");
		mv.addObject("sn", studentName);
		mv.addObject("sa", studentAddress);
		
		return mv;
	}
	
}
