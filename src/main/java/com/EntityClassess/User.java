package com.EntityClassess;

import java.util.Set;









import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;





@Entity
public class User {
 
	@Id
	 @NotEmpty(message="please enter Userid")
	private String userId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	 @NotEmpty(message="please enter username")
	 private String username;
	 
	 @NotEmpty(message="please enter password")
	//@Range(min=8 , message="Please enter password minmum 8 character and maximum 20 characters" )
	 @Length(min=8,message="please enter password min 8 character")
	private String password;
	 @NotEmpty(message="please enter contact no.")
	private String mobno;
	 @NotEmpty(message="please enter email")
	 @Pattern(regexp=".+@.+\\..+", message="Wrong email!")
	private String email;
	 @NotEmpty(message="please enter address")
	private String address;
	 @NotEmpty(message="please enter City")
	private String city;
	 @NotEmpty(message="please enter country")
	private String country;
	@Column
	 private String cpassword;
	 
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	@OneToMany(mappedBy="user")
	Set<User_Authorization>roles;
	public User() {
	
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
 
	
	
}
