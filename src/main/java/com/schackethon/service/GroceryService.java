package com.schackethon.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schackethon.dto.GroceryItemDto;
import com.schackethon.dto.GroceryOutputDto;
import com.schackethon.entity.ProductQty;
import com.schackethon.entity.UserDetails;
import com.schackethon.repository.UserDetailsRepository;

@Service
public class GroceryService {

	@Autowired
	UserDetailsRepository repository;

	public GroceryOutputDto GetGroceryList(String userId)
	{
		UserDetails user=null;
		try
		{
			user = repository.getOne(userId);
		}
		catch (Exception e)
		{
			System.out.println("Invalid User Request");
			return null;
			
		}
			GroceryOutputDto groceryOutputDto =new GroceryOutputDto();
		if(user!=null && user.getProducts()!=null)
		{
			groceryOutputDto.setEmailId(user.getEmailId());
			groceryOutputDto.setTelephoneNumber(user.getTelephoneNumber());
			groceryOutputDto.setUserId(user.getUserId());
			groceryOutputDto.setUsername(user.getUsername());
			double totalPrice=0;
			List<GroceryItemDto> groceryList=new ArrayList<>();
			for(ProductQty details:user.getProducts())
			{
				GroceryItemDto dto=new GroceryItemDto();
				dto.setItemId(details.getItem().getItemId());
				dto.setItemName(details.getItem().getItemName());
				dto.setPrice(details.getItem().getPrice());
				dto.setQuantity(details.getQuantity());
				groceryList.add(dto);
				totalPrice+=details.getItem().getPrice() * details.getQuantity();
			}
			
			groceryOutputDto.setItems(groceryList);
			groceryOutputDto.setTotalPrice(totalPrice);
			
		}
		else 
		{
			return null;
		}
		return groceryOutputDto;
		
		
		}
	}

