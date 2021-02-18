package com.projeto.snaplife.domain;

@Entity
public class Mensagem extends GenericDomain{
	private char dataNotificacao;
	private boolean confirmacaoLeitura;
	private int dataExclusao;
	private int numeroNotificacoes;
	private char texto;
	
	@Column(nullable = false)
	@OneToOne
	private Perfil perfilNutri;
	
	@Column(nullable = false)
	@OneToOne
	private Perfil perfilCliente;
	
	@Column(nullable = false)
	@OneToOne
	private Atendimento atendimentoCliente;

	public char getDataNotificacao() {
		return dataNotificacao;
	}

	public void setDataNotificacao(char dataNotificacao) {
		this.dataNotificacao = dataNotificacao;
	}

	public boolean isConfirmacaoLeitura() {
		return confirmacaoLeitura;
	}

	public void setConfirmacaoLeitura(boolean confirmacaoLeitura) {
		this.confirmacaoLeitura = confirmacaoLeitura;
	}

	public int getDataExclusao() {
		return dataExclusao;
	}

	public void setDataExclusao(int dataExclusao) {
		this.dataExclusao = dataExclusao;
	}

	public int getNumeroNotificacoes() {
		return numeroNotificacoes;
	}

	public void setNumeroNotificacoes(int numeroNotificacoes) {
		this.numeroNotificacoes = numeroNotificacoes;
	}

	public char getTexto() {
		return texto;
	}

	public void setTexto(char texto) {
		this.texto = texto;
	}

	public Perfil getPerfilNutri() {
		return perfilNutri;
	}

	public void setPerfilNutri(Perfil perfilNutri) {
		this.perfilNutri = perfilNutri;
	}

	public Perfil getPerfilCliente() {
		return perfilCliente;
	}

	public void setPerfilCliente(Perfil perfilCliente) {
		this.perfilCliente = perfilCliente;
	}

	public Atendimento getAtendimentoCliente() {
		return atendimentoCliente;
	}

	public void setAtendimentoCliente(Atendimento atendimentoCliente) {
		this.atendimentoCliente = atendimentoCliente;
	}
	

}
