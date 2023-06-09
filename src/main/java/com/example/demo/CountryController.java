package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class CountryController {

	@Autowired
	private CountryService countryService;
	
	@GetMapping("/countries")
	public List<Country> getCountries() {
		return countryService.getCountries();
	}
}
