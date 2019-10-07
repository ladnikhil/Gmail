package com.dev.ustglobal.onetomanymapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import java.util.List;

@Entity
@Table(name = "pencilboxinfo")
public class PencilBox {
	
	@Id
	@Column
	private int boxid;
	@Column
	private String boxname;

	public String getBoxname() {
		return boxname;
	}

	public void setBoxname(String boxname) {
		this.boxname = boxname;
	}

	public int getBoxid() {
		return boxid;
	}

	public void setBoxid(int boxid) {
		this.boxid = boxid;
	}

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "boxid",nullable=false)// here we have give reference of same class
	List<Pencils> pcl;

	public List<Pencils> getPcl() {
		return pcl;
	}

	public void setPcl(List<Pencils> pcl) {
		this.pcl = pcl;
	}
	
	

}
