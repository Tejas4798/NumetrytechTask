package com.test.com.test.demo.repo;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;



import com.test.com.test.demo.model.Laptop;

@DataJpaTest
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)


class Repotest {

	@Autowired
	private Lap_Repo lap_Repo;
	
	@Autowired 
	private  TestEntityManager EntityManager;
	
    public Laptop getlap()
    {
    	Laptop lap=new Laptop();
    	lap.setLap_id(1);
    	lap.setLap_name("dell");
    	lap.setLap_type("Gaming");
    	return lap;
    	
    }
	@Test
	public void testFindById() {
		Laptop lap=getlap();
		Laptop lap_mock=EntityManager.merge(lap);
		Laptop lap_actual=lap_Repo.findById(lap.getLap_id()).get();
		assertEquals(lap_mock.getLap_name(),lap.getLap_name());
		
	}

}
