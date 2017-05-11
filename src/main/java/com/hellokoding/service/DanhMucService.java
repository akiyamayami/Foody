package com.hellokoding.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hellokoding.dao.DanhMucRepository;
import com.hellokoding.model.DanhMuc;

@Service
@Component
public class DanhMucService {
	private final DanhMucRepository danhMucRepository;
	
	@Autowired
	public DanhMucService(DanhMucRepository danhMucRepository) {
		this.danhMucRepository = danhMucRepository;
	}
	
	public List<DanhMuc> findAll(){
		List<DanhMuc> danhmucs = new ArrayList<>();
		for(DanhMuc danhmuc : danhMucRepository.findAll()){
			danhmucs.add(danhmuc);
		}
		return danhmucs;
	}
	
	public DanhMuc findOne(int id){
		return danhMucRepository.findOne(id);
	}
	
	public void save(DanhMuc danhmuc){
		danhMucRepository.save(danhmuc);
	}
	public void delete(int id){
		danhMucRepository.delete(id);
	}
	
	public DanhMuc getDMfname(String name){
		return danhMucRepository.getIDDM(name);
	}
}
