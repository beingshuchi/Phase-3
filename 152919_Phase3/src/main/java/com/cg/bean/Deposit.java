package com.cg.bean;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;
@Entity
public class Deposit {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	private Date date;
	private BigDecimal credit;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public BigDecimal getCredit() {
		return credit;
	}
	public void setCredit(BigDecimal credit) {
		this.credit = credit;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Deposit [id=" + id + ", date=" + date + ", credit=" + credit + "]";
	}
	
	
}
