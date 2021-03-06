package com.example;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface DogRepository extends AnimalBaseRepository<Dog> {
	Dog findOne(Long id);
}
