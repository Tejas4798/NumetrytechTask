package com.test.com.test.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.com.test.demo.dto.UserRequest;
import com.test.com.test.demo.model.Laptop;
import com.test.com.test.demo.service.Lap_service;

@RestController
public class Lap_Controller {
   
	@Autowired
	private Lap_service service;

	
	@GetMapping("/laptop")
	public ResponseEntity<?> getall()
	{
		return new ResponseEntity<>(service.getAlllap(),HttpStatus.OK);
	}
	
	@GetMapping("/laptop/{id}")
	public ResponseEntity<?> getbyid(@PathVariable long id)
	{
		return new ResponseEntity<>(service.getlapbyid(id),HttpStatus.OK);
	}
	
	@PostMapping("/laptop")
	public ResponseEntity<?> save(@RequestBody @Valid UserRequest userRequest)
	{
		return new ResponseEntity<>(service.savelaptop(userRequest),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/laptop/{id}")
	public ResponseEntity<?> deletById(@PathVariable long id)
	{
		return new ResponseEntity<>(service.deletelapbyid(id),HttpStatus.OK);
	}
	
	@PutMapping("laptop/{id}")
	public ResponseEntity<?> editById(@PathVariable long id,@RequestBody Laptop lap)
	{
		return new ResponseEntity<>(service.editlapbyid(lap, id),HttpStatus.OK);
	}
	
	
	
	
	
}
