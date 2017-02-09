package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Attribute {
	
	@Id
	@GeneratedValue
	private Long id;
	private String description;
	@OneToOne
	private Animal animal;
	
	
	public Attribute() {}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Animal getAnimal() {
		return animal;
	}


	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	
	

}
