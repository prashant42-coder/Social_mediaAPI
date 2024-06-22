package com.minutes.rest.webservices.restfulwebservices.helloworldcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
@GetMapping( path="/hello-world")
	public String HelloWorld() {
		return " Hello world";
	}

@GetMapping( path="/hello-world-bean")
	public HelloWorldBean helloworldbean() {
		return  new HelloWorldBean("hello-world");
	}
// path parameters
// user{id}/todo/{id} => /users/2/todos/200
// /hello-world/path-variable/{name}
// /hello-world/path-variable/prashant


// the pathParameter is Prashant and id ex.

@GetMapping( path="/hello-world/path-vriable/{name}")
public HelloWorldBean helloworldPathVaiable(@PathVariable String name) {
	
	return  new HelloWorldBean
			(String.format("Hello-world, %s" ,name));
}




}