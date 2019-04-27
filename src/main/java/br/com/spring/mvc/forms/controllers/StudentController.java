package br.com.spring.mvc.forms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.spring.mvc.forms.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("showForm")
	public String showForm(Model theModel) {
		
		Student theStudent = new Student();
		
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	@PostMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		//System.out.println(theStudent.getFirstName()+" "+theStudent.getLastName());
		
		return "student-confirmation";
	}
}
