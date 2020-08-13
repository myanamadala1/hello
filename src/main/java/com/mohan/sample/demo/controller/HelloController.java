package com.mohan.sample.demo.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.HelloModel;

@RestController
public class HelloController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/show")
	public HelloModel helloModel(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new HelloModel(counter.incrementAndGet(), String.format(template, name));
	}
}
