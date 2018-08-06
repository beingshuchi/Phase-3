package com.cg.repo;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.EntityManager;
import com.cg.bean.Customer;
import com.cg.bean.Transaction;
import com.cg.exception.WalletException;
import com.cg.util.DBUtil;

public class WalletRepoImpl implements IWalletRepo {

	@Override
	public boolean save(Customer customer) throws WalletException {
		EntityManager em= DBUtil.getConnection();
		em.getTransaction().begin();
		em.merge(customer);
		em.getTransaction().commit();
		return true;
	}
	
	@Override
	public Customer find(String mobile) throws WalletException {
		// TODO Auto-generated method stub
		EntityManager em= DBUtil.getConnection();
		
		Customer cust=em.find(Customer.class,mobile);
		
		if(cust!=null) {
			return cust;
		}
		else {
			throw new WalletException(
					"The entered mobile number does not exists.");
		}
		
	}

	@Override
	public boolean createAccount(Customer customer) throws WalletException {
		// TODO Auto-generated method stub
		Transaction trans= new Transaction();
		trans.setAmt(customer.getWallet().getBalance());
		trans.setAmtType("credit");
		trans.setTransactionType("deposit");
		trans.setWallet(customer.getWallet());
		    trans.setDate(Date.valueOf(LocalDate.now()));
			EntityManager em= DBUtil.getConnection();
			em.getTransaction().begin();
			em.persist(customer);
			em.persist(trans);
			em.getTransaction().commit();
			return true;
			
		
	}
	
	
	
	

	

	
}
