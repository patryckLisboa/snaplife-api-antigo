package com.projeto.snaplife.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.projeto.snaplife.domain.PrescricaoDietetica;

@Repository
public interface PrescricaoDieteticaRepository extends JpaRepository<PrescricaoDietetica, Long>{
	@Query("SELECT obj FROM PrescricaoDietetica obj WHERE obj.consulta.id = :id_con ORDER BY codigo")	
	List<PrescricaoDietetica> findAllByConsulta(@Param(value = "id_con") Long id_con);
}
