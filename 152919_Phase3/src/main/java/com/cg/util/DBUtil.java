package com.cg.util;



import com.cg.exception.WalletException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DBUtil {

		public static EntityManager getConnection() throws WalletException{
			
			
			EntityManagerFactory fact= Persistence.createEntityManagerFactory("JPA-PU");
			return fact.createEntityManager();
			
		
	}
}
