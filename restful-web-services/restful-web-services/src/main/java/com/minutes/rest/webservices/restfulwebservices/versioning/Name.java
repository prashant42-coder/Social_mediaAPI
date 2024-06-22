package com.minutes.rest.webservices.restfulwebservices.versioning;

public class Name {
private String Firstname ;
private String Lastname;
public Name(String firstname, String lastname) {
		super();
		Firstname = firstname;
		Lastname = lastname;
	}

public String getFirstname() {
	return Firstname;
}
public String getLastname() {
	return Lastname;
}
@Override
public String toString() {
	return "personv2 [Firstname=" + Firstname + ", Lastname=" + Lastname + "]";
}

}
