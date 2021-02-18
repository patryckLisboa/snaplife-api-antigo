package com.patryck.snaplife.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@SuppressWarnings("serial")
@Entity
public class Alimento extends GenericDomain{
	
	private char nomeAlimento;
	private char tipoAlimento;
	
	@Column(nullable = false)
	@ManyToMany
	private ItemRefeicao itemRefeicao;
	
	public char getNomeAlimento() {
		return nomeAlimento;
	}

	public void setNomeAlimento(char nomeAlimento) {
		this.nomeAlimento = nomeAlimento;
	}

	public char getTipoAlimento() {
		return tipoAlimento;
	}

	public void setTipoAlimento(char tipoAlimento) {
		this.tipoAlimento = tipoAlimento;
	}

	public ItemRefeicao getItemRefeicao() {
		return itemRefeicao;
	}

	public void setItemRefeicao(ItemRefeicao itemRefeicao) {
		this.itemRefeicao = itemRefeicao;
	}

	public AlimentoTaco getAlimentoTaco() {
		return alimentoTaco;
	}

	public void setAlimentoTaco(AlimentoTaco alimentoTaco) {
		this.alimentoTaco = alimentoTaco;
	}

	@Column(nullable = false)
	@ManyToMany
	private AlimentoTaco alimentoTaco;

}
