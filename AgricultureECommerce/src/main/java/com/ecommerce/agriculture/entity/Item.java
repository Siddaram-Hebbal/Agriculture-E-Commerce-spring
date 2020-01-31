package com.ecommerce.agriculture.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Transient;

/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
@Entity
@Table(name = "item")
public class Item {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	
	@Column(name = "itemID")
	private String itemID;

	@Column(name = "itemName")
	private String itemName;

	@Column(name = "itemPrice")
	private String itemPrice;

	@Column(name = "itemType")
	private String itemType;

	@Column(name = "itemIMG")
	private String itemIMG;


	@Column(name = "itemSeason")
	private String itemSeason;
	
	@Column(name = "desc")
	private String desc;
	
	@Column(name = "sellerID")
	private String sellerID;
	
	@Column(name = "sellerName")
	private String sellerName;
	
	
	@Column(name = "sellerAddress")
	private String sellerAddress;

	
	@Column(name = "sellerMob")
	private String sellerMob;
	
	@Column(name = "views")
	private String views;
	
	
	@Column(name = "views")
	private boolean active;
}