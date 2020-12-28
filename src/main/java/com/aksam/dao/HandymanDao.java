package com.aksam.dao;

import java.util.List;

import com.aksam.entity.Handyman;

public interface HandymanDao {
	
	public void saveHandyman( Handyman handyman);
	public List<Handyman> getAllHandyman();
	public Handyman getHandymanById( Long id);
	public void updateHandyman(  int id);
	public void getHandymanByLocation(Handyman handyman, String state, String lga);
	public void deleteHandyman(  Long theid);
	

}
