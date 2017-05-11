package com.hellokoding.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hellokoding.dao.DanhMucRepository;
import com.hellokoding.dao.DiaDiemRepository;
import com.hellokoding.model.DanhMuc;
import com.hellokoding.model.DiaDiem;

@Service
@Component
public class DiaDiemService {
	private final DiaDiemRepository diaDiemRepository;
	
	@Autowired
	public DiaDiemService(DiaDiemRepository diaDiemRepository) {
		this.diaDiemRepository = diaDiemRepository;
	}
	
	public List<DiaDiem> getDiaDiemTP(String tinhthanh){
		System.out.println(tinhthanh);
		List<DiaDiem> diadiems = new ArrayList<>();
		for(DiaDiem diadiem : diaDiemRepository.getDiaDiemTP(tinhthanh)){
			diadiems.add(diadiem);
			System.out.println("y");
		}
		return diadiems;
	}
	
	public List<DiaDiem> getDiaDiemTPDM(String tinhthanh, DanhMuc danhmuc){
		List<DiaDiem> diadiems = new ArrayList<>();
		for(DiaDiem diadiem : diaDiemRepository.getDiaDiemTPDM(tinhthanh,danhmuc)){
			diadiems.add(diadiem);
		}
		return diadiems;
	}
	
	public List<DiaDiem> getDiaDiemQ(String tinhthanh, String quan){
		List<DiaDiem> diadiems = new ArrayList<>();
		for(DiaDiem diadiem : diaDiemRepository.getDiaDiemQ(tinhthanh,quan)){
			diadiems.add(diadiem);
		}
		return diadiems;
	}
	
	public List<DiaDiem> getDiaDiemQDM(String tinhthanh, String quan, DanhMuc danhmuc){
		List<DiaDiem> diadiems = new ArrayList<>();
		for(DiaDiem diadiem : diaDiemRepository.getDiaDiemQDM(tinhthanh,quan,danhmuc)){
			diadiems.add(diadiem);
		}
		return diadiems;
	}
}
