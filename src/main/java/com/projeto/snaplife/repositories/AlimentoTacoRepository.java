package com.projeto.snaplife.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.snaplife.domain.CMVColtaco3;


@Repository
public interface AlimentoTacoRepository extends JpaRepository<CMVColtaco3, String>{
	
}
