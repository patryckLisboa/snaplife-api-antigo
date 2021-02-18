package com.projeto.snaplife.domain;

@Entity
@SuppressWarnings("serial")
public class DobrasSubcutaneas extends GenericDomain {
	private char consulta;
	private double somaDobras;
	
	@Column(nullable = false)
	@ManyToOne
	private LocalDobra localDobra;

	public char getConsulta() {
		return consulta;
	}

	public void setConsulta(char consulta) {
		this.consulta = consulta;
	}

	public double getSomaDobras() {
		return somaDobras;
	}

	public void setSomaDobras(double somaDobras) {
		this.somaDobras = somaDobras;
	}

	public LocalDobra getLocalDobra() {
		return localDobra;
	}

	public void setLocalDobra(LocalDobra localDobra) {
		this.localDobra = localDobra;
	}

}
