package com.hellokoding.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hellokoding.model.DanhMuc;
import com.hellokoding.model.DiaDiem;
import com.hellokoding.model.MonAn;

public interface MonAnRepository extends CrudRepository<MonAn, Integer>{

	@Query("select s from monan as s where s.diachi like %:tinhthanh% order by s.id desc")
	public List<MonAn> getMonAnTP(@Param("tinhthanh") String tinhthanh);
	
	@Query("select s from monan as s where s.diachi like %?1% and s.diachi like %?2% order by s.id desc")
	public List<MonAn> getMonAnQ(String tinhthanh, String quan);
	
	@Query("select s from monan as s where s.diachi like %?1% and s.thuocdanhmucma = ?2 order by s.id desc")
	public List<MonAn> getMonAnTPDM(String tinhthanh, DanhMuc danhmuc);
	
	@Query("select s from monan as s where s.diachi like %?1% and s.diachi like %?2% and s.thuocdanhmucma = ?3 order by s.id desc")
	public List<MonAn> getMonAnQDM(String tinhthanh, String quan, DanhMuc danhmuc);
}
