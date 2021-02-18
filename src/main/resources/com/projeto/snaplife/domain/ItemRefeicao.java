package com.projeto.snaplife.domain;

public class ItemRefeicao extends GenericDomain{
	
	private int quantidade;
	private int calorias;
	private int carboidratos;
	private int proteinas;
	private int gorduras;
	
	@Column(nullable = false)
	@ManyToMany
	private Refeicao refeicao;
	
	@Column(nullable = false)
	@ManyToOne
	private Alimento alimento;

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getCalorias() {
		return calorias;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}

	public int getCarboidratos() {
		return carboidratos;
	}

	public void setCarboidratos(int carboidratos) {
		this.carboidratos = carboidratos;
	}

	public int getProteinas() {
		return proteinas;
	}

	public void setProteinas(int proteinas) {
		this.proteinas = proteinas;
	}

	public int getGorduras() {
		return gorduras;
	}

	public void setGorduras(int gorduras) {
		this.gorduras = gorduras;
	}

	public Refeicao getRefeicao() {
		return refeicao;
	}

	public void setRefeicao(Refeicao refeicao) {
		this.refeicao = refeicao;
	}

	public Alimento getAlimento() {
		return alimento;
	}

	public void setAlimento(Alimento alimento) {
		this.alimento = alimento;
	}

}
