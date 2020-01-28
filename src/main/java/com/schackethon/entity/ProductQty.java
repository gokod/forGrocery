package com.schackethon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="TEST_USER_SHOP_LIST")
public class ProductQty {
	
	private String shoplistid;

	private String userId;

	private UserDetails user;
		
	private ProductDetails item;
	
	private String itemId;
	
	private long quantity;
	
	@Column(name="SHOPLISTID")
	@Id
	@GeneratedValue
	public String getShoplistid() {
		return shoplistid;
	}

	public void setShoplistid(String shoplistid) {
		this.shoplistid = shoplistid;
	}
	

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="UserId",insertable=false,updatable=false)
	public UserDetails getUser() {
		return user;
	}

	public void setUser(UserDetails user) {
		this.user = user;
	}
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ItemId",insertable=false,updatable=false)
	public ProductDetails getItem() {
		return item;
	}

	public void setItem(ProductDetails item) {
		this.item = item;
	}
	
	@Column(name="Quantity")
	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	@Column(name="UserId")
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name="ItemId")
	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	
	

	

}

