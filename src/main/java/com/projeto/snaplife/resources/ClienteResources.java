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

import com.projeto.snaplife.domain.Cliente;
import com.projeto.snaplife.services.ClienteService;


@CrossOrigin("*")
@RestController
@RequestMapping(value = "/clientes")
public class ClienteResources {
	
	@Autowired
	private ClienteService  clienteService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Cliente> findById(@PathVariable Long id){
		Cliente obj = clienteService.findById(id);
		
		return ResponseEntity.ok().body(obj);
		//http://localhost:8080/clientes/{codigo do livro a ser encontrado}
	
	}
	
	@GetMapping
	public ResponseEntity<List<Cliente>> findAll(@RequestParam(value = "nutricionista", defaultValue = "0") Long id_nut){
		List<Cliente> list = clienteService.findAll(id_nut);
				
		return ResponseEntity.ok().body(list);
		
		//localhost:8080/clientes?nutricionista=1
	}
	
	@PutMapping(value = "/{id}") // atualizar informação total
	public ResponseEntity<Cliente> update(@PathVariable Long id,@Valid @RequestBody Cliente obj){ //variavel e corpo da requisção, resposta
		Cliente newObj = clienteService.update(id, obj);
		
		return ResponseEntity.ok().body(newObj);
		
		//http://localhost:8080/clientes/id e passando um cliente modificado
	}
	
	@PatchMapping(value = "/{id}") // atualizar informação parcial
	public ResponseEntity<Cliente> updatePath( @PathVariable Long id,@Valid @RequestBody Cliente obj){ //variavel e corpo da requisção, resposta
		System.out.println("entrei no path");
		Cliente newObj = clienteService.update(id, obj);
		
		
		return ResponseEntity.ok().body(newObj);
		//http://localhost:8080/clientes/id e passando um livro modificado
	}
	
	@PostMapping
	public ResponseEntity<Cliente> create( @RequestParam(value = "nutricionista" , defaultValue = "0") Long id_nut,
			@Valid @RequestBody Cliente obj){ //defaul - se não passar valor, o valor é zero
			//valid precisa ser antes do requestbody
		
		Cliente newObj = clienteService.create(id_nut, obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/clientes/{id}").buildAndExpand(newObj.getCodigo()).toUri();//uri é o que vai editar do cabecalho da requisição
		return ResponseEntity.created(uri).build(); // vai passar a url onde se encontra o novo livro salvo
		//http://localhost:8080/clientes?nutricionista=3  e passando um livro a ser incluido
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		clienteService.delete(id);
		// http://localhost:8080/clientes/4
		return ResponseEntity.noContent().build();
	}
}
