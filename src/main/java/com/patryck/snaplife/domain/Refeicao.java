package com.patryck.snaplife.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;


@SuppressWarnings("serial")
@Entity
public class Refeicao extends GenericDomain{
	
	private char tipoRefeicao;
	
	private Date horario;

	@Column(nullable = false)
	@ManyToMany
	private PrescricaoDietetica prescricaoDietetica;
	
	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public PrescricaoDietetica getPrescricaoDietetica() {
		return prescricaoDietetica;
	}

	public void setPrescricaoDietetica(PrescricaoDietetica prescricaoDietetica) {
		this.prescricaoDietetica = prescricaoDietetica;
	}


	
	public char getTipoRefeicao() {
		return tipoRefeicao;
	}

	public void setTipoRefeicao(char tipoRefeicao) {
		this.tipoRefeicao = tipoRefeicao;
	}




}
