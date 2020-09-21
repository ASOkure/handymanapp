package com.aksam.dao;

import java.util.List;

import com.aksam.entity.Handyman;

public interface HandymanDao {
	
	public void saveHandyman( Handyman handyman);
	public List<Handyman> getAllHandyman();
	public Handyman getHandymanById( int id);
	public void updateHandyman(  int id);
	public void getHanymanByLocation(Handyman handyman, String state, String lga);
	public void deleteHandyman(  int id);
	

}
