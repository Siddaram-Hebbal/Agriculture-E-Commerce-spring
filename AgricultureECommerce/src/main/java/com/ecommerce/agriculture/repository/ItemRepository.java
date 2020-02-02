package com.ecommerce.agriculture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.agriculture.entity.Item;

/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
@Repository("itemRepository")
public interface ItemRepository extends JpaRepository<Item, Integer> {

	Item findById(int user);
	
}