package com.eazybytes.Springsections1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {
	@GetMapping("/notices")
	public String getNotices()
	{
		return "here are the noticws detaid from the DB";
	}

}
