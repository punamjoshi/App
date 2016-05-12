package com.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.DAO.UserDao;
import com.EntityClassess.Product;
import com.EntityClassess.User;

@Repository
public class UserDaoImpl implements UserDao {

	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	 @Autowired
	    SessionFactory sessionFactory;
		

	


		@Transactional
		public List<User> getList() {
			// TODO Auto-generated method stub
			 Session session = sessionFactory.openSession();  
			  @SuppressWarnings("unchecked")  
			  List<User> ProductList = session.createQuery("from User")  
			    .list();  
			  session.close();  
			  return ProductList;  
			
		}

		
		

		@Transactional
		public void addUser(User p) {
			// TODO Auto-generated method stub
		     Transaction tx;
					 Session session=sessionFactory.openSession();
			        tx=session.beginTransaction();
			         session.save(p);
			         tx.commit();
			         session.close();
		}

		
		

		@Transactional
		public void deleteUser(String prodid) {
			// TODO Auto-generated method stub
			
		}

		@Transactional
		public User getUserbyId(String prodid) {
			// TODO Auto-generated method stub
			 Session session = sessionFactory.openSession();  
			  User prod = (User) session.load(User.class, prodid);  
			  return prod;  
			
		}

		@Transactional
		public void updateUser(User p) {
			// TODO Auto-generated method stub
			Session session = sessionFactory.openSession();  
			  Transaction tx = session.beginTransaction();  
			  session.saveOrUpdate(p);  
			  tx.commit();  
			//  Serializable id = session.getIdentifier(employee);  
			  session.close();  
			
		}

}
