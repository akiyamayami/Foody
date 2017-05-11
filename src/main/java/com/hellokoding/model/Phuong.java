package com.hellokoding.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name="phuong")
public class Phuong {
	
	@Id
	private String id;
	private String name;
	private String type;
	
	@JsonBackReference
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="districtid")
	private Quan thuocquan;


	public Phuong(String id, String name, String type, Quan thuocquan) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.thuocquan = thuocquan;
	}


	public Phuong(String name, String type, Quan thuocquan) {
		super();
		this.name = name;
		this.type = type;
		this.thuocquan = thuocquan;
	}


	public Phuong() {
		super();
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


	public Quan getThuocquan() {
		return thuocquan;
	}


	public void setThuocquan(Quan thuocquan) {
		this.thuocquan = thuocquan;
	}
	
	
}
