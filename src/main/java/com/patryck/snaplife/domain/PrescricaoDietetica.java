package com.patryck.snaplife.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@SuppressWarnings("serial")
@Entity
public class PrescricaoDietetica extends GenericDomain{
	
	private char objetivo;
	private int gordura;
	private int carboidrato;
	private int proteina;
	private char anotacao;
	private int valorEnergetico;
	private int somaNutrientes;
	private int calorias;
	
	@Column(nullable = false)
	@ManyToMany
	private Refeicao refeicao;

	public char getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(char objetivo) {
		this.objetivo = objetivo;
	}

	public int getGordura() {
		return gordura;
	}

	public void setGordura(int gordura) {
		this.gordura = gordura;
	}

	public int getCarboidrato() {
		return carboidrato;
	}

	public void setCarboidrato(int carboidrato) {
		this.carboidrato = carboidrato;
	}

	public int getProteina() {
		return proteina;
	}

	public void setProteina(int proteina) {
		this.proteina = proteina;
	}

	public char getAnotacao() {
		return anotacao;
	}

	public void setAnotacao(char anotacao) {
		this.anotacao = anotacao;
	}

	public int getValorEnergetico() {
		return valorEnergetico;
	}

	public void setValorEnergetico(int valorEnergetico) {
		this.valorEnergetico = valorEnergetico;
	}

	public int getSomaNutrientes() {
		return somaNutrientes;
	}

	public void setSomaNutrientes(int somaNutrientes) {
		this.somaNutrientes = somaNutrientes;
	}

	public int getCalorias() {
		return calorias;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}

	public Refeicao getRefeicao() {
		return refeicao;
	}

	public void setRefeicao(Refeicao refeicao) {
		this.refeicao = refeicao;
	}

}
