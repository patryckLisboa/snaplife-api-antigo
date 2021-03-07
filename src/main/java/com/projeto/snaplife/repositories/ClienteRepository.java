package com.projeto.snaplife.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.projeto.snaplife.domain.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	@Query("SELECT obj FROM Cliente obj WHERE obj.nutricionista.id = :id_nut ORDER BY nomeCompleto")	
	List<Cliente> findAllByNutricionista(@Param(value = "id_nut") Long id_nut);
}
