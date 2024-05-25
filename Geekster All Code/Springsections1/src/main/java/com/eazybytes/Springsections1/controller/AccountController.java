package com.eazybytes.Springsections1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
 @GetMapping("/myAccount")
 public String getAccountDetails()
 {
	return "here are the account detais from DB";
	 
 }

}
