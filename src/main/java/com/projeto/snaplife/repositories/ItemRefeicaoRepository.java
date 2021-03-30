package com.projeto.snaplife.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.projeto.snaplife.domain.ItemRefeicao;

@Repository
public interface ItemRefeicaoRepository extends JpaRepository<ItemRefeicao, Long> {
	@Query("SELECT obj FROM ItemRefeicao obj WHERE obj.refeicao.id = :id_ref ORDER BY codigo")	
	List<ItemRefeicao> findAllByRefeicao(@Param(value = "id_ref") Long id_ref);
}
