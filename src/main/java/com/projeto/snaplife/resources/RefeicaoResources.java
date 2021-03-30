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


import com.projeto.snaplife.domain.Refeicao;

import com.projeto.snaplife.services.RefeicaoService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/refeicoes")
public class RefeicaoResources {
	@Autowired
	private RefeicaoService refeicaoService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Refeicao> findById(@PathVariable Long id){
		Refeicao obj = refeicaoService.findById(id);
		
		return ResponseEntity.ok().body(obj);
		//http://localhost:8080/refeicoes/{codigo da refeicao a ser encontrada}
	
	}
	
	@GetMapping
	public ResponseEntity<List<Refeicao>> findAll(@RequestParam(value = "prescricao", defaultValue = "0") Long id_pres){
		List<Refeicao> list = refeicaoService.findAll(id_pres);
				
		return ResponseEntity.ok().body(list);
		
		//localhost:8080/refeicoes?prescricao=1
	}
	
	@PutMapping(value = "/{id}") // atualizar informação total
	public ResponseEntity<Refeicao> update(@PathVariable Long id,@Valid @RequestBody Refeicao obj){ //variavel e corpo da requisção, resposta
		Refeicao newObj = refeicaoService.update(id, obj);
		
		return ResponseEntity.ok().body(newObj);
		
		//http://localhost:8080/refeicoes/id e passando uma refeicao modificada
	}
	
	@PatchMapping(value = "/{id}") // atualizar informação parcial
	public ResponseEntity<Refeicao> updatePath( @PathVariable Long id,@Valid @RequestBody Refeicao obj){ //variavel e corpo da requisção, resposta
		System.out.println("entrei no path");
		Refeicao newObj = refeicaoService.update(id, obj);
		
		
		return ResponseEntity.ok().body(newObj);
		//http://localhost:8080/refeicoes/id e passando uma refeicao modificada
	}
	
	@PostMapping
	public ResponseEntity<Refeicao> create( @RequestParam(value = "prescricao" , defaultValue = "0") Long id_pres,
			@Valid @RequestBody Refeicao obj){ //defaul - se não passar valor, o valor é zero
			//valid precisa ser antes do requestbody
		
		Refeicao newObj = refeicaoService.create(id_pres, obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/refeicoes/{id}").buildAndExpand(newObj.getCodigo()).toUri();//uri é o que vai editar do cabecalho da requisição
		return ResponseEntity.created(uri).build(); // vai passar a url onde se encontra o novo objeto salvo
		//localhost:8080/refeicoes?prescricao=1
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		refeicaoService.delete(id);
		// http://localhost:8080/refeicoes/4
		return ResponseEntity.noContent().build();
	}
}
