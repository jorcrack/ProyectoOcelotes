package com.example.psi.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.psi.persistance.Rural;
import com.example.psi.persistance.Total;

import com.example.psi.repository.RuralRepository;
import com.example.psi.repository.TotalRepository;

@CrossOrigin(origins="http://localhost:8080")
@RestController
@RequestMapping("/api")
public class TotalController {

	
	 @Autowired
	    TotalRepository totalRepository;
	 @Autowired
	    RuralRepository ruralRepository;
	 
	 @CrossOrigin(origins="http://localhost:8080")
	 @GetMapping("/poblaciontotal")
	    public List<Total> getAllEvents() {
		    System.out.println("==== Buscando eventos ====");
	        return totalRepository.findAll();
	    }
	 
	 @CrossOrigin(origins="http://localhost:8080")
	 @PostMapping("/poblaciontotal")
	    public Total create(@Valid @RequestBody Total total) {
		 	Total total1=totalRepository.save(total);
		 	Optional<Rural> rural=ruralRepository.findById(total1.getRural().getId());
		 	total1.setRural(rural.get());
	        return total1;
	    }
}
