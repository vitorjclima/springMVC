package com.algaworks.party.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.party.repository.Guests;

@Controller
public class GuestController {
	
	
	@Autowired
	private Guests guests;
	
	@GetMapping("/guests")
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView("GuestList");
		modelAndView.addObject("guests", guests.findAll());
		return modelAndView;
		}

}
