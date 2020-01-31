package com.ecommerce.agriculture.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.agriculture.entity.Seller;
/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
@Repository("userRepository")
public interface UserRepository extends CrudRepository<Seller, Long> {
	
	
	 Seller findByEmail(String email);
	
	 Seller findByConfirmationToken(String confirmationToken);
	 
	  List<Seller> findAll();
}