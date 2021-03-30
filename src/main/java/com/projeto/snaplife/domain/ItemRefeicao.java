package com.projeto.snaplife.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class ItemRefeicao extends GenericDomain{
	
	public CMVColtaco3 getAlimentoTaco() {
		return alimentoTaco;
	}

	public void setAlimentoTaco(CMVColtaco3 alimentoTaco) {
		this.alimentoTaco = alimentoTaco;
	}

	@Column(nullable = false)
	private Integer quantidade;
	
	@ManyToOne
	@JoinColumn(nullable = true) 
	private Refeicao refeicao;
	
	@ManyToOne
	@JoinColumn(nullable = true) 
	private CMVColtaco3 alimentoTaco;

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Refeicao getRefeicao() {
		return refeicao;
	}

	public void setRefeicao(Refeicao refeicao) {
		this.refeicao = refeicao;
	}



	public ItemRefeicao(Integer quantidade, Refeicao refeicao, CMVColtaco3 alimentoTaco) {
		super();
		this.quantidade = quantidade;
		this.refeicao = refeicao;
		this.alimentoTaco = alimentoTaco;
	}

	public ItemRefeicao() {
		super();
	
	}

}
