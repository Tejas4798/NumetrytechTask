package com.test.com.test.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.com.test.demo.dto.UserRequest;
import com.test.com.test.demo.model.Laptop;

public interface Lap_service {
   
	public List<Laptop> getAlllap();
	
	public Laptop getlapbyid(long id);
	
	public Laptop savelaptop(UserRequest userRequest);
	
	public String deletelapbyid(long id);
	
	public Laptop editlapbyid(Laptop lap,long id);
	
	
	
	
	
}
