package com.ecommerce.agriculture.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.agriculture.entity.Order;


/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
@Repository("orderRepository")
public interface OrderRepository extends JpaRepository<Order, Integer> {

	Order findByOrderid(int user);
	
	List<Order> findBySellerid(int user);

	List<Order> findByUserid(int user);
	
	void deleteByOrderid(int theId);
	
}