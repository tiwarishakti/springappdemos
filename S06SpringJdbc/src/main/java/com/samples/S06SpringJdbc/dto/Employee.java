package com.samples.S06SpringJdbc.dto;

public class Employee {
	private int Id;
	private String Firstname;
	private String Lastname;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Firstname=" + Firstname + ", Lastname=" + Lastname + "]";
	}
	
	

}
