package com.javatpoint.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping("/")
	public String hello() {
		Logger.getAnonymousLogger().log(Level.INFO, "Hellooooooooooooooooooooooooo");
		return "Hello javaTpointtttttttttttttttttttttttttttttttttt";
	}
}
