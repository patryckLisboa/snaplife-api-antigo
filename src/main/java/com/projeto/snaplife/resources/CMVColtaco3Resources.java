package com.projeto.snaplife.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.projeto.snaplife.domain.CMVColtaco3;
import com.projeto.snaplife.services.CMVColtaco3Service;


@CrossOrigin("*")
@RestController
@RequestMapping(value = "/alimentos")
public class CMVColtaco3Resources {
	@Autowired
	private CMVColtaco3Service alimentoTacoService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<CMVColtaco3> findById(@PathVariable String id){
		CMVColtaco3 obj = alimentoTacoService.findById(id);
		
		return ResponseEntity.ok().body(obj);
		//http://localhost:8080/alimentos/{codigo do alimento a ser encontrado}
	
	}
	
	@GetMapping
	public ResponseEntity<List<CMVColtaco3>> findAll(){
		List<CMVColtaco3> list = alimentoTacoService.findAll();
		// http://localhost:8080/alimentos
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<CMVColtaco3> create(@Valid @RequestBody CMVColtaco3 obj){
		alimentoTacoService.create(obj);
		// http://localhost:8080/alimentos
		return ResponseEntity.ok().body(obj);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable String id){
		alimentoTacoService.delete(id);
		// http://localhost:8080/alimentos/4
		return ResponseEntity.noContent().build();
	}
}
