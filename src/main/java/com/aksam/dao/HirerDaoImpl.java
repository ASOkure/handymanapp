package com.aksam.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.aksam.entity.Handyman;
import com.aksam.entity.Hirer;

public class HirerDaoImpl implements HirerDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void saveHirer(Hirer hirer) {
		
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(hirer);
		
	}

	
	@Override
	public List<Hirer> getAllHires() {
		
		Session theCurrentSession = sessionFactory.getCurrentSession();
		
		
		Query q = theCurrentSession.createQuery(" from Hirer",  Hirer.class);
		
	
		
		List<Hirer> hirerList  = q.getResultList();
		
		return hirerList;
	}

	@Override
	public Hirer getHirerById(Long id) {
		
		Session theCurrentSession = sessionFactory.getCurrentSession();
		
		Hirer hirer = theCurrentSession.find(Hirer.class, id);
		
		
		return hirer;
		
	}

	@Override
	public void updateHirer(int id) {
		
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query q =         currentSession.createQuery(" from Hirer where hirerId = id");
		
	}

	
	@Override
	public void getHirerByLocation(Hirer hirer, String state, String lga) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteHirer(Long theid) {
		
		Session theCurrentSession = sessionFactory.getCurrentSession();
		
		Query q = theCurrentSession.createQuery("Delete from Hirer where id:=hirer_id");
		
		   q.setParameter("hirer_id", theid);
		   
		   q.executeUpdate();
		
	}
	
	

}
