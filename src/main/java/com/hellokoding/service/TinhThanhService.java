package com.hellokoding.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hellokoding.dao.DanhMucRepository;
import com.hellokoding.dao.TinhThanhRepository;
import com.hellokoding.model.DanhMuc;
import com.hellokoding.model.TinhThanh;

@Service
@Component
public class TinhThanhService {
	private final TinhThanhRepository tinhThanhRepository;

	@Autowired
	public TinhThanhService(TinhThanhRepository tinhThanhRepository) {
		this.tinhThanhRepository = tinhThanhRepository;
	}
	
	public List<TinhThanh> findAll(){
		List<TinhThanh> tinhthanhs = new ArrayList<>();
		for(TinhThanh tinhthanh : tinhThanhRepository.findAll()){
			tinhthanhs.add(tinhthanh);
		}
		return tinhthanhs;
	}
}
