package com.aksam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="job")
public class Job {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long job_id;
	
	@Column
	private String Status;
	
	@OneToOne
	@JoinColumn(name="hirer_id")
	private Hirer hirer;

	public Job(Long job_id, String status) {
		this.job_id = job_id;
		Status = status;
	}

	
	public Long getJob_id() {
		return job_id;
	}

	public void setJob_id(Long job_id) {
		this.job_id = job_id;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Hirer getHirer() {
		return hirer;
	}

	public void setHirer(Hirer hirer) {
		this.hirer = hirer;
	}


	@Override
	public String toString() {
		return "Job [job_id=" + job_id + ", Status=" + Status + ", hirer=" + hirer + "]";
	}

	
	
}
