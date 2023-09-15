package com.test.com.test.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.com.test.demo.model.Laptop;

@Repository
public interface Lap_Repo extends JpaRepository<Laptop, Long> {

}
