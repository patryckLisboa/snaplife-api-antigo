package com.projeto.snaplife.domain;

@Entity
public class LocalDobra extends GenericDomain{
	private char local;
	private double medida;
	public char getLocal() {
		return local;
	}
	public void setLocal(char local) {
		this.local = local;
	}
	public double getMedida() {
		return medida;
	}
	public void setMedida(double medida) {
		this.medida = medida;
	}


}
