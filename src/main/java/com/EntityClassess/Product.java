package com.EntityClassess;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.servlet.annotation.MultipartConfig;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="product")
public class Product {
 
	@Id
	@Column
	private String prodid;
	
	@Column
	private String pname;
	@Column
	private String pqty;
	@Column
	private String price;
	private String ctg;
	private String subctg;
  /*   @Column
    private String file;
    
 //    private MultipartFile file1;
     
	
	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}*/

	public String getProdid() {
		return prodid;
	}

	public void setProdid(String prodid) {
		this.prodid = prodid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPqty() {
		return pqty;
	}

	public void setPqty(String pqty) {
		this.pqty = pqty;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCtg() {
		return ctg;
	}

	public void setCtg(String ctg) {
		this.ctg = ctg;
	}

	public String getSubctg() {
		return subctg;
	}

	public void setSubctg(String subctg) {
		this.subctg = subctg;
	}

	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	

}
