package com.cg.repo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import com.cg.bean.Customer;
import com.cg.bean.Deposit;
import com.cg.bean.Wallet;
import com.cg.exception.WalletException;
import com.cg.util.DBUtil;

public class WalletRepoImpl implements IWalletRepo{
	
	@Override
	public boolean save(Customer customer) throws WalletException {
		EntityManager em= DBUtil.getConnection();
		em.getTransaction().begin();
		em.persist(customer);
		em.getTransaction().commit();
		return true;
	}
	
	@Override
	public Customer find(String mobile) throws WalletException {
		// TODO Auto-generated method stub
		EntityManager em= DBUtil.getConnection();
		
		Customer cust=em.find(mobile);
		
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
		Deposit dep= new Deposit();
		dep.setCredit(customer.getWallet().getBalance());
		dep.setDate(Date.valueOf(LocalDate.now()));
			EntityManager em= DBUtil.getConnection();
			em.getTransaction().begin();
			em.persist(customer);
			em.persist(dep);
			em.getTransaction().commit();
			return true;
			
		
	}
	
	
	
	

	

}
