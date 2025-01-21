package com.example.friday;
public class FridayEntity {
	private String description;
	private String location;
	private Double temp;
	public FridayEntity(String description, String location, Double temp) {
		super();
		this.description = description;
		this.location = location;
		this.temp = temp;
	}
	public String getDescription() {
		return description;
	}
	public String getLocation() {
		return location;
	}
	public Double getTemp() {
		return temp;
	}
}
