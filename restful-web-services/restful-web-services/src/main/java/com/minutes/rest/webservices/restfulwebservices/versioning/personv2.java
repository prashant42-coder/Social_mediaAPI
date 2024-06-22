package com.minutes.rest.webservices.restfulwebservices.versioning;

public class personv2 {
	public personv2(Name name) {
		super();
		this.name = name;
	}

	private Name name;

	public Name getName() {
		return name;
	}

	@Override
	public String toString() {
		return "personv2 [name=" + name + "]";
	}


}
