package com.projeto.snaplife.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.snaplife.domain.Nutricionista;
import com.projeto.snaplife.repositories.NutricionistaRepository;

@Service
public class DBService {
	
	@Autowired
	private NutricionistaRepository nutricionistaRepository;
	
	public void instanciaBaseDeDados() {
		
		Nutricionista nutri1 = new Nutricionista("123456", "Patryck", "Patryck Divino Lisboa Pereira", "patryck-lisboa@hotmail.com");
		Nutricionista nutri2 = new Nutricionista("1234567", "Itallo", "Itallo Danillo Amorin", "itallo@hotmail.com");
		nutri1.setCertificados("nutrição esportiva");
		nutri2.setCertificados("nutrição escolar");
	
		nutricionistaRepository.saveAll(Arrays.asList(nutri1, nutri2));
		System.out.println("entrei no instancia");
	}

}
