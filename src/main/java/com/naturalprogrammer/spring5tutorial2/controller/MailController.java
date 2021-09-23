package com.naturalprogrammer.spring5tutorial2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naturalprogrammer.spring5tutorial2.mail.MailSender;
@RestController

public class MailController {
	
	@Autowired
	private MailSender mailSender;
	@RequestMapping("/mail")
	public String mail() {
		
		mailSender.send("abc@example.com", "Some subject", "the content");
		return "Mail sent";

	}

}