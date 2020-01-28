package com.schackethon.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="TEST_USER_DETAILS")
public class UserDetails {

	    @Id
	    @GeneratedValue
	    @Column(name="UserId")
	    private String userId;
	     
	    @Column(name="UserName")
	    private String username;
	     
	    @Column(name="TelephoneNumber")
	    private long telephoneNumber;
	     
	    @Column(name="HouseAddress")
	    private String houseAddress;
	    
	    @Column(name="OfficeAddress")
	    private String officeAddress;
	    
	    @Column(name="EmailId")
	    private String emailId;
	    
	    @Column(name="PickUpShopAddress")
	    private String pickupShopAddress;
	    
	    @Column(name="GmapPinPickUpShop")
	    private String gmapPinShop;
	       

	    @OneToMany(mappedBy= "user",fetch=FetchType.EAGER)
	    private List<ProductQty> products;
	    
	    public UserDetails()
	    {
	    	
	    }
	    		
		public UserDetails(String userId, String username, long telephoneNumber, String houseAddress,
				String officeAddress, String emailId, String pickupShopAddress, String gmapPinShop) {
			super();
			this.userId = userId;
			this.username = username;
			this.telephoneNumber = telephoneNumber;
			this.houseAddress = houseAddress;
			this.officeAddress = officeAddress;
			this.emailId = emailId;
			this.pickupShopAddress = pickupShopAddress;
			this.gmapPinShop = gmapPinShop;
		}

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

		public String getHouseAddress() {
			return houseAddress;
		}

		public void setHouseAddress(String houseAddress) {
			this.houseAddress = houseAddress;
		}

		public String getOfficeAddress() {
			return officeAddress;
		}

		public void setOfficeAddress(String officeAddress) {
			this.officeAddress = officeAddress;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public String getPickupShopAddress() {
			return pickupShopAddress;
		}

		public void setPickupShopAddress(String pickupShopAddress) {
			this.pickupShopAddress = pickupShopAddress;
		}

		public String getGmapPinShop() {
			return gmapPinShop;
		}

		public void setGmapPinShop(String gmapPinShop) {
			this.gmapPinShop = gmapPinShop;
		}
		
		
		public List<ProductQty> getProducts() {
			return products;
		}

		public void setProducts(List<ProductQty> products) {
			this.products = products;
		}
	    

}
