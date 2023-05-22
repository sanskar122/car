package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.ProjectModel;
import com.example.demo.service.ProjectService;


@Controller
@RequestMapping(value="/sanskar")

public class ProjectController {
	@Autowired
	private ProjectService pro;
	
	
	

	@GetMapping("/Signup")
	public String Signup() {
		return "Signup";
	}
	@GetMapping("/CreateUser")
	public ModelAndView Createuser(@ModelAttribute ProjectModel proj)
	{
		ProjectModel projectmodel=pro.CreateUser(proj);
		System.out.println(proj);
		if(projectmodel!=null) {
			ModelAndView mav=new ModelAndView("welcome");
			return mav;
			
			//System.out.println("Register Succesfully");
		}else {
			return new ModelAndView("error");
			//System.out.println("Somethings error");
		}
	
	}
		



		
		
	}



