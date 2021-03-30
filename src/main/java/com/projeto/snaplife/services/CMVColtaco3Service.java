package com.projeto.snaplife.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.snaplife.domain.CMVColtaco3;


import com.projeto.snaplife.repositories.AlimentoTacoRepository;

import com.projeto.snaplife.services.exeptions.ObjectNotFoundException;

@Service
public class CMVColtaco3Service {
	@Autowired
	private AlimentoTacoRepository alimentoTacoRepository;

	public CMVColtaco3 findById(String id) {
		Optional<CMVColtaco3> obj = alimentoTacoRepository.findById(id); // optional é pq ele pode receber nulo

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado, id:" + id + ", tipo:" + CMVColtaco3.class.getName()));
	}

	public List<CMVColtaco3> findAll() {

		return alimentoTacoRepository.findAll();
	}


	public CMVColtaco3 create(CMVColtaco3 obj) {
		int tamanho = findAll().size();
		tamanho++;
		obj.setNumeroAlimento(Integer.toString(tamanho));

		return alimentoTacoRepository.save(obj);
	}

	public void delete(String id) {
		CMVColtaco3 obj = findById(id); // validação para ver se obj existe
		alimentoTacoRepository.delete(obj);
	}
	

}
