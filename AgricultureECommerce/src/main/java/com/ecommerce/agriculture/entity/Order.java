package com.ecommerce.agriculture.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orderr")
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
	private int sellerid;
	
	@Column(name = "userid")
	private int userid;
	
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

	public int getSellerid() {
		return sellerid;
	}

	public void setSellerid(int sellerid) {
		this.sellerid = sellerid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
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

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", itemid=" + itemid + ", orderprice=" + orderprice + ", orderqty="
				+ orderqty + ", sellerid=" + sellerid + ", userid=" + userid + ", userAddress=" + userAddress
				+ ", track=" + track + ", placed=" + placed + "]";
	}
	
	
	
}
