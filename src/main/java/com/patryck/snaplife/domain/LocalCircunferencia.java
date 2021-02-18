package com.patryck.snaplife.domain;

import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class LocalCircunferencia extends GenericDomain{
	private char Local;

	public char getLocal() {
		return Local;
	}

	public void setLocal(char local) {
		Local = local;
	}
}
