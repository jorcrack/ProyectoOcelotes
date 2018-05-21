package com.example.psi.controller;

import com.example.psi.exception.ResourceNotFoundException;
import com.example.psi.persistance.Rural;
import com.example.psi.repository.RuralRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by .
 */
@CrossOrigin(origins="http://localhost:8080")
@RestController
@RequestMapping("/api")
public class RuralController {

    @Autowired
    RuralRepository ruralRepository;

    @CrossOrigin
    @GetMapping("/rural")
    public List<Rural> getAllRural() {
        return ruralRepository.findAll();
    }

    @CrossOrigin(origins="http://localhost:8080")
    @PostMapping("/rural")
    public Rural createRural(@Valid @RequestBody Rural rural) {
        return ruralRepository.save(rural);
    }

    @CrossOrigin(origins="http://localhost:8080")
    @GetMapping("/rural/{id}")
    public Rural getRuralById(@PathVariable(value = "id") Long ruralId) {
        return ruralRepository.findById(ruralId)
                .orElseThrow(() -> new ResourceNotFoundException("Rural", "id", ruralId));
    }

    @CrossOrigin(origins="http://localhost:8080")
    @PutMapping("/rural/{id}")
    public Rural updateRural(@PathVariable(value = "id") Long ruralId,
                                           @Valid @RequestBody Rural ruralDetails) {

        Rural rural = ruralRepository.findById(ruralId)
                .orElseThrow(() -> new ResourceNotFoundException("Rural", "id", ruralId));

        rural.setYear(ruralDetails.getYear());
        

        Rural updatedRural = ruralRepository.save(rural);
        return updatedRural;
    }

    @CrossOrigin(origins="http://localhost:8080")
    @DeleteMapping("/rural/{id}")
    public ResponseEntity<?> deleteRural(@PathVariable(value = "id") Long ruralId) {
        Rural rural = ruralRepository.findById(ruralId)
                .orElseThrow(() -> new ResourceNotFoundException("Rural", "id", ruralId));

        ruralRepository.delete(rural);

        return ResponseEntity.ok().build();
    }
}
