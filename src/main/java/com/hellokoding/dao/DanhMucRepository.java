package com.hellokoding.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.hellokoding.model.DanhMuc;

public interface DanhMucRepository extends CrudRepository<DanhMuc, Integer>{

	@Query("select s from danhmuc as s where s.name = ?1")
	public DanhMuc getIDDM(String name);
}
