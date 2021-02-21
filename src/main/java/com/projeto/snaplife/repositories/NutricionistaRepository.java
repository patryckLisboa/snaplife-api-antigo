package com.projeto.snaplife.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.snaplife.domain.Nutricionista;

@Repository
public interface NutricionistaRepository extends JpaRepository<Nutricionista, Long>{
	
}
