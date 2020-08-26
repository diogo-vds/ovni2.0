package com.kairos.ovni.dto.produto;

import java.io.Serializable;

public class TipoProdutoDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5525986716344209029L;
	
	private Integer id;	
	private String descricao;
	
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
	
}
