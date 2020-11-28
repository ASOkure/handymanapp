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
@Table(name="payments")
public class Payments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long payments_id;
	
	@Column
	private BigDecimal amount;
	

	public Payments(Long payments_id, BigDecimal amount) {
		this.payments_id = payments_id;
		this.amount = amount;
	}

    @OneToOne
    @JoinColumn(name="user_id")
	private User user;

	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getPayments_id() {
		return payments_id;
	}

	public void setPayments_id(Long payments_id) {
		this.payments_id = payments_id;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	
	@Override
	public String toString() {
		return "Payments [payments_id=" + payments_id + ", amount=" + amount + ", user=" + user + "]";
	}

}
