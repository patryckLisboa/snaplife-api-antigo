package com.projeto.snaplife.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.snaplife.domain.Nutricionista;

@Service
public class DBService {
	
	@Autowired
	private NutricionistaService nutricionistaRepository;
	
	public void instanciaBaseDeDados() {
		
		Nutricionista nutri1 = new Nutricionista("1234", "Patryck", "Patryck Divino Lisboa Pereira", "patryck-lisboa@hotmail.com");
		Nutricionista nutri2 = new Nutricionista("12345", "Itallo", "Itallo Danillo Amorin", "itallo@hotmail.com");


		nutricionistaRepository.saveAll(Arrays.asList(nutri1, nutri2));

	}

}
