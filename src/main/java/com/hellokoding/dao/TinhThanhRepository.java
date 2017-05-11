package com.hellokoding.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.hellokoding.model.TinhThanh;

public interface TinhThanhRepository extends CrudRepository<TinhThanh, String>{
}
