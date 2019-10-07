package com.dev.collections;

public class Employee implements Comparable <Employee> {

	private String name;
	private int id;
	private String email;
	private String password;
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", email=" + email +  "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//	public String getPassword() {
//		return password;
//	}
	public void setPassword(String password) {
		this.password = password;
	}
	
// this override is for implements comparable<Employee>
@Override
public int compareTo(Employee e) {
	// TODO Auto-generated method stub
	return (this.id - e.id);// here we are returning object
}

}
