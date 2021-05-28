package com.example.restservice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class GreetingController {
 
	private static final String template ="Hello, %s";
	private final AtomicLong counter = new AtomicLong();
	@GetMapping("/greeting")
	
	public Greetings greetings(@RequestParam(value="name", defaultValue="Kumar")String name) {
		return new Greetings(counter.incrementAndGet(),String.format(template, name));
	}
	
	@GetMapping("/data")
	public List getData() {
		List l = new ArrayList();
		l.add("Sravani");
		l.add("Nani");
		l.add("Laddu");
		l.add("Bhanu");
		return l;
	}
}
