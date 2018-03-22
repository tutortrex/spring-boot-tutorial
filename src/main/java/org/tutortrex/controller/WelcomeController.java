package org.tutortrex.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@Value("${welcome.message:Hello World}")
	private String message = "Empty Message";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);

		String[] names = new String[] {"foo", "bar", "goo"};

		model.put("names", names);

		return "welcome";
	}
}
