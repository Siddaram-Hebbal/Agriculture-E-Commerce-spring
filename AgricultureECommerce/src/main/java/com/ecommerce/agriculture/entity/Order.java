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

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public String getOrderprice() {
		return orderprice;
	}

	public void setOrderprice(String orderprice) {
		this.orderprice = orderprice;
	}

	public String getOrderqty() {
		return orderqty;
	}

	public void setOrderqty(String orderqty) {
		this.orderqty = orderqty;
	}

	public String getSellerid() {
		return sellerid;
	}

	public void setSellerid(String sellerid) {
		this.sellerid = sellerid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}

	public String getPlaced() {
		return placed;
	}

	public void setPlaced(String placed) {
		this.placed = placed;
	}
	
	
	
}
