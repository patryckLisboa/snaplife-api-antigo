package com.projeto.snaplife.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.Length;

@SuppressWarnings("serial")
@Entity
public class Consulta extends GenericDomain {
	
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dataConsulta;
	
	@Length(min = 0, max = 1000, message = "Campo historico social/familiar precisa ter no máximo 2000 caracteres")
	@Column(length = 2000, nullable = true)
	private String historicoSocialFamiliar;
	
	
	@Column(nullable = false, precision = 7, scale = 2)
	private BigDecimal peso;
	

	@Column(nullable = false, precision = 7, scale = 2)
	private BigDecimal altura;
	
	
	@Column(nullable = false)
	private Integer idade;
	
	
	@Column(nullable = false)
	private Character sexo;
	
	@Length(min = 0, max = 60, message = "Campo historico estado corporal precisa ter no máximo 60 caracteres")
	@Column(length = 60, nullable = true)
	private String estadoCorporal;
	
	
	@Column(nullable = false, precision = 11, scale = 2)
	private BigDecimal fatorAtividade;
	
	@Column(nullable = false, precision = 11, scale = 2)
	private BigDecimal taxaMB;
	

	@Length(min = 0, max = 2000, message = "Campo diagnostico precisa ter no máximo 2000 caracteres")
	@Column(length = 2000, nullable = false)
	private String diagnostico;
	

	@Column(nullable = false, precision = 11, scale = 2)
	private BigDecimal gastoEnergTot;
	
	@ManyToOne
	@JoinColumn(nullable = true) 
	private Cliente cliente;

	public Date getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public String getHistoricoSocialFamiliar() {
		return historicoSocialFamiliar;
	}

	public void setHistoricoSocialFamiliar(String historicoSocialFamiliar) {
		this.historicoSocialFamiliar = historicoSocialFamiliar;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCorporal() {
		return estadoCorporal;
	}

	public void setEstadoCorporal(String estadoCorporal) {
		this.estadoCorporal = estadoCorporal;
	}

	public BigDecimal getFatorAtividade() {
		return fatorAtividade;
	}

	public void setFatorAtividade(BigDecimal fatorAtividade) {
		this.fatorAtividade = fatorAtividade;
	}

	public BigDecimal getTaxaMB() {
		return taxaMB;
	}

	public void setTaxaMB(BigDecimal taxaMB) {
		this.taxaMB = taxaMB;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public BigDecimal getGastoEnergTot() {
		return gastoEnergTot;
	}

	public void setGastoEnergTot(BigDecimal gastoEnergTot) {
		this.gastoEnergTot = gastoEnergTot;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Consulta(Date dataConsulta, String historicoSocialFamiliar, BigDecimal peso, BigDecimal altura,
			Integer idade, Character sexo, String estadoCorporal, BigDecimal fatorAtividade, BigDecimal taxaMB,
			String diagnostico, BigDecimal gastoEnergTot, Cliente cliente) {
		super();
		this.dataConsulta = dataConsulta;
		this.historicoSocialFamiliar = historicoSocialFamiliar;
		this.peso = peso;
		this.altura = altura;
		this.idade = idade;
		this.sexo = sexo;
		this.estadoCorporal = estadoCorporal;
		this.fatorAtividade = fatorAtividade;
		this.taxaMB = taxaMB;
		this.diagnostico = diagnostico;
		this.gastoEnergTot = gastoEnergTot;
		this.cliente = cliente;
	}

	public Consulta() {
		super();
		// TODO Auto-generated constructor stub
	}

}
