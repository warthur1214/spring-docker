package com.warthur.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by warth on 2018/3/30.
 */
@SpringBootApplication
@RestController
public class DockerApplication {

	@GetMapping("/")
	public String home(){
		return "Hello Docker World";
	}


	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
	}
}
