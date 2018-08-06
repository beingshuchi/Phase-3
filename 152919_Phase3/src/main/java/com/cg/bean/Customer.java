package com.cg.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	String name;
	@Id
	String mobileNo;
	@OneToOne(cascade=CascadeType.ALL)
	Wallet wallet;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	

	public Customer(String name, String mobileNo, Wallet wallet) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.wallet = wallet;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", mobileNo=" + mobileNo + ", wallet=" + wallet + "]";
	}
	
}
