package com.eazybytes.Springsections1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
	@GetMapping("/myLoans")
	public String getLoanDetails()
	{
		return "here are the loans deartails from DB";
	}

}
