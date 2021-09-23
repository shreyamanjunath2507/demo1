package com.naturalprogrammer.spring5tutorial2.mail;

public interface MailSender {
	void send(String to, String subject, String body);


}
