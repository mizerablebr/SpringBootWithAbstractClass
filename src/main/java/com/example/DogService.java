package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DogService {
	
	@Autowired
	private DogRepository dogRepository;
	
	public void save(Dog dog) {
		dogRepository.save(dog);
	}
	
	public Dog find(Long id) {
		
		Animal animal = dogRepository.findOne(id); 
		if (animal instanceof Dog) {
			return (Dog) animal;
		} else {
			return null;
		}
	
	}

}
