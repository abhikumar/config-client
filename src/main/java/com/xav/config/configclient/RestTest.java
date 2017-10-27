package com.xav.config.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/rest")
@RestController
public class RestTest {
	
	@Value("${message:Default hello}")
	String message;

	@RequestMapping("/message")
	String get() {
		return message;
	}
}
