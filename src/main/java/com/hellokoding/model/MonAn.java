package com.hellokoding.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name="monan")
public class MonAn {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String tenmon;
	private String tenquan;
	private String diachi;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date ngaycapnhat;
	
	@JsonBackReference
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="iddanhmuc")
	private DanhMuc thuocdanhmucma;

	
	
	public MonAn() {
		super();
	}

	public MonAn(String tenmon, String tenquan, String diachi, Date ngaycapnhat, DanhMuc thuocdanhmucma) {
		super();
		this.tenmon = tenmon;
		this.tenquan = tenquan;
		this.diachi = diachi;
		this.ngaycapnhat = ngaycapnhat;
		this.thuocdanhmucma = thuocdanhmucma;
	}

	public MonAn(int id, String tenmon, String tenquan, String diachi, Date ngaycapnhat, DanhMuc thuocdanhmucma) {
		super();
		this.id = id;
		this.tenmon = tenmon;
		this.tenquan = tenquan;
		this.diachi = diachi;
		this.ngaycapnhat = ngaycapnhat;
		this.thuocdanhmucma = thuocdanhmucma;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenmon() {
		return tenmon;
	}

	public void setTenmon(String tenmon) {
		this.tenmon = tenmon;
	}

	public String getTenquan() {
		return tenquan;
	}

	public void setTenquan(String tenquan) {
		this.tenquan = tenquan;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public Date getNgaycapnhat() {
		return ngaycapnhat;
	}

	public void setNgaycapnhat(Date ngaycapnhat) {
		this.ngaycapnhat = ngaycapnhat;
	}

	public DanhMuc getThuocdanhmucma() {
		return thuocdanhmucma;
	}

	public void setThuocdanhmucma(DanhMuc thuocdanhmucma) {
		this.thuocdanhmucma = thuocdanhmucma;
	}
	
	
	
	
	
	
}
