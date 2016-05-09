package com.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.ProductDAO;
import com.DAO.ProductService;
import com.EntityClassess.Product;
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDAO productDao;
	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
	}
    
	public void addProduct(Product p) {
		productDao.addProduct(p);
	}

	public void deleteProduct(String prodid) {
		// TODO Auto-generated method stub
		productDao.deleteProduct(prodid);
	}

	@Override
	public List<Product> getList() {
		return productDao.getList();
	}

	@Override
	public void updateProduct(Product p) {
		productDao.updateProduct(p);
		
	}

	@Override
	public Product getProductbyId(String prodid) {
		// TODO Auto-generated method stub
		
		Product p=productDao.getProductbyId(prodid);
		return p;
	}

}
