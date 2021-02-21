package com.projeto.snaplife.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.projeto.snaplife.domain.Nutricionista;
import com.projeto.snaplife.dtos.NutricionistaDTO;
import com.projeto.snaplife.repositories.NutricionistaRepository;
import com.projeto.snaplife.services.exeptions.ObjectNotFoundException;


@Service
public class NutricionistaService {
	@Autowired
	private NutricionistaRepository nutricionistaRepository;

	public Nutricionista findById(Long id) {
		Optional<Nutricionista> obj = nutricionistaRepository.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! id: " + id + ", tipo:" + Nutricionista.class.getName()));

	}

	public List<Nutricionista> findAll() {
		return nutricionistaRepository.findAll();
	}

	public Nutricionista create(Nutricionista obj) {
		obj.setCodigo(null);

		return nutricionistaRepository.save(obj);
	}

	public Nutricionista update(Long id, NutricionistaDTO objDTO) {
		Nutricionista obj = findById(id);

		obj.setCertificados(objDTO.getCertificados());
		
		return nutricionistaRepository.save(obj);
	}

	public void delete(Long id) {
		findById(id);

		try {
			nutricionistaRepository.deleteById(id);
		} catch (DataIntegrityViolationException e) { // do spring
			throw new DataIntegrityViolationException(
					"Categoria não pode ser deletado. Pois possui livros associados");
		}

	}

}
