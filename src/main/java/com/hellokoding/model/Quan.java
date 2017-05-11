package com.hellokoding.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name="quan")
public class Quan {
	
	@Id
	private String id;
	private String name;
	private String type;
	
	@JsonBackReference
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="provinceid")
	private TinhThanh thuoctinhthanh;
	
	
	@JsonManagedReference
	@OneToMany(mappedBy="thuocquan")
	private List<Phuong> listphuong;

	
	public Quan() {
		super();
	}

	public Quan(String id, String name, String type, TinhThanh thuoctinhthanh, List<Phuong> listphuong) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.thuoctinhthanh = thuoctinhthanh;
		this.listphuong = listphuong;
	}

	public Quan(String name, String type, TinhThanh thuoctinhthanh, List<Phuong> listphuong) {
		super();
		this.name = name;
		this.type = type;
		this.thuoctinhthanh = thuoctinhthanh;
		this.listphuong = listphuong;
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

	public TinhThanh getThuoctinhthanh() {
		return thuoctinhthanh;
	}

	public void setThuoctinhthanh(TinhThanh thuoctinhthanh) {
		this.thuoctinhthanh = thuoctinhthanh;
	}

	public List<Phuong> getListphuong() {
		return listphuong;
	}

	public void setListphuong(List<Phuong> listphuong) {
		this.listphuong = listphuong;
	}
	
	
}
