package com.hellokoding.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name="danhmuc")
public class DanhMuc {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
	
	@JsonManagedReference
	@OneToMany(mappedBy="thuocdanhmucdd")
	private List<DiaDiem> listdiadiem;


	@JsonManagedReference
	@OneToMany(mappedBy="thuocdanhmucma")
	private List<MonAn> listmonan;
	
	public DanhMuc() {
		super();
	}


	public DanhMuc(int id, String name, List<DiaDiem> listdiadiem, List<MonAn> listmonan) {
		super();
		this.id = id;
		this.name = name;
		this.listdiadiem = listdiadiem;
		this.listmonan = listmonan;
	}


	public List<MonAn> getListmonan() {
		return listmonan;
	}


	public void setListmonan(List<MonAn> listmonan) {
		this.listmonan = listmonan;
	}


	public DanhMuc(String name, List<DiaDiem> listdiadiem) {
		super();
		this.name = name;
		this.listdiadiem = listdiadiem;
	}


	public DanhMuc(int id, String name, List<DiaDiem> listdiadiem) {
		super();
		this.id = id;
		this.name = name;
		this.listdiadiem = listdiadiem;
	}



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


	public List<DiaDiem> getListdiadiem() {
		return listdiadiem;
	}


	public void setListdiadiem(List<DiaDiem> listdiadiem) {
		this.listdiadiem = listdiadiem;
	}
	
	
}
