package com.projeto.snaplife.domain;

public class Refeicao extends GenericDomain{
	
	private char tipoRefeicao;
	private date horario;
	private char alterarAlimento;
	
	@Column(nullable = false)
	@ManyToOne
	private Item itemRefeicao;
	
	public Item getItemRefeicao() {
		return itemRefeicao;
	}
	
	public void setItemRefeicao(Item itemRefeicao) {
		this.itemRefeicao = itemRefeicao;
	}

	@Column(nullable = false)
	@ManyToMany
	private Prescricao prescricaoDietetica;
	
	public char getTipoRefeicao() {
		return tipoRefeicao;
	}

	public void setTipoRefeicao(char tipoRefeicao) {
		this.tipoRefeicao = tipoRefeicao;
	}

	public date getHorario() {
		return horario;
	}

	public void setHorario(date horario) {
		this.horario = horario;
	}

	public char getAlterarAlimento() {
		return alterarAlimento;
	}

	public void setAlterarAlimento(char alterarAlimento) {
		this.alterarAlimento = alterarAlimento;
	}

	public Prescricao getPrescricaoDietetica() {
		return prescricaoDietetica;
	}

	public void setPrescricaoDietetica(Prescricao prescricaoDietetica) {
		this.prescricaoDietetica = prescricaoDietetica;
	}

}
