package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class DogController {
	
	private DogService dogService;
	private AttributeService attributeService;
	
	@Autowired
	public DogController(DogService dogService, AttributeService attributeService) {
		this.dogService = dogService;
		this.attributeService = attributeService;
	}
	
	@RequestMapping("/")
	public String add(Model model) {
		model.addAttribute("dog", new Dog());
		return "addDog";
	}
	
	@RequestMapping("/save")
	public String save(Dog dog) {
		dogService.save(dog);
		return "redirect:/addColor";
	}
	
	//Colors
	
	@RequestMapping("/addColor")
	public String addColorToDog(Model model) {
		Animal dog = dogService.find(Long.valueOf("1"));
		System.out.println("Dog: " + dog);
		Attribute attribute = new Attribute();
		attribute.setAnimal(dog);
		model.addAttribute("dog", dog);
		model.addAttribute("attribute", attribute);
		return "addColorToDog";
	}
	
	@RequestMapping("/color")
	public String saveColor(Attribute attribute, BindingResult bindingResult) {
		System.out.println("BindingResults: " + bindingResult);
		System.out.println("Color: " + attribute);
		attributeService.save(attribute);
		return "redirect:/addColor";
	}

}
