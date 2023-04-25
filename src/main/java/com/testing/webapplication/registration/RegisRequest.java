package com.testing.webapplication.registration;


public class RegisRequest {
	//fields 
	private final String email;
	private final String firstName;
	private final String lastName;
	private final String password;
	
	//cons
	public RegisRequest(String email, String firstName, String lastName, String password) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}	
	
	//methods 
	
	
	
	//getters setters
	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPassword() {
		return password;
	}

}
