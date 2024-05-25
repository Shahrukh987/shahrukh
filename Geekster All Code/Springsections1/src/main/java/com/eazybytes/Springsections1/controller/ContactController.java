package com.eazybytes.Springsections1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @GetMapping("/myContacts")
	public String getContactDetails()
	{
		return "Inqury details are saved to the DB";
	}
}
