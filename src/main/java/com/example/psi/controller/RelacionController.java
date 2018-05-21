package com.example.psi.controller;


import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.psi.persistance.Relacion;

import com.example.psi.repository.RelacionRepository;


@CrossOrigin(origins="http://localhost:8080")
@RestController
@RequestMapping("/api")
public class RelacionController {

	
 RelacionRepository relacionRepository;
	 
	 
	 @CrossOrigin(origins="http://localhost:8080")
	 @GetMapping("/relacion")
	    public List<Relacion> getAllEvents() {
		    System.out.println("==== Buscando datos ====");
	        return relacionRepository.findAll();
	    }

	
}
