package com.cg.bean;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.*;
@Entity
public class Wallet {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	private BigDecimal balance;
	@OneToMany(mappedBy="wallet")
	List<Transactions>transaction;
	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Wallet [balance=" + balance + "]";
	}

	public List<Transactions> getTransaction() {
		return transaction;
	}

	public void setTransaction(List<Transactions> transaction) {
		this.transaction = transaction;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
