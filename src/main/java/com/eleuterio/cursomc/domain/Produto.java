package com.eleuterio.cursomc.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Produto implements Serializable {

	private static final long serialVersionUID = -3737279852960438072L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private Double preco;

	/**
	 * Mapeamento Muitos para Muitos
	 * Para mapear dois objetos com associacoes muitos para muitos, sera criada uma tabela no meio das duas
	 * Nessa tabelta tera as duas chaves estrangeiras dos objetos que serao associados.
	 * Nome da tabela = PRODUTO_CATEGORIA
	 * Nome da Coluna da Chave estrangeira de produto = produto_id
	 * Nome da Coluna da Chave estrangeira de Categoria = categoria_id
	 */
	@ManyToMany
	@JoinTable(name = "PRODUTO_CATEGORIA", // Tabela que fara a tabela do meio de Muitos no banco
			joinColumns = @JoinColumn(name = "produto_id"), // Chave Estrangeira do Id na tabela produto.
			inverseJoinColumns = @JoinColumn(name = "categoria_id")// Chave strangeria da categoria
	)
	private List<Categoria> categorias = new ArrayList<>();

	public Produto() {
	}

	public Produto(Integer id, String nome, Double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
