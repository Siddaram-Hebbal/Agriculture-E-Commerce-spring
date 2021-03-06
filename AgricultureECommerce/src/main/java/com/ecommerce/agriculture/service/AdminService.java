package com.ecommerce.agriculture.service;

import java.util.List;

import com.ecommerce.agriculture.entity.Admin;
import com.ecommerce.agriculture.entity.Seller;
/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
public interface AdminService {


	public List<Admin> findByRole(String user);

	public Admin findById(int id);
	
	public Admin findByEmail(String user);
	
	public Admin findByUser(String user);
	
	public List<Admin> findAll();

	public void save(Admin admin);

	public void deleteById(int theId);
}
