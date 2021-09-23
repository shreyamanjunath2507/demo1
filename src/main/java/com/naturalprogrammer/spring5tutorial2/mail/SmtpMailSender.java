package com.naturalprogrammer.spring5tutorial2.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class SmtpMailSender {
	private static final Log log = LogFactory.getLog(SmtpMailSender.class);
	public void send(String to, String subject, String body) {
	log.info("Sending SMTP mail to " + to);
	log.info("Subject: " + subject);
	log.info("Body: " + body);
	}
}
