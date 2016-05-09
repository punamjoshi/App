package com.DAO;

import java.util.List;

import com.EntityClassess.Product;

public interface ProductService {

	
	public List<Product> getList();
	public void addProduct(Product p);
	public void updateProduct(Product p);
	public void deleteProduct(String prodid);
	public Product getProductbyId(String prodid);
}
