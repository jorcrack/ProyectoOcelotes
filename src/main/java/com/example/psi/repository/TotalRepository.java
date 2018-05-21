package com.example.psi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.psi.persistance.Total;

@Repository
public interface TotalRepository extends JpaRepository<Total, Long>{

}
