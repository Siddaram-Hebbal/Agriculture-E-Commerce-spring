package com.ecommerce.agriculture.service;

import java.util.List;

import com.ecommerce.agriculture.entity.Order;
/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
public interface OrderService {

	public Order findByOrderid(int id);
	
	public List<Order> findAll();

	public void save(Order o);
	
	List<Order> findBySellerid(int user);

	List<Order> findByUserid(int user);

	public void deleteByOrderid(int theId);
}
