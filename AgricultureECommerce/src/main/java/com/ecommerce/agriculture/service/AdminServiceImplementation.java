package com.ecommerce.agriculture.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.agriculture.entity.Admin;
import com.ecommerce.agriculture.repository.AdminRepository;

/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
@Service
public class AdminServiceImplementation implements AdminService {

	private AdminRepository adminRepository;

	@Autowired   
	public AdminServiceImplementation( AdminRepository obj)
	{
		adminRepository=obj;
	}
	
	@Override
	public List<Admin> findAll() {
		return adminRepository.findAll();
	}

	@Override
	public void save(Admin admin)
	{
		
		adminRepository.save(admin);
	}

	@Override
	public Admin findByEmail(String user) {
		// TODO Auto-generated method stub
		
		return adminRepository.findByEmail(user);
		
	}
	@Override
	public Admin findByUser(String user) {
		
		return adminRepository.findByEmail(user);
		
	}
	@Override
	public List<Admin> findByRole(String user) {
		
		return adminRepository.findByRole(user);
	}

	@Override
	public void deleteById(int theId) {
		
		 adminRepository.deleteById(theId);
	}

	@Override
	public Admin findById(int id) {
		
		return adminRepository.findById(id);
	}

	
}
