package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CountryService {
	
	public List<Country> getCountries() {
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("Uruguay", "Montevideo", 3400000));
        countries.add(new Country("Brazil", "Brasília", 214000000));
        countries.add(new Country("Canada", "Ottawa", 38000000));
        countries.add(new Country("Argentina", "Buenos aires", 45810000));
        return countries;
    }
}
