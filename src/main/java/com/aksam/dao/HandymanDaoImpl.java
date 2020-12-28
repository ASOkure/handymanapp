package com.aksam.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aksam.entity.Handyman;


@Repository
public class HandymanDaoImpl implements HandymanDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveHandyman( Handyman handyman) {
		
		// create currentSession
		Session currentSession = sessionFactory.getCurrentSession();
		
		// use session saveorUpdate method to save
		 currentSession.saveOrUpdate(handyman);
		      
}
	
	public List<Handyman> getAllHandyman(){
		// create currentSession
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create query and execute
	Query q =  currentSession.createQuery("from Handyman", Handyman.class);
	
	        
	List<Handyman> handyman = q.getResultList();
		

		
		return handyman;
	}
	
	
	

	public Handyman FindById( int id){
		
		// get current session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// Now retrieve/read from database using the primary key
		
		Handyman theHandyman = currentSession.get(Handyman.class, id);
		
		return theHandyman;
		   
	}
	
	public void deleteHandyman(  Long theid) {
		//get the current hibernate session;
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		
		//delete object with primary key
		
		Query theQuery =
				currentSession.createQuery("delete from Handyman where id=:handymanId");
		theQuery.setParameter("handymanId", theid);
		
		theQuery.executeUpdate();
		
	}

	@Override
	public Handyman getHandymanById(Long id) {
		
		// get current hibernate session;
		
		Session currentSession = sessionFactory.getCurrentSession();
		// now retrive/read from database using the primary key or the id that is passed into this method
		
		Handyman handyman = currentSession.get(Handyman.class, id);
		
		
		return handyman;
	}

	@Override
	public void updateHandyman(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getHandymanByLocation(Handyman handyman, String state, String lga) {
		// TODO Auto-generated method stub
		
	}
	
	
}
