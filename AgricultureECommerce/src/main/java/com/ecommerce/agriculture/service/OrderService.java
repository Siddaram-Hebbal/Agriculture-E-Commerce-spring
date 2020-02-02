package com.ecommerce.agriculture.service;

import java.util.List;

import com.ecommerce.agriculture.entity.Admin;
import com.ecommerce.agriculture.entity.Order;
/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
public interface OrderService {


	public Order findByOrderid(int id);
	
	public Admin findByEmail(String user);
	
	public Admin findByUser(String user);
	
	public List<Admin> findAll();

	public void save(Admin admin);

	public void deleteById(int theId);
}
