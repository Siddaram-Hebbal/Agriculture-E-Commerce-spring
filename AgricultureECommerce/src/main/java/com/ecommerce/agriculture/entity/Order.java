package com.ecommerce.agriculture.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Order {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int orderid;
	
	@Column(name = "itemid")
	private String itemid;
	
	@Column(name = "orderprice")
	private String orderprice;
	
	@Column(name = "orderqty")
	private String orderqty;
	
	@Column(name = "sellerid")
	private String sellerid;
	
	@Column(name = "userid")
	private String userid;
	
	@Column(name = "userAddress")
	private String userAddress;
	
	@Column(name = "track")
	private String track;
	
	@Column(name = "placed")
	private String placed;
	
}
