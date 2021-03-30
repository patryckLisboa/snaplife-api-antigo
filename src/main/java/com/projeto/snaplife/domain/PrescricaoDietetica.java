package com.projeto.snaplife.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.Length;

@SuppressWarnings("serial")
@Entity
public class PrescricaoDietetica extends GenericDomain {
	
	@Length(min = 0, max = 500, message = "Campo objetivo precisa ter no máximo 500 caracteres")
	@Column(length = 500, nullable = true)
	private String objetivo;
	
	@Column(nullable = false, precision = 7, scale = 2)
	private BigDecimal gorduraOfertada;
	
	@Column(nullable = false, precision = 7, scale = 2)
	private BigDecimal carboidratosOfertados;
	
	@Column(nullable = false, precision = 7, scale = 2)
	private BigDecimal proteinasOfertadas;
	
	@Length(min = 0, max = 500, message = "Campo anotacao precisa ter no máximo 500 caracteres")
	@Column(length = 500, nullable = true)
	private String anotacao;
	
	@Column(nullable = false, precision = 7, scale = 2)
	private BigDecimal vetValorEnergOfertado;
	
	@ManyToOne
	@JoinColumn(nullable = true) 
	private Consulta consulta;

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public BigDecimal getGorduraOfertada() {
		return gorduraOfertada;
	}

	public void setGorduraOfertada(BigDecimal gorduraOfertada) {
		this.gorduraOfertada = gorduraOfertada;
	}

	public BigDecimal getCarboidratosOfertados() {
		return carboidratosOfertados;
	}

	public void setCarboidratosOfertados(BigDecimal carboidratosOfertados) {
		this.carboidratosOfertados = carboidratosOfertados;
	}

	public BigDecimal getProteinasOfertadas() {
		return proteinasOfertadas;
	}

	public void setProteinasOfertadas(BigDecimal proteinasOfertadas) {
		this.proteinasOfertadas = proteinasOfertadas;
	}

	public String getAnotacao() {
		return anotacao;
	}

	public void setAnotacao(String anotacao) {
		this.anotacao = anotacao;
	}

	public BigDecimal getVetValorEnergOfertado() {
		return vetValorEnergOfertado;
	}

	public void setVetValorEnergOfertado(BigDecimal vetValorEnergOfertado) {
		this.vetValorEnergOfertado = vetValorEnergOfertado;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public PrescricaoDietetica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PrescricaoDietetica(String objetivo, BigDecimal gorduraOfertada, BigDecimal carboidratosOfertados,
			BigDecimal proteinasOfertadas, String anotacao, BigDecimal vetValorEnergOfertado, Consulta consulta) {
		super();
		this.objetivo = objetivo;
		this.gorduraOfertada = gorduraOfertada;
		this.carboidratosOfertados = carboidratosOfertados;
		this.proteinasOfertadas = proteinasOfertadas;
		this.anotacao = anotacao;
		this.vetValorEnergOfertado = vetValorEnergOfertado;
		this.consulta = consulta;
	}

}
