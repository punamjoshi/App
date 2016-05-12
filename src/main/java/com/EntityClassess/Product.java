package com.EntityClassess;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URLDecoder;

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
     @Column
    private String fpath;
    
   transient private MultipartFile file1;
     
	
	

	

	

	public MultipartFile getFile1() {
		return file1;
	}

	public void setFile1(MultipartFile file1) {
		this.file1 = file1;
	}

	public String getFpath() {
		return fpath;
	}

	public void setFpath(String fpath) {
		this.fpath = fpath;
	}

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

	
	public  String getFilePath(String path1,String contextpath)
	{
		
		
		String fileName = null;
    	if (!file1.isEmpty()) {
            try {
            	
            	
                fileName = file1.getOriginalFilename();
                byte[] bytes = file1.getBytes();
                	String npath=path1+"\\resources\\images\\"+ fileName;
             //  String npath="/App/reources/"+fileName;
        				BufferedOutputStream buffStream = 
                        new BufferedOutputStream(new FileOutputStream(new File(npath)));
                buffStream.write(bytes);
                buffStream.close();
               String dbfilename=contextpath+"/resources/images/"+fileName;
                
                this.setFpath(dbfilename);
                return dbfilename;
            } catch (Exception e) {
                return "You failed to upload " + fileName + ": " + e.getMessage();
            }
        } else {
            return "Unable to upload. File is empty.";
        }
		
		
	}
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	

}
