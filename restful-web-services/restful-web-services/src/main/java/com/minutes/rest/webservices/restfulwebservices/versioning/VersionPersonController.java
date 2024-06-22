package com.minutes.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class VersionPersonController {
@GetMapping("/v1/personv1")
	public personV1 getFirstversion() {
		return new personV1 ("prashant");
	}

// use in Twitter
@GetMapping("/v2/person")
public personv2 getsecondversion() {
	return new  personv2( new Name("prashant","nawale"));
}
// use in amazon
@GetMapping( path ="/person" ,params ="version=1")
public personV1 getFirstversionRequestparam() {
	return new personV1 ("sujay");
}
// use is microsoft
@GetMapping( path ="/person/header" ,headers="X-API-VERSION=1")
public personV1 getFirstversionRequestHEADER() {
	return new personV1 ("Amit");
}
// git hub use 
@GetMapping( path ="/person/accept" ,produces ="application/vnd.company.app-v1+json")
public personv2 getFirstversionRequestgit() {
	return new personv2 (new Name("pratik","Kadam"));
}
}
