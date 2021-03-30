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

import com.projeto.snaplife.domain.ItemRefeicao;
import com.projeto.snaplife.services.ItemRefeicaoService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/itens")
public class ItemRefeicaoResources {
	@Autowired
	private ItemRefeicaoService itemRefeicaoService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ItemRefeicao> findById(@PathVariable Long id){
		ItemRefeicao obj = itemRefeicaoService.findById(id);
		
		return ResponseEntity.ok().body(obj);
		//http://localhost:8080/itens/{codigo do item a ser encontrada}
	
	}
	
	@GetMapping
	public ResponseEntity<List<ItemRefeicao>> findAll(@RequestParam(value = "refeicao", defaultValue = "0") Long id_ref){
		List<ItemRefeicao> list = itemRefeicaoService.findAll(id_ref);
				
		return ResponseEntity.ok().body(list);
		
		//localhost:8080/itens?refeicao=1
	}
	
	@PutMapping(value = "/{id}") // atualizar informação total
	public ResponseEntity<ItemRefeicao> update(@PathVariable Long id,@Valid @RequestBody ItemRefeicao obj){ //variavel e corpo da requisção, resposta
		ItemRefeicao newObj = itemRefeicaoService.update(id, obj);
		
		return ResponseEntity.ok().body(newObj);
		
		//http://localhost:8080/itens/id e passando um item modificado
	}
	
	@PatchMapping(value = "/{id}") // atualizar informação parcial
	public ResponseEntity<ItemRefeicao> updatePath( @PathVariable Long id,@Valid @RequestBody ItemRefeicao obj){ //variavel e corpo da requisção, resposta
		System.out.println("entrei no path");
		ItemRefeicao newObj = itemRefeicaoService.update(id, obj);
		
		
		return ResponseEntity.ok().body(newObj);
		//http://localhost:8080/itens/id e passando um item modificado
	}
	
	@PostMapping
	public ResponseEntity<ItemRefeicao> create( @RequestParam(value = "refeicao" , defaultValue = "0") Long id_ref,
			@Valid @RequestBody ItemRefeicao obj){ //defaul - se não passar valor, o valor é zero
			//valid precisa ser antes do requestbody
		
		ItemRefeicao newObj = itemRefeicaoService.create(id_ref, obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/itens/{id}").buildAndExpand(newObj.getCodigo()).toUri();//uri é o que vai editar do cabecalho da requisição
		return ResponseEntity.created(uri).build(); // vai passar a url onde se encontra o novo objeto salvo
		//localhost:8080/itens?refeicao=1
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		itemRefeicaoService.delete(id);
		// http://localhost:8080/itens/4
		return ResponseEntity.noContent().build();
	}
}
