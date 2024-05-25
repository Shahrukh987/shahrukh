package com.eazybytes.Springsections1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalaneController {
	@GetMapping("/myBalences")
	public String getBalanceDetails()
	{
		return"Here the balance details from DB";
	}

}
