package com.recipe.project.rpApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	
	@Autowired
	public IndexController() {
		
	}
	
	@RequestMapping(path = {"/","/index","index"},method = RequestMethod.GET)
	public String getIndexPage() {
		return "index";
	}
	
}
