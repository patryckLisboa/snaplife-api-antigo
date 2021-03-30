package com.projeto.snaplife.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.snaplife.domain.ItemRefeicao;
import com.projeto.snaplife.domain.Refeicao;
import com.projeto.snaplife.services.exeptions.ObjectNotFoundException;
import com.projeto.snaplife.repositories.ItemRefeicaoRepository;

@Service
public class ItemRefeicaoService {
	@Autowired
	private ItemRefeicaoRepository itemRefeicaoRepository;
	
	@Autowired
	private RefeicaoService refeicaoService;

	public ItemRefeicao findById(Long id) {
		Optional<ItemRefeicao> obj = itemRefeicaoRepository.findById(id); // optional é pq ele pode receber nulo

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado, id:" + id + ", tipo:" + ItemRefeicao.class.getName()));
	}

	public List<ItemRefeicao> findAll(Long id_ref) {
		refeicaoService.findById(id_ref);

		return itemRefeicaoRepository.findAllByRefeicao(id_ref);
	}

	public ItemRefeicao update(Long id, ItemRefeicao obj) {
		System.out.println(obj.toString());
		ItemRefeicao newObj = findById(id);
		updateData(newObj, obj);
		
		System.out.println(newObj.toString());
		return itemRefeicaoRepository.save(newObj);
	}

	private void updateData(ItemRefeicao newObj, ItemRefeicao obj) {
		newObj.setQuantidade(obj.getQuantidade());
		newObj.setRefeicao(obj.getRefeicao());
		newObj.setAlimentoTaco(obj.getAlimentoTaco());
	}

	public ItemRefeicao create(Long id_ref, ItemRefeicao obj) {
		obj.setCodigo(null);
		Refeicao ref = refeicaoService.findById(id_ref);
		
		obj.setRefeicao(ref);

		return itemRefeicaoRepository.save(obj);
	}

	public void delete(Long id) {
		ItemRefeicao obj = findById(id); // validação para ver se obj existe
		itemRefeicaoRepository.delete(obj);
	}

}
