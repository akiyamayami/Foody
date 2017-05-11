package com.hellokoding.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hellokoding.dao.MonAnRepository;
import com.hellokoding.model.DanhMuc;
import com.hellokoding.model.MonAn;

@Service
@Component
public class MonAnService {
	private final MonAnRepository monAnRepository;
	
	@Autowired
	public MonAnService(MonAnRepository monAnRepository) {
		this.monAnRepository = monAnRepository;
	}
	
	public List<MonAn> getMonAnTP(String tinhthanh){
		System.out.println(tinhthanh);
		List<MonAn> monans = new ArrayList<>();
		for(MonAn monan : monAnRepository.getMonAnTP(tinhthanh)){
			monans.add(monan);
			System.out.println("y");
		}
		return monans;
	}
	
	public List<MonAn> getMonAnTPDM(String tinhthanh, DanhMuc danhmuc){
		List<MonAn> monans = new ArrayList<>();
		for(MonAn monan : monAnRepository.getMonAnTPDM(tinhthanh,danhmuc)){
			monans.add(monan);
		}
		return monans;
	}
	
	public List<MonAn> getMonAnQ(String tinhthanh, String quan){
		List<MonAn> monans = new ArrayList<>();
		for(MonAn monan : monAnRepository.getMonAnQ(tinhthanh,quan)){
			monans.add(monan);
		}
		return monans;
	}
	
	public List<MonAn> getMonAnQDM(String tinhthanh, String quan, DanhMuc danhmuc){
		List<MonAn> monans = new ArrayList<>();
		for(MonAn monan : monAnRepository.getMonAnQDM(tinhthanh,quan,danhmuc)){
			monans.add(monan);
		}
		return monans;
	}
}
