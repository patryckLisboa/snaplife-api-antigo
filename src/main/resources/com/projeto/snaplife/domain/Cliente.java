package com.projeto.snaplife.domain;

@Entity
public class Cliente extends GenericDomain{
	@Column(nullable = false)
	@OneToOne
	private Perfil perfil;

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

}
