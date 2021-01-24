package com.aksam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aksam.dao.JobDao;
import com.aksam.entity.Job;

@Service
public class JobServiceImpl implements JobService {
	
	@Autowired
	JobDao jobDao;

	@Override
	@Transactional
	public List<Job> getAllJobpost() {
		
		return jobDao.getAllJobpost();
	}

}
