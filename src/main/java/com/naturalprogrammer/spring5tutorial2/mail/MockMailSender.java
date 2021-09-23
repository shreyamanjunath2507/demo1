package com.naturalprogrammer.spring5tutorial2.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class MockMailSender implements MailSender {
	private static final Log log = LogFactory.getLog(MockMailSender.class);
	@Override
	public void send(String to, String subject, String body) {
	log.info("Sending SMTP to " + to);
	log.info("Subject: " + subject);
	log.info("Body: " + body);
	} 

}
