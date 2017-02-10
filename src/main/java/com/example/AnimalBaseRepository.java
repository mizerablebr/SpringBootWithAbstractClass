package com.example;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AnimalBaseRepository<T extends Animal> extends CrudRepository<T, Long> {
	
}
