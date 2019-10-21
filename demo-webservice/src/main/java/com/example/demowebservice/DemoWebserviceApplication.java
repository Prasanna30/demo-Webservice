package com.example.demowebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoWebserviceApplication.class, args);
	}

}

@RestController
class MyWebserviceController {
	
	@RequestMapping("/sayHello")
	public JustHello greeting() {
		
		return new JustHello("Pawan");
	}
}

class JustHello {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public JustHello(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
}
