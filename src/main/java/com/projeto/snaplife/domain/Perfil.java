package com.projeto.snaplife.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;


@SuppressWarnings("serial")
@Entity
public class Perfil extends GenericDomain {
	
	@NotEmpty(message = "Campo senha é requerido")
	@Length(min = 6, max = 11, message = "Campo senha deve ter entre 6 e 11 caracteres")
	@Column(length = 32, nullable = false) // 32 pois na criptografia md5 hash vem um código de 32 caracteres para
	private String senha;                 // qualquer senha
	
	@NotEmpty(message = "Campo usuario é requerido")
	@Length(min = 3, max = 60, message = "Campo usuario deve ter entre 3 e 60 caracteres")
	@Column(length = 60, nullable = false)
	private String usuario;
	
	@NotEmpty(message = "Campo nome completo é requerido")
	@Length(min = 6, max = 60, message = "Campo nome completo deve ter entre 6 e 60 caracteres")
	@Column(length = 60, nullable = false)
	private String nomeCompleto;
	
	@NotEmpty(message = "Campo email completo é requerido")
	@Length(min = 6, max = 100, message = "Campo email completo deve ter entre 6 e 100 caracteres")
	@Column(length = 100, nullable = false)
	private String email;
	
	@Length(min = 6, max = 20, message = "Campo telefone completo deve ter entre 6 e 20 caracteres")
	@Column(length = 20, nullable = true)
	private String telefone;
	
	@Length(min = 6, max = 20, message = "Campo celular completo deve ter entre 6 e 20 caracteres")
	@Column(length = 20, nullable = true)
	private String celular;
	
	public Perfil() {
		super();

	}
	
	public Perfil(String senha, String usuario, String nomeCompleto, String email) {
		super();
		this.senha = senha;
		this.usuario = usuario;
		this.nomeCompleto = nomeCompleto;
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

}
