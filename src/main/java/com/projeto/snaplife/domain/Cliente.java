package com.projeto.snaplife.domain;

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
public class Cliente extends Perfil{
	
	@Override
	public String toString() {
		return "Cliente [dataNascimento=" + dataNascimento + ", infoAdicionais=" + infoAdicionais + ", ativo=" + ativo
				+ ", nutricionista=" + nutricionista + ", getDataNascimento()=" + getDataNascimento()
				+ ", getInfoAdicionais()=" + getInfoAdicionais() + ", getAtivo()=" + getAtivo()
				+ ", getNutricionista()=" + getNutricionista() + ", getSenha()=" + getSenha() + ", getUsuario()="
				+ getUsuario() + ", getNomeCompleto()=" + getNomeCompleto() + ", getEmail()=" + getEmail()
				+ ", getTelefone()=" + getTelefone() + ", getCelular()=" + getCelular() + ", getCodigo()=" + getCodigo()
				+ "]";
	}

	@Column(nullable = true)
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	@Length(min = 0, max = 1000, message = "Campo certificados precisa ter no máximo 1000 caracteres")
	@Column(length = 1000, nullable = true)
	private String infoAdicionais;
	
	@Column(nullable = true)
	private Boolean ativo;
	
	@ManyToOne
	@JoinColumn(nullable = true) 
	private Nutricionista nutricionista;

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getInfoAdicionais() {
		return infoAdicionais;
	}

	public void setInfoAdicionais(String infoAdicionais) {
		this.infoAdicionais = infoAdicionais;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Nutricionista getNutricionista() {
		return nutricionista;
	}

	public void setNutricionista(Nutricionista nut) {
		this.nutricionista = nut;
	}

	public Cliente(Date dataNascimento,
			@Length(min = 0, max = 1000, message = "Campo certificados precisa ter no máximo 1000 caracteres") String infoAdicionais,
			Boolean ativo, Nutricionista nutricionista) {
		super();
		this.dataNascimento = dataNascimento;
		this.infoAdicionais = infoAdicionais;
		this.ativo = ativo;
		this.nutricionista = nutricionista;
	}

	public Cliente() {
		super();
		
	}

	public Cliente(String senha, String usuario, String nomeCompleto, String email) {
		super(senha, usuario, nomeCompleto, email);
		
	}
	
}
