package com.hellokoding.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name="tinhthanh")
public class TinhThanh {
	
	@Id
	private String id;
	private String name;
	private String type;
	@JsonManagedReference
	@OneToMany(mappedBy="thuoctinhthanh")
	private List<Quan> listquan;

	
	
	public TinhThanh() {
		super();
	}

	public TinhThanh(String name, String type, List<Quan> listquan) {
		super();
		this.name = name;
		this.type = type;
		this.listquan = listquan;
	}

	public TinhThanh(String id, String name, String type, List<Quan> listquan) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.listquan = listquan;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Quan> getListquan() {
		return listquan;
	}

	public void setListquan(List<Quan> listquan) {
		this.listquan = listquan;
	}
	
	
}
