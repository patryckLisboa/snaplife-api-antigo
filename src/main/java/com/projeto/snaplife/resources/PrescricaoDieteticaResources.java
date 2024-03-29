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
import com.projeto.snaplife.domain.PrescricaoDietetica;
import com.projeto.snaplife.services.PrescricaoDieteticaService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/prescricoes")
public class PrescricaoDieteticaResources {
	@Autowired
	private PrescricaoDieteticaService prescricaoDieteticaService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<PrescricaoDietetica> findById(@PathVariable Long id){
		PrescricaoDietetica obj = prescricaoDieteticaService.findById(id);
		
		return ResponseEntity.ok().body(obj);
		//http://localhost:8080/prescricoes/{codigo da prescricao a ser encontrada}
	
	}
	
	@GetMapping
	public ResponseEntity<List<PrescricaoDietetica>> findAll(@RequestParam(value = "consulta", defaultValue = "0") Long id_con){
		List<PrescricaoDietetica> list = prescricaoDieteticaService.findAll(id_con);
				
		return ResponseEntity.ok().body(list);
		
		//localhost:8080/prescricoes?consulta=1
	}
	
	@PutMapping(value = "/{id}") // atualizar informação total
	public ResponseEntity<PrescricaoDietetica> update(@PathVariable Long id,@Valid @RequestBody PrescricaoDietetica obj){ //variavel e corpo da requisção, resposta
		PrescricaoDietetica newObj = prescricaoDieteticaService.update(id, obj);
		
		return ResponseEntity.ok().body(newObj);
		
		//http://localhost:8080/prescricoes/id e passando uma prescricao modificada
	}
	
	@PatchMapping(value = "/{id}") // atualizar informação parcial
	public ResponseEntity<PrescricaoDietetica> updatePath( @PathVariable Long id,@Valid @RequestBody PrescricaoDietetica obj){ //variavel e corpo da requisção, resposta
		System.out.println("entrei no path");
		PrescricaoDietetica newObj = prescricaoDieteticaService.update(id, obj);
		
		
		return ResponseEntity.ok().body(newObj);
		//http://localhost:8080/prescricoes/id e passando uma prescricao modificada
	}
	
	@PostMapping
	public ResponseEntity<PrescricaoDietetica> create( @RequestParam(value = "consulta" , defaultValue = "0") Long id_con,
			@Valid @RequestBody PrescricaoDietetica obj){ //defaul - se não passar valor, o valor é zero
			//valid precisa ser antes do requestbody
		
		PrescricaoDietetica newObj = prescricaoDieteticaService.create(id_con, obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/prescricoes/{id}").buildAndExpand(newObj.getCodigo()).toUri();//uri é o que vai editar do cabecalho da requisição
		return ResponseEntity.created(uri).build(); // vai passar a url onde se encontra o novo objeto salvo
		//localhost:8080/prescricoes?consulta=1
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		prescricaoDieteticaService.delete(id);
		// http://localhost:8080/prescricoes/4
		return ResponseEntity.noContent().build();
	}
}
