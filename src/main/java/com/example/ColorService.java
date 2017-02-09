package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColorService {
	@Autowired
	private ColorRepository colorRepository;
	
	public void save(Color color) {
		colorRepository.save(color);
	}
}
