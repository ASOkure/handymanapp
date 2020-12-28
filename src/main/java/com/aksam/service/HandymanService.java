package com.aksam.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.aksam.entity.Handyman;


public interface HandymanService {

	public void saveHandyman( Handyman handyman);
	
	public List<Handyman> getAllHandyman();
	
	public Handyman getHandymanById( Long id);
	
	public void updateHandyman(  int id);
	
	public void getHanymanByLocation(Handyman handyman, String state, String lga);
	
	public void deleteHandyman(  Long theid);
	
		
	

}
