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
@Table( name="hirer")
public class Hirer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hirer_id")
	private Long hirer_id;
	
	
	public Hirer(Long hirer_id) {
		
		this.hirer_id = hirer_id;
		
	}
	
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name= "User_id") private User user;
	 */
	
	@OneToOne(mappedBy="hirer")
	private Job job;
	
	public Long getHirer_id() {
		return hirer_id;
	}

	public void setHirer_id(Long hirer_id) {
		this.hirer_id = hirer_id;
	}

		
	@Override
	public String toString() {
		return "Hirers [hirer_id=" + hirer_id + "]";
	}


	
	

}
