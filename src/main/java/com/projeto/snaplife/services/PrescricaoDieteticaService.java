package com.projeto.snaplife.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.snaplife.domain.Consulta;
import com.projeto.snaplife.domain.PrescricaoDietetica;
import com.projeto.snaplife.repositories.PrescricaoDieteticaRepository;
import com.projeto.snaplife.services.exeptions.ObjectNotFoundException;

@Service
public class PrescricaoDieteticaService {
	@Autowired
	private PrescricaoDieteticaRepository prescricaoDieteticaRepository;
	
	@Autowired
	private ConsultaService consultaService;

	public PrescricaoDietetica findById(Long id) {
		Optional<PrescricaoDietetica> obj = prescricaoDieteticaRepository.findById(id); // optional é pq ele pode receber nulo

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado, id:" + id + ", tipo:" + PrescricaoDietetica.class.getName()));
	}

	public List<PrescricaoDietetica> findAll(Long id_con) {
		consultaService.findById(id_con);

		return prescricaoDieteticaRepository.findAllByConsulta(id_con);
	}

	public PrescricaoDietetica update(Long id, PrescricaoDietetica obj) {
		System.out.println(obj.toString());
		PrescricaoDietetica newObj = findById(id);
		updateData(newObj, obj);
		
		System.out.println(newObj.toString());
		return prescricaoDieteticaRepository.save(newObj);
	}

	private void updateData(PrescricaoDietetica newObj, PrescricaoDietetica obj) {
		newObj.setAnotacao(obj.getAnotacao());
		newObj.setCarboidratosOfertados(obj.getCarboidratosOfertados());
		newObj.setConsulta(obj.getConsulta());
		newObj.setGorduraOfertada(obj.getGorduraOfertada());
		newObj.setObjetivo(obj.getObjetivo());
		newObj.setProteinasOfertadas(obj.getProteinasOfertadas());
		newObj.setVetValorEnergOfertado(obj.getVetValorEnergOfertado());

	}

	public PrescricaoDietetica create(Long id_con, PrescricaoDietetica obj) {
		obj.setCodigo(null);
		Consulta con = consultaService.findById(id_con);
		
		obj.setConsulta(con);

		return prescricaoDieteticaRepository.save(obj);
	}

	public void delete(Long id) {
		PrescricaoDietetica obj = findById(id); // validação para ver se obj existe
		prescricaoDieteticaRepository.delete(obj);
	}

}
