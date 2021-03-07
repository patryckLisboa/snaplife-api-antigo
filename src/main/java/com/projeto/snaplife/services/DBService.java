package com.projeto.snaplife.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.snaplife.domain.Cliente;
import com.projeto.snaplife.domain.Nutricionista;
import com.projeto.snaplife.repositories.ClienteRepository;
import com.projeto.snaplife.repositories.NutricionistaRepository;

@Service
public class DBService {
	
	@Autowired
	private NutricionistaRepository nutricionistaRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public void instanciaBaseDeDados() throws ParseException {
		
		Nutricionista nutri1 = new Nutricionista("123456", "Patryck", "Patryck Divino Lisboa Pereira", "patryck-lisboa@hotmail.com");
		Nutricionista nutri2 = new Nutricionista("1234567", "Itallo", "Itallo Danillo Amorin", "itallo@hotmail.com");
		nutri1.setCertificados("nutrição esportiva");
		nutri2.setCertificados("nutrição escolar");
		
		Cliente cli1 = new Cliente("1234511", "Pedro", "nome completo pedro", "cliente01@hotmail.com");
		Cliente cli2 = new Cliente("1234510", "Paulo", "nome completo paulo", "cliente02@hotmail.com");
		
		cli1.setAtivo(true);
		cli1.setDataNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2000"));
		cli1.setInfoAdicionais("Cliente amigo do nilton");
		cli1.setNutricionista(nutri1);
		
		cli2.setAtivo(false);
		cli2.setDataNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2002"));
		cli2.setInfoAdicionais("Endereço:....");
		cli2.setNutricionista(nutri2);
		
		nutricionistaRepository.saveAll(Arrays.asList(nutri1, nutri2));
		clienteRepository.saveAll(Arrays.asList(cli1, cli2));
		
		System.out.println("entrei no instanciar");
	}

}
