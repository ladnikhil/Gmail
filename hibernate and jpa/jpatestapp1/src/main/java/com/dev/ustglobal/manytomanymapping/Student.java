package com.dev.ustglobal.manytomanymapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "stdinfo")
public class Student {
	

	@Id
	@Column
	private int sid;
	@Column
	private String sname;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "student_course",joinColumns = @JoinColumn(name="sid"),// here we want to join table so we 
	inverseJoinColumns = @JoinColumn(name="cid"))
	private List<Course> cou;

	public List<Course> getCou() {
		return cou;
	}

	public void setCou(List<Course> cou) {
		this.cou = cou;
	}
	
	
	
}
