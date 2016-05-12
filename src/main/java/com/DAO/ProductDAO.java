package com.DAO;

import java.util.List;

import com.EntityClassess.Product;
import com.EntityClassess.User;

public interface ProductDAO {
	
	public List<Product> getList();
	public void addProduct(Product p);
	public void updateProduct(Product p);
	public void deleteProduct(String prodid);
	public Product getProductbyId(String prodid);
	 public List<Product> getRecordsByCtg(String ctg);

}
