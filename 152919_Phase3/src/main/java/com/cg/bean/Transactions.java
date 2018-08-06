package com.cg.bean;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@ManyToOne
	private Wallet wallet;
	private String transactionType;
	private BigDecimal amt;
	private String amtType;
	private Date date;
		public int getId() {
		return id;
	}
	
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public BigDecimal getAmt() {
		return amt;
	}
	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}
	public String getAmtType() {
		return amtType;
	}
	public void setAmtType(String amtType) {
		this.amtType = amtType;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	@Override
	public String toString() {
		return "Transactions [id=" + id + ", wallet=" + wallet+ ", transactionType=" + transactionType + ", amtType=" + amtType +" ,amount="+amt +

				" ,date=" + date  + "]";
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}
