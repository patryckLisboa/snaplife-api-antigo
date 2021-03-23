package com.projeto.snaplife.resources;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.projeto.snaplife.domain.Consulta;
import com.projeto.snaplife.services.ConsultaService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/consultas")
public class ConsultaResources {
	
	@Autowired
	private ConsultaService  consultaService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Consulta> findById(@PathVariable Long id){
		Consulta obj = consultaService.findById(id);
		
		return ResponseEntity.ok().body(obj);
		//http://localhost:8080/consultas/{codigo da consulta a ser encontrada}
	
	}
	
	@GetMapping
	public ResponseEntity<List<Consulta>> findAll(@RequestParam(value = "cliente", defaultValue = "0") Long id_cli){
		List<Consulta> list = consultaService.findAll(id_cli);
				
		return ResponseEntity.ok().body(list);
		
		//localhost:8080/consultas?cliente=1
	}
	
	@PutMapping(value = "/{id}") // atualizar informação total
	public ResponseEntity<Consulta> update(@PathVariable Long id,@Valid @RequestBody Consulta obj){ //variavel e corpo da requisção, resposta
		Consulta newObj = consultaService.update(id, obj);
		
		return ResponseEntity.ok().body(newObj);
		
		//http://localhost:8080/consultas/id e passando uma consulta modificada
	}
	
	@PatchMapping(value = "/{id}") // atualizar informação parcial
	public ResponseEntity<Consulta> updatePath( @PathVariable Long id,@Valid @RequestBody Consulta obj){ //variavel e corpo da requisção, resposta
		System.out.println("entrei no path");
		Consulta newObj = consultaService.update(id, obj);
		
		
		return ResponseEntity.ok().body(newObj);
		//http://localhost:8080/consultas/id e passando uma consulta modificadoa
	}
	
	@PostMapping
	public ResponseEntity<Consulta> create( @RequestParam(value = "cliente" , defaultValue = "0") Long id_cli,
			@Valid @RequestBody Consulta obj){ //defaul - se não passar valor, o valor é zero
			//valid precisa ser antes do requestbody
		
		Consulta newObj = consultaService.create(id_cli, obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/consultas/{id}").buildAndExpand(newObj.getCodigo()).toUri();//uri é o que vai editar do cabecalho da requisição
		return ResponseEntity.created(uri).build(); // vai passar a url onde se encontra o novo objeto salvo
		//localhost:8080/consultas?cliente=1
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		consultaService.delete(id);
		// http://localhost:8080/consultas/4
		return ResponseEntity.noContent().build();
	}
}
