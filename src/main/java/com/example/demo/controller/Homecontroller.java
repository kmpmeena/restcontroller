package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {
@RequestMapping(value="/home",method=RequestMethod.GET)
public String home() {
	return "hello world";
	
}
}

