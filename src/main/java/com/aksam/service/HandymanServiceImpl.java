package com.aksam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aksam.dao.HandymanDao;
import com.aksam.entity.Handyman;

@Service
public class HandymanServiceImpl implements HandymanService {
	
	@Autowired
	private HandymanDao handymanDao;
	
	@Transactional
	public void saveHandyman( Handyman theHandyman) {
		
		 // simply delegate to dao to do the job
		
		handymanDao.saveHandyman(theHandyman);
		
	}

	@Override
	@Transactional
	public List<Handyman> getAllHandyman() {
		
		
		return  handymanDao.getAllHandyman();
	}

	@Override
	@Transactional
	public Handyman getHandymanById(Long id) {
		
		
		return  handymanDao.getHandymanById(id);
	}

	@Override
	@Transactional
	public void updateHandyman(int id) {
		
		handymanDao.updateHandyman(id);
	}

	@Override
	@Transactional
	public void getHanymanByLocation(Handyman handyman, String state, String lga) {
		
		
	}

	@Override
	@Transactional
	public void deleteHandyman(Long theid) {
		
		handymanDao.deleteHandyman(theid);
		
	}
	

}
