package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DogController {
	
	private DogService dogService;
	private ColorService colorService;
	
	@Autowired
	public DogController(DogService dogService, ColorService colorService) {
		this.dogService = dogService;
		this.colorService = colorService;
	}
	
	@RequestMapping("/")
	public String add(Model model) {
		model.addAttribute("dog", new Dog());
		return "addDog";
	}
	
	@RequestMapping("/save")
	public String save(Dog dog) {
		dogService.save(dog);
		return "addColorToDog";
	}
	
	//Colors
	
	@RequestMapping("/addColor")
	public String addColorToDog(Model model) {
		Animal dog = dogService.find(Long.valueOf("1"));
		System.out.println("Dog: " + dog);
		Color color = new Color();
		color.setAnimal(dog);
		model.addAttribute("dog", dog);
		model.addAttribute("color", color);
		return "addColorToDog";
	}
	
	@RequestMapping("/saveColor")
	public String saveColor(Color color) {
		System.out.println("Color: " + color);
		colorService.save(color);
		return "addColorToDog";
	}

}
