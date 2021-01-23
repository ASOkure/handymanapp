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
@Table(name = "job")
public class Job {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_id")
	private Long job_id;

	@Column(name = "status")
	private String Status; // To do change to enumaration

	@Column(name = "job_type")
	private String job_type;

	@Column(name = "job_description")
	private String job_description;

	@Column(name = "job_state")
	private String job_state;

	@Column(name = "job_lga")
	private String job_lga;

	@OneToOne
	@JoinColumn(name = "hirer_id")
	private Hirer hirer;

	public Job(Long job_id, String status, String job_type, String job_description, String job_state, String job_lga) {
		super();
		this.job_id = job_id;
		Status = status;
		this.job_type = job_type;
		this.job_description = job_description;
		this.job_state = job_state;
		this.job_lga = job_lga;
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

	public String getJob_type() {
		return job_type;
	}

	public void setJob_type(String job_type) {
		this.job_type = job_type;
	}

	public String getJob_description() {
		return job_description;
	}

	public void setJob_description(String job_description) {
		this.job_description = job_description;
	}

	public String getJob_state() {
		return job_state;
	}

	public void setJob_state(String job_state) {
		this.job_state = job_state;
	}

	public String getJob_lga() {
		return job_lga;
	}

	public void setJob_lga(String job_lga) {
		this.job_lga = job_lga;
	}

	public Hirer getHirer() {
		return hirer;
	}

	public void setHirer(Hirer hirer) {
		this.hirer = hirer;
	}

	@Override
	public String toString() {
		return "Job [job_id=" + job_id + ", Status=" + Status + ", job_type=" + job_type + ", job_description="
				+ job_description + ", job_state=" + job_state + ", job_lga=" + job_lga + "]";
	}

}
