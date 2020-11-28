package com.aksam.dao;

import java.util.List;

import com.aksam.entity.Handyman;
import com.aksam.entity.Hirer;

public interface HirerDao {
	public void saveHirer( Hirer hirer);
	public List<Hirer> getAllHires();
	public Hirer findHirerById( int id);
	public void updateHirer(  int id);
	public void getHirerByLocation(Handyman handyman, String state, String lga);
	public void deleteHirer(  int theid);
	

}
