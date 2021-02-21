package com.projeto.snaplife.dtos;
import javax.persistence.Column;
import org.hibernate.validator.constraints.Length;

import com.projeto.snaplife.domain.GenericDomain;
import com.projeto.snaplife.domain.Nutricionista;

public class NutricionistaDTO extends GenericDomain {

	private static final long serialVersionUID = 1L;
	
	
	@Length(min = 0, max = 1000, message = "Campo certificados precisa ter no máximo 1000 caracteres")
	@Column(length = 1000, nullable = true)
	private String certificados;
	
	
	public NutricionistaDTO(
			@Length(min = 0, max = 1000, message = "Campo certificados precisa ter no máximo 1000 caracteres") String certificados) {
		super();
		this.certificados = certificados;
	}
	public NutricionistaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NutricionistaDTO(Nutricionista obj) {
		
	}
	public String getCertificados() {
		return certificados;
	}

	public void setCertificados(String certificados) {
		this.certificados = certificados;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
