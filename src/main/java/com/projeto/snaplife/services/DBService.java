package com.projeto.snaplife.services;


import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.snaplife.domain.CMVColtaco3;
import com.projeto.snaplife.domain.Cliente;
import com.projeto.snaplife.domain.Consulta;
import com.projeto.snaplife.domain.ItemRefeicao;
import com.projeto.snaplife.domain.Nutricionista;
import com.projeto.snaplife.domain.PrescricaoDietetica;
import com.projeto.snaplife.domain.Refeicao;
import com.projeto.snaplife.repositories.ClienteRepository;
import com.projeto.snaplife.repositories.ConsultaRepository;
import com.projeto.snaplife.repositories.ItemRefeicaoRepository;
import com.projeto.snaplife.repositories.NutricionistaRepository;


@Service
public class DBService {

	@Autowired
	private NutricionistaRepository nutricionistaRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ConsultaRepository consultaRepository;
	
	@Autowired
	private ConsultaService consultaService;
	
	@Autowired
	private PrescricaoDieteticaService prescricaoDieteticaService;
	
	@Autowired
	private RefeicaoService refeicaoService;
	
	@Autowired
	private ItemRefeicaoRepository itemRefeicaoRepository;
	
	@Autowired
	private CMVColtaco3Service tacoService;
	
	@Autowired
    private NativeScriptService nativeScriptService;

	public void instanciaBaseDeDados() throws ParseException {

		Nutricionista nutri1 = new Nutricionista("123456", "Patryck", "Patryck Divino Lisboa Pereira",
				"patryck-lisboa@hotmail.com");
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

		Calendar c = Calendar.getInstance();
		System.out.println("Data e Hora atual: " + c.getTime());

		Consulta consult1 = new Consulta(null, "Pessoa com tendencia a obseidade...", 
				new BigDecimal("90.0"),
				new BigDecimal("1.7"), null, 'm', "excesso de gordura", 
				new BigDecimal("1.2"),
				new BigDecimal("2050.00"), "Individo necessita perder peso",null,
				cli1);
		Consulta consult2 = new Consulta(c.getTime(), "Pessoa com tendencia a magresa...", 
				new BigDecimal("50.0"),
				new BigDecimal("1.7"), 18, 'm', "falta de peso, má postura devida a falta de massa muscular",
				new BigDecimal("2000.50"),
				new BigDecimal("2000.50"), "Individo necessita perder peso", new BigDecimal("4001.00"),
				cli2);
		
		PrescricaoDietetica prescricao1 = new PrescricaoDietetica("Perda De Peso", new BigDecimal("100"),
				new BigDecimal("100"), new BigDecimal("100"), 
				"não gosta de comer brocoles", new BigDecimal("1800.00"), null);
		PrescricaoDietetica prescricao2 = new PrescricaoDietetica("Perda De Peso", new BigDecimal("100"),
				new BigDecimal("100"), new BigDecimal("100"), 
				"não gosta de comer brocoes e tem alergia a camarão", new BigDecimal("1900.00"), null);
		
		Refeicao refeicao1 = new Refeicao("lanche", "08:00", null);
		Refeicao refeicao2 = new Refeicao("almoço", "12:00", null);
		
		Path caminho = Paths.get("documentos//alimentos.txt");
		
		try {
			byte[] texto = Files.readAllBytes(caminho);
			String leitura = new String(texto);
			nativeScriptService.execute(leitura); 
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
		CMVColtaco3 alimento1 = tacoService.findById("1");
		CMVColtaco3 alimento2 = tacoService.findById("2");
		CMVColtaco3 alimento3 = tacoService.findById("3");
		
		ItemRefeicao item1 = new ItemRefeicao(1,refeicao2,alimento1);
		ItemRefeicao item2 = new ItemRefeicao(2,refeicao2,alimento2);
		ItemRefeicao item3 = new ItemRefeicao(4,refeicao2,alimento3);
		
		nutricionistaRepository.saveAll(Arrays.asList(nutri1, nutri2));
		clienteRepository.saveAll(Arrays.asList(cli1, cli2));
		consultaRepository.saveAll(Arrays.asList(consult2));
		consultaService.create(cli1.getCodigo(), consult1);
		prescricaoDieteticaService.create(consult1.getCodigo(), prescricao1);
		prescricaoDieteticaService.create(consult1.getCodigo(), prescricao2);
		refeicaoService.create(prescricao2.getCodigo(), refeicao1);
		refeicaoService.create(prescricao2.getCodigo(), refeicao2);
		itemRefeicaoRepository.saveAll(Arrays.asList(item1, item2, item3));

	
		
		System.out.println("entrei no instanciar");
	}

}
