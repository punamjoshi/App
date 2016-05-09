package com.controller;

import java.util.List;

import javax.transaction.Transactional;





import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.DAO.ProductDAO;
import com.EntityClassess.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

    @Autowired
    SessionFactory sessionFactory;
	public ProductDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Transactional
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
         Transaction tx;
		 Session session=sessionFactory.openSession();
         tx=session.beginTransaction();
         session.save(p);
         tx.commit();
         session.close();
		
	}

	@Transactional
	public void deleteProduct(String prodid) {

		Session session = sessionFactory.openSession();  
		  Transaction tx = session.beginTransaction();  
		  Product p=(Product)session.load(Product.class, prodid);
		  session.delete(p);  
		  tx.commit();  
		
		  session.close();  
		
	}

	@Transactional
	public List<Product> getList() {
		// TODO Auto-generated method stub
		 Session session = sessionFactory.openSession();  
		  @SuppressWarnings("unchecked")  
		  List<Product> ProductList = session.createQuery("from Product")  
		    .list();  
		  session.close();  
		  return ProductList;  
		
	}

	@Transactional
	public void updateProduct(Product p) {
		Session session = sessionFactory.openSession();  
		  Transaction tx = session.beginTransaction();  
		  session.saveOrUpdate(p);  
		  tx.commit();  
		//  Serializable id = session.getIdentifier(employee);  
		  session.close();  
	}

	@Override
	public Product getProductbyId(String prodid) {
		  Session session = sessionFactory.openSession();  
		  Product prod = (Product) session.load(Product.class, prodid);  
		  return prod;  
	}

}
