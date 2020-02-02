package com.ecommerce.agriculture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.agriculture.entity.Item;
import com.ecommerce.agriculture.entity.Order;

/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
@Repository("orderRepository")
public interface OrderRepository extends JpaRepository<Order, Integer> {

	Item findByOrderid(int user);
	
}