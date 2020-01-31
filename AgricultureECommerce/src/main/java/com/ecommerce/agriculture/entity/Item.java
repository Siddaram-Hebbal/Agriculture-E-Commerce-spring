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

	@Column(name = "sellerLatt")
	private String sellerLatt;

	@Column(name = "sellerLatt")
	private String sellerLongi;
	
	@Column(name = "sellerMob")
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


	public String getItemID() {
		return itemID;
	}


	public void setItemID(String itemID) {
		this.itemID = itemID;
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
		return "Item [id=" + id + ", itemID=" + itemID + ", itemName=" + itemName + ", itemPrice=" + itemPrice
				+ ", itemType=" + itemType + ", itemIMG=" + itemIMG + ", itemSeason=" + itemSeason + ", desc=" + desc
				+ ", sellerID=" + sellerID + ", sellerName=" + sellerName + ", sellerAddress=" + sellerAddress
				+ ", sellerLatt=" + sellerLatt + ", sellerLongi=" + sellerLongi + ", sellerMob=" + sellerMob
				+ ", views=" + views + ", active=" + active + "]";
	}
	
	
}