package com.test.repository;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table(value="users")
public class Users {
	
@PrimaryKey
private String lastname;	
@Column
private String firstname;
public Users(String lastname, String firstname, int age, String email,
		String city) {
	super();
	this.lastname = lastname;
	this.firstname = firstname;
	this.age = age;
	this.email = email;
	this.city = city;
}
@Column
private int  age;
@Column
private String email;
@Column
private String city;
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}



}
