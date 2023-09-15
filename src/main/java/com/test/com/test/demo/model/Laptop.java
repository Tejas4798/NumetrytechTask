package com.test.com.test.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Laptop {

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long lap_id;

	private String lap_name;
	
	private String lap_type;
	
	

	public Laptop(long lap_id, String lap_name, String lap_type) {
		super();
		this.lap_id = lap_id;
		this.lap_name = lap_name;
		this.lap_type = lap_type;
	}

	@Override
	public String toString() {
		return "Laptop [lap_id=" + lap_id + ", lap_name=" + lap_name + ", lap_type=" + lap_type + "]";
	}

	public long getLap_id() {
		return lap_id;
	}

	public void setLap_id(long lap_id) {
		this.lap_id = lap_id;
	}

	public String getLap_name() {
		return lap_name;
	}

	public void setLap_name(String lap_name) {
		this.lap_name = lap_name;
	}

	public String getLap_type() {
		return lap_type;
	}

	public void setLap_type(String lap_type) {
		this.lap_type = lap_type;
	}

}
