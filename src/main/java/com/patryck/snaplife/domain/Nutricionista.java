package com.patryck.snaplife.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@SuppressWarnings("serial")
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
