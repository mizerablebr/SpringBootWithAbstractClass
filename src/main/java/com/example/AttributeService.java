package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttributeService {
	@Autowired
	private AttributeRepository attributeRepository;
	
	public void save(Attribute attribute) {
		attributeRepository.save(attribute);
	}
}
