package com.schackethon.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class GroceryOutputDto {

	    @Getter
	    @Setter
	    private String userId;
	     
	    @Getter
	    @Setter
	    private String username;
	      
	    @Getter
	    @Setter
	    private long telephoneNumber;
	     
	    @Getter
	    @Setter
	    private String emailId;
	    
	    @Getter
	    @Setter
	    private List<GroceryItemDto> items;
	    
	    @Getter
	    @Setter
	    private double totalPrice;

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public long getTelephoneNumber() {
			return telephoneNumber;
		}

		public void setTelephoneNumber(long telephoneNumber) {
			this.telephoneNumber = telephoneNumber;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public List<GroceryItemDto> getItems() {
			return items;
		}

		public void setItems(List<GroceryItemDto> items) {
			this.items = items;
		}

		public double getTotalPrice() {
			return totalPrice;
		}

		public void setTotalPrice(double totalPrice) {
			this.totalPrice = totalPrice;
		}
	    

}
