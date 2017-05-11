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

@Entity(name="diadiem")
public class DiaDiem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String ten;
	private String diachi;
	private float diemso;
	private String giomo;
	private String giodong;
	private int soanh;
	private int socmt;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date ngaycapnhat;
	
	
	@JsonBackReference
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="iddanhmuc")
	private DanhMuc thuocdanhmucdd;
	
	
	
	public DiaDiem() {
		super();
	}

	public DiaDiem(int id, String ten, String diachi, float diemso, String giomo, String giodong, int soanh, int socmt,
			Date ngaycapnhat, DanhMuc thuocdanhmucdd) {
		super();
		this.id = id;
		this.ten = ten;
		this.diachi = diachi;
		this.diemso = diemso;
		this.giomo = giomo;
		this.giodong = giodong;
		this.soanh = soanh;
		this.socmt = socmt;
		this.ngaycapnhat = ngaycapnhat;
		this.thuocdanhmucdd = thuocdanhmucdd;
	}

	public DiaDiem(String ten, String diachi, float diemso, String giomo, String giodong, int soanh, int socmt,
			Date ngaycapnhat, DanhMuc thuocdanhmucdd) {
		super();
		this.ten = ten;
		this.diachi = diachi;
		this.diemso = diemso;
		this.giomo = giomo;
		this.giodong = giodong;
		this.soanh = soanh;
		this.socmt = socmt;
		this.ngaycapnhat = ngaycapnhat;
		this.thuocdanhmucdd = thuocdanhmucdd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public float getDiemso() {
		return diemso;
	}

	public void setDiemso(float diemso) {
		this.diemso = diemso;
	}

	public String getGiomo() {
		return giomo;
	}

	public void setGiomo(String giomo) {
		this.giomo = giomo;
	}

	public String getGiodong() {
		return giodong;
	}

	public void setGiodong(String giodong) {
		this.giodong = giodong;
	}

	public int getSoanh() {
		return soanh;
	}

	public void setSoanh(int soanh) {
		this.soanh = soanh;
	}

	public int getSocmt() {
		return socmt;
	}

	public void setSocmt(int socmt) {
		this.socmt = socmt;
	}

	public Date getNgaycapnhat() {
		return ngaycapnhat;
	}

	public void setNgaycapnhat(Date ngaycapnhat) {
		this.ngaycapnhat = ngaycapnhat;
	}

	public DanhMuc getThuocdanhmucdd() {
		return thuocdanhmucdd;
	}

	public void setThuocdanhmucdd(DanhMuc thuocdanhmucdd) {
		this.thuocdanhmucdd = thuocdanhmucdd;
	}
	
	
	
}
