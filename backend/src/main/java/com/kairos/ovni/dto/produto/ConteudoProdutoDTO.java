package com.kairos.ovni.dto.produto;

import java.io.Serializable;

public class ConteudoProdutoDTO implements Serializable  {


    /**	 */
	private static final long serialVersionUID = -385506465079289858L;
	
	private Integer id;	
	private ProdutoDTO produto;
	private CaracTpProdutoDTO caracTpProduto;
    private String descricao;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public ProdutoDTO getProduto() {
		return produto;
	}
	public void setProduto(ProdutoDTO produto) {
		this.produto = produto;
	}
	public CaracTpProdutoDTO getCaracTpProduto() {
		return caracTpProduto;
	}
	public void setCaracTpProduto(CaracTpProdutoDTO caracTpProduto) {
		this.caracTpProduto = caracTpProduto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}