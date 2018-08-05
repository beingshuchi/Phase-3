package com.cg.bean;

import javax.persistence.*;
import java.util.List;

/**
 * @author SHUCHITA
 *
 */
@Entity
public class Transactions {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@ManyToOne
	private Wallet wallet;
	@OneToOne
	private Deposit deposit;
	@OneToOne
	private Withdraw withdraw;
	
	
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	public Deposit getDeposit() {
		return deposit;
	}
	public void setDeposit(Deposit deposit) {
		this.deposit = deposit;
	}
	
	
	public int getId() {
		return id;
	}
	
	
	public Withdraw getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(Withdraw withdraw) {
		this.withdraw = withdraw;
	}
	
	
	@Override
	public String toString() {
		return "Transactions [id=" + id + ", wallet=" + wallet + ", deposit=" + deposit + ", withdraw=" + withdraw
				+ "]";
	}
	public Transactions() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
