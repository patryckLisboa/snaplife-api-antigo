package com.projeto.snaplife.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.snaplife.domain.Cliente;
import com.projeto.snaplife.domain.Consulta;
import com.projeto.snaplife.repositories.ConsultaRepository;
import com.projeto.snaplife.services.exeptions.ObjectNotFoundException;

@Service
public class ConsultaService {
	@Autowired
	private ConsultaRepository consultaRepository;
	
	@Autowired
	private ClienteService clienteService;

	public Consulta findById(Long id) {
		Optional<Consulta> obj = consultaRepository.findById(id); // optional é pq ele pode receber nulo

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado, id:" + id + ", tipo:" + Cliente.class.getName()));
	}

	public List<Consulta> findAll(Long id_cli) {
		clienteService.findById(id_cli);

		return consultaRepository.findAllByCliente(id_cli);
	}

	public Consulta update(Long id, Consulta obj) {
		System.out.println(obj.toString());
		Consulta newObj = findById(id);
		updateData(newObj, obj);
		
		System.out.println(newObj.toString());
		return consultaRepository.save(newObj);
	}

	private void updateData(Consulta newObj, Consulta obj) {
		newObj.setAltura(obj.getAltura());
		newObj.setCliente(obj.getCliente());
		newObj.setDataConsulta(obj.getDataConsulta());
		newObj.setDiagnostico(obj.getDiagnostico());
		newObj.setEstadoCorporal(obj.getEstadoCorporal());
		newObj.setFatorAtividade(obj.getFatorAtividade());
		newObj.setGastoEnergTot(obj.getGastoEnergTot());
		newObj.setHistoricoSocialFamiliar(obj.getHistoricoSocialFamiliar());
		newObj.setIdade(obj.getIdade());
		newObj.setPeso(obj.getPeso());
		newObj.setSexo(obj.getSexo());
		newObj.setTaxaMB(obj.getTaxaMB());

	}

	public Consulta create(Long id_cli, Consulta obj) {
		obj.setCodigo(null);
		Cliente cli = clienteService.findById(id_cli);
		
		obj.setCliente(cli);
		return consultaRepository.save(obj);
	}

	public void delete(Long id) {
		Consulta obj = findById(id); // validação para ver se obj existe
		consultaRepository.delete(obj);
	}

}
