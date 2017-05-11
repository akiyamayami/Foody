package com.hellokoding.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hellokoding.model.DanhMuc;
import com.hellokoding.model.DiaDiem;

public interface DiaDiemRepository extends CrudRepository<DiaDiem, Integer>{

	@Query("select s from diadiem as s where s.diachi like %:tinhthanh% order by s.id desc")
	public List<DiaDiem> getDiaDiemTP(@Param("tinhthanh") String tinhthanh);
	
	@Query("select s from diadiem as s where s.diachi like %?1% and s.diachi like %?2% order by s.id desc")
	public List<DiaDiem> getDiaDiemQ(String tinhthanh, String quan);
	
	@Query("select s from diadiem as s where s.diachi like %?1% and s.thuocdanhmucdd = ?2 order by s.id desc")
	public List<DiaDiem> getDiaDiemTPDM(String tinhthanh, DanhMuc danhmuc);
	
	@Query("select s from diadiem as s where s.diachi like %?1% and s.diachi like %?2% and s.thuocdanhmucdd = ?3 order by s.id desc")
	public List<DiaDiem> getDiaDiemQDM(String tinhthanh, String quan, DanhMuc danhmuc);
}
