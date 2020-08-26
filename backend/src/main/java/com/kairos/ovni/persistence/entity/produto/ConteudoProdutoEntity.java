package com.kairos.ovni.persistence.entity.produto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@SequenceGenerator(name = "sq_conteudoproduto", sequenceName = "sq_conteudoproduto", allocationSize = 1)
@Table(name = "conteudoproduto")
public class ConteudoProdutoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "_codigo")
    private Integer id;	
	@OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name = "_produto", insertable = true, updatable = true)
	@Fetch(FetchMode.JOIN)
	private ProdutoEntity produto;
	@OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name = "_caracttipoproduto", insertable = true, updatable = true)
	@Fetch(FetchMode.JOIN)
	private CaracTpProdutoEntity caracTpProduto;
	@Column(name = "_descricao")
    private String descricao;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public ProdutoEntity getProduto() {
		return produto;
	}
	public void setProduto(ProdutoEntity produto) {
		this.produto = produto;
	}
	public CaracTpProdutoEntity getCaracTpProduto() {
		return caracTpProduto;
	}
	public void setCaracTpProduto(CaracTpProdutoEntity caracTpProduto) {
		this.caracTpProduto = caracTpProduto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}