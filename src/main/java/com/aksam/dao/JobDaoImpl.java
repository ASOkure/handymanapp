package com.aksam.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aksam.entity.Job;

@Repository
public class JobDaoImpl implements JobDao {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public List<Job> getAllJobpost() {
		
		// create currentSession
				Session currentSession = sessionFactory.getCurrentSession();
				
				// create query and execute
				Query q =  currentSession.createQuery("from Job", Job.class);
				
				        
				List<Job> jobs = q.getResultList();
					

					return jobs;
				}


	@Override
	public void saveJob(Job theJob) {
		
		
		// create currentSession
				Session currentSession = sessionFactory.getCurrentSession();
				
				// use session saveorUpdate method to save
				 currentSession.saveOrUpdate(theJob);
		
	}
		
	}


