package com.schackethon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.schackethon.dto.GroceryOutputDto;
import com.schackethon.service.GroceryService;

@RestController
@RequestMapping("/bigbasket")
public class GroceryController {
	
	@Autowired
    GroceryService service;

	
	@GetMapping("/{userId}")
	    public ResponseEntity<GroceryOutputDto> getEmployeeById(@PathVariable("userId") String userId) 
	     {
		
		 GroceryOutputDto entity = service.GetGroceryList(userId);
	 
	     if (entity !=null)
	     {
		 return new ResponseEntity<GroceryOutputDto>(entity, new HttpHeaders(), HttpStatus.OK);
	    }
	     else
	     {
	    	 System.out.print("error! !!");
	    	 return new ResponseEntity<>(null, new HttpHeaders(), HttpStatus.BAD_REQUEST);
	     }
	     }
	     
}
