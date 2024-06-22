package com.minutes.rest.webservices.restfulwebservices.versioning;

public class personV1 {
	
public personV1(String name) {
		super();
		this.name = name;
	}

private String name;

public String getName() {
	return name;
}

@Override
public String toString() {
	return "personV1 [name=" + name + "]";
}

}
