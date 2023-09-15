package com.test.com.test.demo.Srviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.test.com.test.demo.dto.UserRequest;
import com.test.com.test.demo.model.Laptop;
import com.test.com.test.demo.repo.Lap_Repo;
import com.test.com.test.demo.service.Lap_Service_Impl;



@SpringBootTest
class ServiceImplTest {

	@Autowired
	private  Lap_Service_Impl lap_Service_Impl;
	
	@MockBean
	private   Lap_Repo lap_Repo;
	
	@Test
	public  void testGetByID_Success() {
	
		Optional<Laptop> lap=Optional.of(new Laptop(2,"dell","gaming"));
	
		Mockito.when(lap_Repo.findById((long) 2)).thenReturn(lap);
	    assertEquals(lap,lap_Service_Impl.getlapbyid(2));
	
	}
	@Test
	public void saveLaptoptest()
	{
		
		
		
	}
	

}