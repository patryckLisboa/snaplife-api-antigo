package com.projeto.snaplife.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.projeto.snaplife.domain.Consulta;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long>{
	@Query("SELECT obj FROM Consulta obj WHERE obj.cliente.id = :id_cli ORDER BY dataConsulta")	
	List<Consulta> findAllByCliente(@Param(value = "id_cli") Long id_cli);
}
