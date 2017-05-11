package com.hellokoding.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hellokoding.dao.DanhMucRepository;
import com.hellokoding.dao.PhuongRepository;
import com.hellokoding.model.DanhMuc;

@Service
@Component
public class PhuongService {
	private final PhuongRepository phuongRepository;
	@Autowired
	public PhuongService(PhuongRepository phuongRepository) {
		this.phuongRepository = phuongRepository;
	}


}
