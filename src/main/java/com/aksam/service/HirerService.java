package com.aksam.service;

import java.util.List;

import com.aksam.entity.Handyman;
import com.aksam.entity.Hirer;

public interface HirerService {
	
	
public void saveHirer( Hirer hirer);
	
	public List<Hirer> getAllHirers();
	
	public Hirer getHirerById( Long id);
	
	public void updateHirer(  int id);
	
	public void getHirerByLocation(Hirer hirer, String state, String lga);
	
	public void deleteHirer(  Long theid);
	

}
