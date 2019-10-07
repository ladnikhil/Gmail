package com.dev.ustglobal.mapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "voterinfo")
public class VoterCard {

	@Id
	@Column
	private int v_id;
	@Column
	private String vname;

	public int getV_id() {
		return v_id;
	}

	public void setV_id(int v_id) {
		this.v_id = v_id;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	@OneToOne(mappedBy="vcard") // here we have already mapped votercard class reference
	private Person per;

	public Person getPer() {
		return per;
	}

	public void setPer(Person per) {
		this.per = per;
	}
	

}
