package com.ecommerce.agriculture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.agriculture.entity.Item;
import com.ecommerce.agriculture.repository.ItemRepository;

/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
@Service
public class OrderServiceImplementation implements ItemService {

	private ItemRepository itemRepository;

	@Autowired   
	public OrderServiceImplementation( ItemRepository obj)
	{
		itemRepository=obj;
	}
	
	@Override
	public List<Item> findAll() {
		return itemRepository.findAll();
	}

	@Override
	public void save(Item admin)
	{
		
		itemRepository.save(admin);
	}
	@Override
	public void deleteById(int theId) {
		
		 itemRepository.deleteById(theId);
	}

	@Override
	public Item findById(int id) {
		
		return itemRepository.findById(id);
	}

	
}
