package com.projeto.snaplife.domain;

public class Consulta extends GenericDomain{
	
	private char dataConsulta;
	private char historicoFamiliar;	
	private double peso;
	private double altura;
	private int idade;
	private char sexo;
	private char estadoCorporal;
	private int fatorAtividade;
	private double taxaMb;
	private char diagnostico;
	private int gastoEnergetico;
	
	@Column(nullable = false)
	@ManyToOne
	private Prescricao prescricaoDietetica;
	
	public Prescricao getPrescricao() {
		return prescricao;
	}
	
	public void setPrescricao(Prescricao prescricaoDietetica) {
		this.prescricaoDietetica = prescricaoDietetica;
	}
	
	
	@Column(nullable = false)
	@OneToOne
	private Circunferencia circunferencia;
	
	public Circunferencia getCircunferencia() {
		return circunferencia;
	}
	
	public void setCircunferencia(Circunferencia circunferencia) {
		this.circunferencia = circunferencia;
	}
	
	public char getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(char dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public char getHistoricoFamiliar() {
		return historicoFamiliar;
	}

	public void setHistoricoFamiliar(char historicoFamiliar) {
		this.historicoFamiliar = historicoFamiliar;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public char getEstadoCorporal() {
		return estadoCorporal;
	}

	public void setEstadoCorporal(char estadoCorporal) {
		this.estadoCorporal = estadoCorporal;
	}

	public int getFatorAtividade() {
		return fatorAtividade;
	}

	public void setFatorAtividade(int fatorAtividade) {
		this.fatorAtividade = fatorAtividade;
	}

	public double getTaxaMb() {
		return taxaMb;
	}

	public void setTaxaMb(double taxaMb) {
		this.taxaMb = taxaMb;
	}

	public char getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(char diagnostico) {
		this.diagnostico = diagnostico;
	}

	public int getGastoEnergetico() {
		return gastoEnergetico;
	}

	public void setGastoEnergetico(int gastoEnergetico) {
		this.gastoEnergetico = gastoEnergetico;
	}

	public DobrasSubcutaneas getDobrasSubcutaneas() {
		return dobrasSubcutaneas;
	}

	public void setDobrasSubcutaneas(DobrasSubcutaneas dobrasSubcutaneas) {
		this.dobrasSubcutaneas = dobrasSubcutaneas;
	}

	public Circunferencia getCircunferencia() {
		return circunferencia;
	}

	public void setCircunferencia(Circunferencia circunferencia) {
		this.circunferencia = circunferencia;
	}

	public PrescricaoDietetica getPrescricaoDietetica() {
		return prescricaoDietetica;
	}

	public void setPrescricaoDietetica(PrescricaoDietetica prescricaoDietetica) {
		this.prescricaoDietetica = prescricaoDietetica;
	}

	@Column(nullable = false)
	@OneToOne
	private DobrasSubcutaneas dobrasSubcutaneas;
	
	@Column(nullable = false)
	@OneToOne
	private Circunferencia circunferencia;
	
	@Column(nullable = false)
	@ManyToOne
	private PrescricaoDietetica prescricaoDietetica;

}
