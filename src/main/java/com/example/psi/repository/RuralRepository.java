package com.example.psi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.psi.persistance.Rural;

@Repository
public interface RuralRepository extends JpaRepository<Rural, Long> {

}


