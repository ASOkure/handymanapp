package com.aksam.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aksam.entity.Handyman;
import com.aksam.entity.User;

@Repository
public class HandymanDaoImpl {
	
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
	Query q =  currentSession.createQuery("from Handyman h, Handyman.class");
	
	        
	List<Handyman>result = q.getResultList();
		

		
		return result;
	}
	
	
	

	public Handyman FindById( int id){
		
		// get current session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// Now retrieve/read from database using the primary key
		
		Handyman theHandyman = currentSession.get(Handyman.class, id);
		
		return theHandyman;
		   
	}
	
}
