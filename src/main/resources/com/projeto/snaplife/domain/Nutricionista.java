package com.projeto.snaplife.domain;

import javax.persistence.Column;

@Entity
public class Nutricionista extends GenericDomain {
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
