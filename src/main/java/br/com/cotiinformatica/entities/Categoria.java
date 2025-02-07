package br.com.cotiinformatica.entities;

import java.util.List;
import java.util.UUID;

public class Categoria {

	private UUID id;
	private String nome;
	private List<Produto> produtos;
	
	public Categoria() {
		// TODO Auto-generated constructor stub
	}

	public Categoria(UUID id, String nome, List<Produto> produtos) {
		super();
		this.id = id;
		this.nome = nome;
		this.produtos = produtos;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nome=" + nome + ", produtos=" + produtos + "]";
	}
	
	
}
