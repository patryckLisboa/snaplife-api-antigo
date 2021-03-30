package com.projeto.snaplife.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Length;

@Entity
public class CMVColtaco3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@Length(min = 0, max = 50, message = "Campo precisa ter no máximo 50 caracteres")
	@Column(length = 50, nullable = true)
	private String id;
	
	@Length(min = 0, max = 100, message = "Campo precisa ter no máximo 100 caracteres")
	@Column(length = 100, nullable = true)
	private String categoria;
	
	@Id
	@Length(min = 0, max = 50, message = "Campo precisa ter no máximo 50 caracteres")
	@Column(name = "numeroAlimento", length = 50, nullable = true)
	private String numeroAlimento;
	
	@Length(min = 0, max = 255, message = "Campo precisa ter no máximo 255 caracteres")
	@Column(length = 255, nullable = true)
	private String descricaoAlimento;
	 
	@Length(min = 0, max = 100, message = "Campo precisa ter no máximo 100 caracteres")
	@Column(name = "umidade", length = 100, nullable = true)
	private String unidade;
	
	@Length(min = 0, max = 100, message = "Campo precisa ter no máximo 100 caracteres")
	@Column(length = 100, nullable = true)
	private String energiaKcal;
	
	@Length(min = 0, max = 100, message = "Campo precisa ter no máximo 100 caracteres")
	@Column(length = 100, nullable = true)
	private String energiaKj;
	
	@Length(min = 0, max = 100, message = "Campo precisa ter no máximo 100 caracteres")
	@Column(length = 100, nullable = true)
	private String proteina;
	
	@Length(min = 0, max = 100, message = "Campo precisa ter no máximo 100 caracteres")
	@Column(length = 100, nullable = true)
	private String lipideos;
	
	@Length(min = 0, max = 100, message = "Campo precisa ter no máximo 100 caracteres")
	@Column(length = 100, nullable = true)
	private String colesterol;
	
	@Length(min = 0, max = 100, message = "Campo precisa ter no máximo 100 caracteres")
	@Column(length = 100, nullable = true)
	private String carboidrato;
	
	@Length(min = 0, max = 100, message = "Campo precisa ter no máximo 100 caracteres")
	@Column(length = 100, nullable = true)
	private String fibraAlimentar;
	
	@Length(min = 0, max = 100, message = "Campo precisa ter no máximo 100 caracteres")
	@Column(length = 100, nullable = true)
	private String cinzas;
	
	@Length(min = 0, max = 100, message = "Campo precisa ter no máximo 100 caracteres")
	@Column(length = 100, nullable = true)
	private String calcio;
	
	@Length(min = 0, max = 100, message = "Campo precisa ter no máximo 100 caracteres")
	@Column(length = 100, nullable = true)
	private String magnesio;
	
	@Length(min = 0, max = 100, message = "Campo precisa ter no máximo 100 caracteres")
	@Column(length = 100, nullable = true)
	private String manganes;
	
	@Length(min = 0, max = 100, message = "Campo precisa ter no máximo 100 caracteres")
	@Column(length = 100, nullable = true)
	private String fosforo;
	
	@Length(min = 0, max = 100, message = "Campo precisa ter no máximo 100 caracteres")
	@Column(length = 100, nullable = true)
	private String ferro;
	
	@Length(min = 0, max = 100, message = "Campo precisa ter no máximo 100 caracteres")
	@Column(length = 100, nullable = true)
	private String sodio;
	
	@Length(min = 0, max = 100, message = "Campo precisa ter no máximo 100 caracteres")
	@Column(length = 100, nullable = true)
	private String potassio;
	
	@Length(min = 0, max = 100, message = "Campo precisa ter no máximo 100 caracteres")
	@Column(length = 100, nullable = true)
	private String cobre;
	
	@Length(min = 0, max = 100, message = "Campo precisa ter no máximo 100 caracteres")
	@Column(length = 100, nullable = true)
	private String zinco;
	
	@Length(min = 0, max = 100, message = "Campo precisa ter no máximo 100 caracteres")
	@Column(length = 100, nullable = true)
	private String retinol;
	
	@Length(min = 0, max = 100, message = "Campo precisa ter no máximo 100 caracteres")
	@Column(length = 100, nullable = true)
	private String re;
	
	@Length(min = 0, max = 100, message = "Campo precisa ter no máximo 100 caracteres")
	@Column(length = 100, nullable = true)
	private String rae;
	
	@Length(min = 0, max = 100, message = "Campo precisa ter no máximo 100 caracteres")
	@Column(length = 100, nullable = true)
	private String tiamina;
	
	@Length(min = 0, max = 100, message = "Campo precisa ter no máximo 100 caracteres")
	@Column(length = 100, nullable = true)
	private String riboflavina;
	
	@Length(min = 0, max = 100, message = "Campo precisa ter no máximo 100 caracteres")
	@Column(length = 100, nullable = true)
	private String piridoxina;
	
	@Length(min = 0, max = 100, message = "Campo precisa ter no máximo 100 caracteres")
	@Column(length = 100, nullable = true)
	private String niacina; 
	
	@Length(min = 0, max = 100, message = "Campo precisa ter no máximo 100 caracteres")
	@Column(name = "vitaminaC", length = 100, nullable = true)
	private String vitamin;
	
	@Length(min = 0, max = 50, message = "Campo precisa ter no máximo 50 caracteres")
	@Column(length = 50, nullable = true)
	private String created_at;
	
	@Length(min = 0, max = 50, message = "Campo precisa ter no máximo 50 caracteres")
	@Column(length = 50, nullable = true)
	private String updated_at;

	public CMVColtaco3() {
		super();
	
	}

	public CMVColtaco3(String id, String categoria, String numeroAlimento, String descricaoAlimento, String unidade,
			String energiaKcal, String energiaKj, String proteina, String lipideos, String colesterol,
			String carboidrato, String fibraAlimentar, String cinzas, String calcio, String magnesio, String manganes,
			String fosforo, String ferro, String sodio, String potassio, String cobre, String zinco, String retinol,
			String re, String rae, String tiamina, String riboflavina, String piridoxina, String niacina,
			String vitamin, String created_at, String updated_at, ItemRefeicao itemRefeicao) {
		super();
		this.id = id;
		this.categoria = categoria;
		this.numeroAlimento = numeroAlimento;
		this.descricaoAlimento = descricaoAlimento;
		this.unidade = unidade;
		this.energiaKcal = energiaKcal;
		this.energiaKj = energiaKj;
		this.proteina = proteina;
		this.lipideos = lipideos;
		this.colesterol = colesterol;
		this.carboidrato = carboidrato;
		this.fibraAlimentar = fibraAlimentar;
		this.cinzas = cinzas;
		this.calcio = calcio;
		this.magnesio = magnesio;
		this.manganes = manganes;
		this.fosforo = fosforo;
		this.ferro = ferro;
		this.sodio = sodio;
		this.potassio = potassio;
		this.cobre = cobre;
		this.zinco = zinco;
		this.retinol = retinol;
		this.re = re;
		this.rae = rae;
		this.tiamina = tiamina;
		this.riboflavina = riboflavina;
		this.piridoxina = piridoxina;
		this.niacina = niacina;
		this.vitamin = vitamin;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calcio == null) ? 0 : calcio.hashCode());
		result = prime * result + ((carboidrato == null) ? 0 : carboidrato.hashCode());
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((cinzas == null) ? 0 : cinzas.hashCode());
		result = prime * result + ((cobre == null) ? 0 : cobre.hashCode());
		result = prime * result + ((colesterol == null) ? 0 : colesterol.hashCode());
		result = prime * result + ((created_at == null) ? 0 : created_at.hashCode());
		result = prime * result + ((descricaoAlimento == null) ? 0 : descricaoAlimento.hashCode());
		result = prime * result + ((energiaKcal == null) ? 0 : energiaKcal.hashCode());
		result = prime * result + ((energiaKj == null) ? 0 : energiaKj.hashCode());
		result = prime * result + ((ferro == null) ? 0 : ferro.hashCode());
		result = prime * result + ((fibraAlimentar == null) ? 0 : fibraAlimentar.hashCode());
		result = prime * result + ((fosforo == null) ? 0 : fosforo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lipideos == null) ? 0 : lipideos.hashCode());
		result = prime * result + ((magnesio == null) ? 0 : magnesio.hashCode());
		result = prime * result + ((manganes == null) ? 0 : manganes.hashCode());
		result = prime * result + ((niacina == null) ? 0 : niacina.hashCode());
		result = prime * result + ((numeroAlimento == null) ? 0 : numeroAlimento.hashCode());
		result = prime * result + ((piridoxina == null) ? 0 : piridoxina.hashCode());
		result = prime * result + ((potassio == null) ? 0 : potassio.hashCode());
		result = prime * result + ((proteina == null) ? 0 : proteina.hashCode());
		result = prime * result + ((rae == null) ? 0 : rae.hashCode());
		result = prime * result + ((re == null) ? 0 : re.hashCode());
		result = prime * result + ((retinol == null) ? 0 : retinol.hashCode());
		result = prime * result + ((riboflavina == null) ? 0 : riboflavina.hashCode());
		result = prime * result + ((sodio == null) ? 0 : sodio.hashCode());
		result = prime * result + ((tiamina == null) ? 0 : tiamina.hashCode());
		result = prime * result + ((unidade == null) ? 0 : unidade.hashCode());
		result = prime * result + ((updated_at == null) ? 0 : updated_at.hashCode());
		result = prime * result + ((vitamin == null) ? 0 : vitamin.hashCode());
		result = prime * result + ((zinco == null) ? 0 : zinco.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CMVColtaco3 other = (CMVColtaco3) obj;
		if (calcio == null) {
			if (other.calcio != null)
				return false;
		} else if (!calcio.equals(other.calcio))
			return false;
		if (carboidrato == null) {
			if (other.carboidrato != null)
				return false;
		} else if (!carboidrato.equals(other.carboidrato))
			return false;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (cinzas == null) {
			if (other.cinzas != null)
				return false;
		} else if (!cinzas.equals(other.cinzas))
			return false;
		if (cobre == null) {
			if (other.cobre != null)
				return false;
		} else if (!cobre.equals(other.cobre))
			return false;
		if (colesterol == null) {
			if (other.colesterol != null)
				return false;
		} else if (!colesterol.equals(other.colesterol))
			return false;
		if (created_at == null) {
			if (other.created_at != null)
				return false;
		} else if (!created_at.equals(other.created_at))
			return false;
		if (descricaoAlimento == null) {
			if (other.descricaoAlimento != null)
				return false;
		} else if (!descricaoAlimento.equals(other.descricaoAlimento))
			return false;
		if (energiaKcal == null) {
			if (other.energiaKcal != null)
				return false;
		} else if (!energiaKcal.equals(other.energiaKcal))
			return false;
		if (energiaKj == null) {
			if (other.energiaKj != null)
				return false;
		} else if (!energiaKj.equals(other.energiaKj))
			return false;
		if (ferro == null) {
			if (other.ferro != null)
				return false;
		} else if (!ferro.equals(other.ferro))
			return false;
		if (fibraAlimentar == null) {
			if (other.fibraAlimentar != null)
				return false;
		} else if (!fibraAlimentar.equals(other.fibraAlimentar))
			return false;
		if (fosforo == null) {
			if (other.fosforo != null)
				return false;
		} else if (!fosforo.equals(other.fosforo))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lipideos == null) {
			if (other.lipideos != null)
				return false;
		} else if (!lipideos.equals(other.lipideos))
			return false;
		if (magnesio == null) {
			if (other.magnesio != null)
				return false;
		} else if (!magnesio.equals(other.magnesio))
			return false;
		if (manganes == null) {
			if (other.manganes != null)
				return false;
		} else if (!manganes.equals(other.manganes))
			return false;
		if (niacina == null) {
			if (other.niacina != null)
				return false;
		} else if (!niacina.equals(other.niacina))
			return false;
		if (numeroAlimento == null) {
			if (other.numeroAlimento != null)
				return false;
		} else if (!numeroAlimento.equals(other.numeroAlimento))
			return false;
		if (piridoxina == null) {
			if (other.piridoxina != null)
				return false;
		} else if (!piridoxina.equals(other.piridoxina))
			return false;
		if (potassio == null) {
			if (other.potassio != null)
				return false;
		} else if (!potassio.equals(other.potassio))
			return false;
		if (proteina == null) {
			if (other.proteina != null)
				return false;
		} else if (!proteina.equals(other.proteina))
			return false;
		if (rae == null) {
			if (other.rae != null)
				return false;
		} else if (!rae.equals(other.rae))
			return false;
		if (re == null) {
			if (other.re != null)
				return false;
		} else if (!re.equals(other.re))
			return false;
		if (retinol == null) {
			if (other.retinol != null)
				return false;
		} else if (!retinol.equals(other.retinol))
			return false;
		if (riboflavina == null) {
			if (other.riboflavina != null)
				return false;
		} else if (!riboflavina.equals(other.riboflavina))
			return false;
		if (sodio == null) {
			if (other.sodio != null)
				return false;
		} else if (!sodio.equals(other.sodio))
			return false;
		if (tiamina == null) {
			if (other.tiamina != null)
				return false;
		} else if (!tiamina.equals(other.tiamina))
			return false;
		if (unidade == null) {
			if (other.unidade != null)
				return false;
		} else if (!unidade.equals(other.unidade))
			return false;
		if (updated_at == null) {
			if (other.updated_at != null)
				return false;
		} else if (!updated_at.equals(other.updated_at))
			return false;
		if (vitamin == null) {
			if (other.vitamin != null)
				return false;
		} else if (!vitamin.equals(other.vitamin))
			return false;
		if (zinco == null) {
			if (other.zinco != null)
				return false;
		} else if (!zinco.equals(other.zinco))
			return false;
		return true;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNumeroAlimento() {
		return numeroAlimento;
	}

	public void setNumeroAlimento(String numeroAlimento) {
		this.numeroAlimento = numeroAlimento;
	}

	public String getDescricaoAlimento() {
		return descricaoAlimento;
	}

	public void setDescricaoAlimento(String descricaoAlimento) {
		this.descricaoAlimento = descricaoAlimento;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getEnergiaKcal() {
		return energiaKcal;
	}

	public void setEnergiaKcal(String energiaKcal) {
		this.energiaKcal = energiaKcal;
	}

	public String getEnergiaKj() {
		return energiaKj;
	}

	public void setEnergiaKj(String energiaKj) {
		this.energiaKj = energiaKj;
	}

	public String getProteina() {
		return proteina;
	}

	public void setProteina(String proteina) {
		this.proteina = proteina;
	}

	public String getLipideos() {
		return lipideos;
	}

	public void setLipideos(String lipideos) {
		this.lipideos = lipideos;
	}

	public String getColesterol() {
		return colesterol;
	}

	public void setColesterol(String colesterol) {
		this.colesterol = colesterol;
	}

	public String getCarboidrato() {
		return carboidrato;
	}

	public void setCarboidrato(String carboidrato) {
		this.carboidrato = carboidrato;
	}

	public String getFibraAlimentar() {
		return fibraAlimentar;
	}

	public void setFibraAlimentar(String fibraAlimentar) {
		this.fibraAlimentar = fibraAlimentar;
	}

	public String getCinzas() {
		return cinzas;
	}

	public void setCinzas(String cinzas) {
		this.cinzas = cinzas;
	}

	public String getCalcio() {
		return calcio;
	}

	public void setCalcio(String calcio) {
		this.calcio = calcio;
	}

	public String getMagnesio() {
		return magnesio;
	}

	public void setMagnesio(String magnesio) {
		this.magnesio = magnesio;
	}

	public String getManganes() {
		return manganes;
	}

	public void setManganes(String manganes) {
		this.manganes = manganes;
	}

	public String getFosforo() {
		return fosforo;
	}

	public void setFosforo(String fosforo) {
		this.fosforo = fosforo;
	}

	public String getFerro() {
		return ferro;
	}

	public void setFerro(String ferro) {
		this.ferro = ferro;
	}

	public String getSodio() {
		return sodio;
	}

	public void setSodio(String sodio) {
		this.sodio = sodio;
	}

	public String getPotassio() {
		return potassio;
	}

	public void setPotassio(String potassio) {
		this.potassio = potassio;
	}

	public String getCobre() {
		return cobre;
	}

	public void setCobre(String cobre) {
		this.cobre = cobre;
	}

	public String getZinco() {
		return zinco;
	}

	public void setZinco(String zinco) {
		this.zinco = zinco;
	}

	public String getRetinol() {
		return retinol;
	}

	public void setRetinol(String retinol) {
		this.retinol = retinol;
	}

	public String getRe() {
		return re;
	}

	public void setRe(String re) {
		this.re = re;
	}

	public String getRae() {
		return rae;
	}

	public void setRae(String rae) {
		this.rae = rae;
	}

	public String getTiamina() {
		return tiamina;
	}

	public void setTiamina(String tiamina) {
		this.tiamina = tiamina;
	}

	public String getRiboflavina() {
		return riboflavina;
	}

	public void setRiboflavina(String riboflavina) {
		this.riboflavina = riboflavina;
	}

	public String getPiridoxina() {
		return piridoxina;
	}

	public void setPiridoxina(String piridoxina) {
		this.piridoxina = piridoxina;
	}

	public String getNiacina() {
		return niacina;
	}

	public void setNiacina(String niacina) {
		this.niacina = niacina;
	}

	public String getVitamin() {
		return vitamin;
	}

	public void setVitamin(String vitamin) {
		this.vitamin = vitamin;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

}
