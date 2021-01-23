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
	@Column(name = "handyman_id")
	private Long handyman_id;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
		
	
	@Column(name="businessAddress")
	private String businessAddress;
	
	@Column(name="state")
	private String state;
	
	@Column(name="lga")
	private String lga;
	
	
	@Column(name="phoneNumber")
	private String phoneNumber;
	
	@Column(name="businesstype")
	private String  businesstype;
	
	@Column
	private  BigDecimal  cost;
	
	@Column
	private String  status;
	
	
public Handyman() {
		
	}
	
	
	public Handyman(Long handyman_id, String firstName, String lastName, String email, String password,
			String businesAddress, String state, String lga, String phoneNumber, String businesstype, BigDecimal cost,
			String status, User user) {
		super();
		this.handyman_id = handyman_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.businessAddress = businesAddress;
		this.state = state;
		this.lga = lga;
		this.phoneNumber = phoneNumber;
		this.businesstype = businesstype;
		this.cost = cost;
		this.status = status;
		//this.user = user;
	}
   
	
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name= "User_id") private User user;
	 * 
	 * 
	 * public User getUser() { return user; }
	 * 
	 * public void setUser(User user) { this.user = user; }
	 */
	
	
	public Long getHandyman_id() {
		return handyman_id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public String getBusinessAddress() {
		return businessAddress;
	}
	public String getState() {
		return state;
	}
	public String getLga() {
		return lga;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getBusinesstype() {
		return businesstype;
	}
	public BigDecimal getCost() {
		return cost;
	}
	public String getStatus() {
		return status;
	}
	public void setHandyman_id(Long handyman_id) {
		this.handyman_id = handyman_id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setLga(String lga) {
		this.lga = lga;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setBusinesstype(String businesstype) {
		this.businesstype = businesstype;
	}
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Handyman [handyman_id=" + handyman_id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", password=" + password + ", bussinesAddress=" + businessAddress + ", state="
				+ state + ", lga=" + lga + ", phoneNumber=" + phoneNumber + ", businesstype=" + businesstype + ", cost="
				+ cost + ", status=" + status + "]";
	}
	
	

	

}