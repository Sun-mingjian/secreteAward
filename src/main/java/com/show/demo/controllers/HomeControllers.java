package com.show.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControllers {
	
	@RequestMapping(value="/")
	public String index(){
		return "index.html";
	}

}
