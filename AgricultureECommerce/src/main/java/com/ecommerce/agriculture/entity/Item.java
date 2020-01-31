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
	
	

	@Column(name = "itemname")
	private String itemName;

	@Column(name = "itemprice")
	private String itemPrice;

	@Column(name = "itemtype")
	private String itemType;

	@Column(name = "itemimg")
	private String itemIMG;

	@Column(name = "itemqty")
	private String itemQty;

	@Column(name = "itemseason")
	private String itemSeason;
	
	@Column(name = "descc")
	private String desc;
	
	@Column(name = "sellerid")
	private String sellerID;
	
	@Column(name = "sellername")
	private String sellerName;
	
	
	@Column(name = "selleraddress")
	private String sellerAddress;

	@Column(name = "sellerlatt")
	private String sellerLatt;

	@Column(name = "selleremail")
	private String sellerEmail;
	
	@Column(name = "sellerlongi")
	private String sellerLongi;
	
	@Column(name = "sellermob")
	private String sellerMob;
	
	@Column(name = "views")
	private String views;
	
	
	@Column(name = "active")
	private boolean active;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getItemPrice() {
		return itemPrice;
	}


	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}


	public String getItemType() {
		return itemType;
	}


	public void setItemType(String itemType) {
		this.itemType = itemType;
	}


	public String getItemIMG() {
		return itemIMG;
	}


	public void setItemIMG(String itemIMG) {
		this.itemIMG = itemIMG;
	}


	public String getItemQty() {
		return itemQty;
	}


	public void setItemQty(String itemQty) {
		this.itemQty = itemQty;
	}


	public String getItemSeason() {
		return itemSeason;
	}


	public void setItemSeason(String itemSeason) {
		this.itemSeason = itemSeason;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public String getSellerID() {
		return sellerID;
	}


	public void setSellerID(String sellerID) {
		this.sellerID = sellerID;
	}


	public String getSellerName() {
		return sellerName;
	}


	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}


	public String getSellerAddress() {
		return sellerAddress;
	}


	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}


	public String getSellerLatt() {
		return sellerLatt;
	}


	public void setSellerLatt(String sellerLatt) {
		this.sellerLatt = sellerLatt;
	}


	public String getSellerEmail() {
		return sellerEmail;
	}


	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}


	public String getSellerLongi() {
		return sellerLongi;
	}


	public void setSellerLongi(String sellerLongi) {
		this.sellerLongi = sellerLongi;
	}


	public String getSellerMob() {
		return sellerMob;
	}


	public void setSellerMob(String sellerMob) {
		this.sellerMob = sellerMob;
	}


	public String getViews() {
		return views;
	}


	public void setViews(String views) {
		this.views = views;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemType=" + itemType
				+ ", itemIMG=" + itemIMG + ", itemQty=" + itemQty + ", itemSeason=" + itemSeason + ", desc=" + desc
				+ ", sellerID=" + sellerID + ", sellerName=" + sellerName + ", sellerAddress=" + sellerAddress
				+ ", sellerLatt=" + sellerLatt + ", sellerEmail=" + sellerEmail + ", sellerLongi=" + sellerLongi
				+ ", sellerMob=" + sellerMob + ", views=" + views + ", active=" + active + "]";
	}


	
	
}