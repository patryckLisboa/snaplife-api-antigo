package com.projeto.snaplife.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.Length;

@SuppressWarnings("serial")
@Entity
public class Nutricionista extends Perfil {

	@Length(min = 0, max = 1000, message = "Campo certificados precisa ter no máximo 1000 caracteres")
	@Column(length = 1000, nullable = true)
	private String certificados;

	public String getCertificados() {
		return certificados;
	}

	public void setCertificados(String certificados) {
		this.certificados = certificados;
	}

	public Nutricionista(
			@Length(min = 0, max = 1000, message = "Campo certificados precisa ter no máximo 1000 caracteres") String certificados) {
		super();
		this.certificados = certificados;
	}

	public Nutricionista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Nutricionista(String senha, String usuario, String nomeCompleto, String email) {
		super(senha, usuario, nomeCompleto, email);
		// TODO Auto-generated constructor stub
	}



}
