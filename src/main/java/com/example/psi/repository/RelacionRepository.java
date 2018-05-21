package com.example.psi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.psi.persistance.Relacion;

@Repository
public interface RelacionRepository extends JpaRepository<Relacion, Long> {

}

