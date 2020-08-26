package com.kairos.ovni.business;

import java.util.List;

import com.kairos.ovni.dto.produto.ProdutoDTO;

public interface IProduto {
	
	public List<ProdutoDTO> listarProdutos();
	
	public List<ProdutoDTO> buscarPorNome(String nome);
	
	public List<ProdutoDTO> buscarPorTipo(Integer id);
	
	public ProdutoDTO buscarPorId(Integer id);
	
	public ProdutoDTO salvarProduto(ProdutoDTO dto);

}
