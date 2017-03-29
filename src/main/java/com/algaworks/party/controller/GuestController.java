package com.algaworks.party.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GuestController {
	
	@GetMapping("/guest")
	public String list() {
		return "GuestList";
		}

}
