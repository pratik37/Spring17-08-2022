package com.mindgate.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Address {
	private String name;
	private String place;
	private String city;
	public Address() {
		System.out.println("Default Constructor of a address class");
	}
	public Address(String name, String place, String city) {
		super();
		this.name = name;
		this.place = place;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [name=" + name + ", place=" + place + ", city=" + city + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
