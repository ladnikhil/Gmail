package com.dev.ustglobal.manytomanymapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "courseinfo")
public class Course {
	
	@Id
	@Column
	private int cid;
	@Column
	private String cname;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	
	
//	@JoinTable(name = "course_student",joinColumns = @JoinColumn(name="cid"),
//	inverseJoinColumns = @JoinColumn(name="sid"))
	@ManyToMany(cascade=CascadeType.ALL,mappedBy = "cou")
	private List<Student> Stu;

	public List<Student> getStu() {
		return Stu;
	}

	public void setStu(List<Student> stu) {
		Stu = stu;
	}

	
	

}
