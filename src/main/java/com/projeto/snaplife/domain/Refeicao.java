package com.projeto.snaplife.domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.Length;

@SuppressWarnings("serial")
@Entity
public class Refeicao extends GenericDomain {
	
	@Length(min = 0, max = 50, message = "Campo tipoRefeicao precisa ter no máximo 50 caracteres")
	@Column(length = 50, nullable = true)
	private String tipoRefeicao;
	
	@Length(min = 0, max = 50, message = "Campo horario precisa ter no máximo 50 caracteres")
	@Column(length = 50, nullable = true)
	private String horario;
	
	@ManyToOne
	@JoinColumn(nullable = true) 
	private PrescricaoDietetica prescricaoDietetica;

	public Refeicao(String tipoRefeicao, String horario, PrescricaoDietetica prescricaoDietetica) {
		super();
		this.tipoRefeicao = tipoRefeicao;
		this.horario = horario;
		this.prescricaoDietetica = prescricaoDietetica;
	}

	public Refeicao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTipoRefeicao() {
		return tipoRefeicao;
	}

	public void setTipoRefeicao(String tipoRefeicao) {
		this.tipoRefeicao = tipoRefeicao;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public PrescricaoDietetica getPrescricaoDietetica() {
		return prescricaoDietetica;
	}

	public void setPrescricaoDietetica(PrescricaoDietetica prescricaoDietetica) {
		this.prescricaoDietetica = prescricaoDietetica;
	}

}
