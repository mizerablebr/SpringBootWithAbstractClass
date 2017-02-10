package com.example;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface AnimalRepository extends AnimalBaseRepository<Animal> {

}
