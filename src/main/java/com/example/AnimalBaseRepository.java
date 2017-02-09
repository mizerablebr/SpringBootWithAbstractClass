package com.example;

import org.springframework.data.repository.CrudRepository;

public interface AnimalBaseRepository<T extends Animal> extends CrudRepository<Animal, Long> {

}
