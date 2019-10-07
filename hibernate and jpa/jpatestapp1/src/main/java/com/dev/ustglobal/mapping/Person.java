package com.dev.ustglobal.mapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "personinfo")
public class Person {

	@Id
	@Column
	private int id;
	@Column
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name ="v_id")
	private VoterCard vcard;  // here we have created reference of votercard entity class

	public VoterCard getVcard() {
		return vcard;
	}

	public void setVcard(VoterCard vcard) {
		this.vcard = vcard;
	}
	

}
