package com.ecommerce.agriculture.service;

import java.util.List;

import com.ecommerce.agriculture.entity.Item;
/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
public interface ItemService {


	public Item findById(int id);
	
	public List<Item> findAll();

	public void save(Item admin);

	public void deleteById(int theId);
}
