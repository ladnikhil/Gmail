package com.ust.ustglobalspringcore.autowiring;

public class Author {
	
	private String name;// byname
	
	private Writer write;// bytype

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Writer getWrite() {
		return write;
	}

	public void setWrite(Writer write) {
		this.write = write;
	}
	
	
	
	

}
