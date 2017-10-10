package com.santosh.spring.model;

import java.time.LocalDate;
import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "student")
public class Student {
   private int id;
   private String firstname;
   private String lastname;
   private String address;
   private String city;
   private String mobile;
   private String email;
   private int pincode;
   private Date dob;


  public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getFirstname() {
	return firstname;
}


public void setFirstname(String firstname) {
	this.firstname = firstname;
}


public String getLastname() {
	return lastname;
}


public void setLastname(String lastname) {
	this.lastname = lastname;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public String getMobile() {
	return mobile;
}


public void setMobile(String mobile) {
	this.mobile = mobile;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public int getPincode() {
	return pincode;
}


public void setPincode(int pincode) {
	this.pincode = pincode;
}


public Date getDob() {
	return dob;
}


public void setDob(Date dob) {
	this.dob = dob;
}


public String toString() {
	  String data = "id "+id+",FirstName "+firstname+",LastName "+lastname+",B'Day "+dob+",Address "+address+",city "+city+",mobile "+mobile+",pincode "+pincode+",email "+email;
	  
	  return data;
  }

}
