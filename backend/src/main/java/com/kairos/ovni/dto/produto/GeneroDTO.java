package com.kairos.ovni.dto.produto;

import java.io.Serializable;

public class GeneroDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5948266158878666303L;
	
	private Integer id;
	private String descricao;
	private Integer tpProduto;
	
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
