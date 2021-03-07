package com.projeto.snaplife.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.snaplife.domain.Cliente;
import com.projeto.snaplife.domain.Nutricionista;
import com.projeto.snaplife.repositories.ClienteRepository;
import com.projeto.snaplife.services.exeptions.ObjectNotFoundException;


@Service
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private NutricionistaService nutricionistaService;

	public Cliente findById(Long id) {
		Optional<Cliente> obj = clienteRepository.findById(id); // optional é pq ele pode receber nulo

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado, id:" + id + ", tipo:" + Cliente.class.getName()));
	}

	public List<Cliente> findAll(Long id_nut) {
		nutricionistaService.findById(id_nut);

		return clienteRepository.findAllByNutricionista(id_nut);
	}

	public Cliente update(Long id, Cliente obj) {
		System.out.println(obj.toString());
		Cliente newObj = findById(id);
		updateData(newObj, obj);
		
		System.out.println(newObj.toString());
		return clienteRepository.save(newObj);
	}

	private void updateData(Cliente newObj, Cliente obj) {
		newObj.setAtivo(obj.getAtivo());
		newObj.setCelular(obj.getCelular());
		newObj.setDataNascimento(obj.getDataNascimento());
		newObj.setEmail(obj.getEmail());
		newObj.setInfoAdicionais(obj.getInfoAdicionais());
		newObj.setNomeCompleto(obj.getNomeCompleto());
		newObj.setNutricionista(obj.getNutricionista());
		newObj.setSenha(obj.getSenha());
		newObj.setTelefone(obj.getTelefone());
		newObj.setUsuario(obj.getUsuario());

	}

	public Cliente create(Long id_nut, Cliente obj) {
		obj.setCodigo(null);
		Nutricionista nut = nutricionistaService.findById(id_nut);
		
		obj.setNutricionista(nut);
		return clienteRepository.save(obj);
	}

	public void delete(Long id) {
		Cliente obj = findById(id); // validação para ver se obj existe
		clienteRepository.delete(obj);
	}

}
