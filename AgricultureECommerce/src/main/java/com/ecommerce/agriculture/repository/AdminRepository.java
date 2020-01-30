package com.ecommerce.agriculture.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.agriculture.entity.Admin;
import com.ecommerce.agriculture.entity.User;

/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
@Repository("adminRepository")
public interface AdminRepository extends JpaRepository<Admin, Integer> {

	Admin findByEmail(String user);
	
	List<Admin> findByRole(String user);
}