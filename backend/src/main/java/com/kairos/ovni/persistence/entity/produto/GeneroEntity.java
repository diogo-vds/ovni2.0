package com.kairos.ovni.persistence.entity.produto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "sq_genero", sequenceName = "sq_genero", allocationSize = 1)
@Table(name = "genero")
public class GeneroEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "_codigo")
	private Integer id;
	@Column(name = "_descricao")
	String descricao;
	@Column(name = "_tipoproduto")
	Integer tpProduto;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getTpProduto() {
		return tpProduto;
	}
	public void setTpProduto(Integer tpProduto) {
		this.tpProduto = tpProduto;
	}

}
