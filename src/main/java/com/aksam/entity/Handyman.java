package com.aksam.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "handyman")
public class Handyman {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long handyman_id;
	
	@Column(name="business_type")
	private String  business_type;
	
	@Column
	private  BigDecimal  cost;
	
	@Column
	private String  status;

	public Handyman(Long handyman_id, String buiness_type, BigDecimal cost, String status) {
		
		this.handyman_id = handyman_id;
		this.business_type = buiness_type;
		this.cost = cost;
		this.status = status;
	}

	@OneToOne
	@JoinColumn(name= "User_id")
	private User user;
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getHandyman_id() {
		return handyman_id;
	}

	public void setHandyman_id(Long handyman_id) {
		this.handyman_id = handyman_id;
	}

	public String getBuiness_type() {
		return business_type;
	}

	public void setBuiness_type(String buiness_type) {
		this.business_type = buiness_type;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

		@Override
	public String toString() {
		return "Handyman [handyman_id=" + handyman_id + ", buiness_type=" + business_type + ", cost=" + cost
				+ ", status=" + status + "]";
	}

}
