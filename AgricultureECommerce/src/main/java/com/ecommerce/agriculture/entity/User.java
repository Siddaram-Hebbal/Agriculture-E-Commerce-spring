package com.ecommerce.agriculture.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Transient;

/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
@Entity
@Table(name = "user")
public class User {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "username")
	private String user;
	
	@Column(name = "password")
	@Transient
	private String password;

	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "enabled")
	private boolean enabled;
	
	@Column(name = "confirmation_token")
	private String confirmationToken;

	@Column(name = "gender")
	private String gender;
	
	
	@Column(name = "authority")
	private String role;
	
	@Column(name = "lastseen")
	@Transient
	private String lastseen;
	

	@Column(name = "mobile")
	private String mobile;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "email")
	private String email;
	
	
	@Column(name = "latt")
	private String latt;
	
	
	@Column(name = "longi")
	private String longi;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public boolean isEnabled() {
		return enabled;
	}


	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}


	public String getConfirmationToken() {
		return confirmationToken;
	}


	public void setConfirmationToken(String confirmationToken) {
		this.confirmationToken = confirmationToken;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getLastseen() {
		return lastseen;
	}


	public void setLastseen(String lastseen) {
		this.lastseen = lastseen;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getLatt() {
		return latt;
	}


	public void setLatt(String latt) {
		this.latt = latt;
	}


	public String getLongi() {
		return longi;
	}


	public void setLongi(String longi) {
		this.longi = longi;
	}


	@Override
	public String toString() {
		return "Admin [id=" + id + ", user=" + user + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", enabled=" + enabled + ", confirmationToken=" + confirmationToken
				+ ", gender=" + gender + ", role=" + role + ", lastseen=" + lastseen + ", mobile=" + mobile
				+ ", address=" + address + ", email=" + email + ", latt=" + latt + ", longi=" + longi + "]";
	}


}