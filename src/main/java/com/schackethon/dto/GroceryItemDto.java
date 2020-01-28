package com.schackethon.dto;

import lombok.Getter;
import lombok.Setter;

public class GroceryItemDto {
	
	
	private String itemId;
	

	
	private String itemName;
	

	private Long quantity;
	

	private double price;


	public String getItemId() {
		return itemId;
	}


	public void setItemId(String itemId) {
		this.itemId = itemId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}




	public Long getQuantity() {
		return quantity;
	}


	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
}
