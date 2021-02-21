package com.projeto.snaplife.resources;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.projeto.snaplife.domain.Nutricionista;
import com.projeto.snaplife.dtos.NutricionistaDTO;
import com.projeto.snaplife.services.NutricionistaService;



@CrossOrigin("*")
@RestController
@RequestMapping(value = "/nutricionistas")
public class NutricionistaResources {
	@Autowired
	private NutricionistaService nutricionistaSerice;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Nutricionista> findById(@PathVariable Long id) {
		Nutricionista obj = nutricionistaSerice.findById(id);

		return ResponseEntity.ok().body(obj);
	}

	@GetMapping
	public ResponseEntity<List<Nutricionista>> findAll() {
		List<Nutricionista> list = nutricionistaSerice.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping	
	public ResponseEntity<Nutricionista> create(@Valid @RequestBody Nutricionista obj) { // valid vai validar se está atendendo aos requisitos do domain
		obj = nutricionistaSerice.create(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getCodigo()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<NutricionistaDTO> update(@PathVariable Long id,@Valid @RequestBody NutricionistaDTO objDTO){
		Nutricionista newObj = nutricionistaSerice.update(id, objDTO);
		
		return ResponseEntity.ok(new NutricionistaDTO(newObj));
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		nutricionistaSerice.delete(id);
		return ResponseEntity.noContent().build();
	}

}
