package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//diese Klasse ist nur Controller
@Controller
public class MyProjectApplication {

	@RequestMapping("/welcome")
	@ResponseBody
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
