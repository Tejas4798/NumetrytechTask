package com.test.com.test.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.com.test.demo.dto.UserRequest;
import com.test.com.test.demo.model.Laptop;
import com.test.com.test.demo.repo.Lap_Repo;
@Service
public class Lap_Service_Impl implements Lap_service {

	@Autowired
	private Lap_Repo repo;

	@Override
	public List<Laptop> getAlllap() {
		return repo.findAll();
	}

	@Override
	public Laptop getlapbyid(long id) {
		// TODO Auto-generated method stub
		
	
		{
			return repo.findById(id).get();
		}
	
		
	}

	@Override
	public Laptop savelaptop(UserRequest userRequest) {
		// TODO Auto-generated method stub
		Laptop lap=new Laptop();
		lap.setLap_name(userRequest.getLap_name());
		lap.setLap_type(userRequest.getLap_type());
		return repo.save(lap);
	}

	@Override
	public String deletelapbyid(long id) {
		// TODO Auto-generated method stub
		Laptop lap=repo.findById(id).get();
		repo.delete(lap);
		return "Deleted Successfully";
	}

	@Override
	public Laptop editlapbyid(Laptop lap_new, long id) {
		// TODO Auto-generated method stub
		Laptop lap_old=repo.findById(id).get();
		lap_old.setLap_id(lap_new.getLap_id());
		lap_old.setLap_name(lap_new.getLap_name());
		lap_old.setLap_type(lap_new.getLap_type());
		return repo.save(lap_old);
	}

}
