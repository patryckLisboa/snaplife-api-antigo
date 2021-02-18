package com.projeto.snaplife.domain;

public class Perfil extends GenericDomain{
	private char login;
	private char senha;
	private int usuario;
	private int dataNascimento;
	private char nomeCompleto;
	private char email;
	private char telefone;
	private char pais;
	
	public char getLogin() {
		return login;
	}
	public void setLogin(char login) {
		this.login = login;
	}
	public char getSenha() {
		return senha;
	}
	public void setSenha(char senha) {
		this.senha = senha;
	}
	public int getUsuario() {
		return usuario;
	}
	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}
	public int getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public char getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(char nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public char getEmail() {
		return email;
	}
	public void setEmail(char email) {
		this.email = email;
	}
	public char getTelefone() {
		return telefone;
	}
	public void setTelefone(char telefone) {
		this.telefone = telefone;
	}
	public char getPais() {
		return pais;
	}
	public void setPais(char pais) {
		this.pais = pais;
	}
	
	

}
