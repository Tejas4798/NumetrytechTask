package com.test.com.test.demo.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class UserRequest {
	
	public UserRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserRequest(@NotNull(message = "The Name of the Laptop should not be null") String lap_name,
			@NotNull(message = "Laptop type should not be null") String lap_type) {
		super();
		this.lap_name = lap_name;
		this.lap_type = lap_type;
	}
	@Override
	public String toString() {
		return "UserRequest [lap_name=" + lap_name + ", lap_type=" + lap_type + "]";
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
	@NotNull(message="The Name of the Laptop should not be null")
	private String lap_name;
	@NotNull(message="Laptop type should not be null")
	private String lap_type;

}
