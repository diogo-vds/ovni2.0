package com.kairos.ovni.persistence.dao;

import java.util.List;

import com.kairos.ovni.dto.produto.ProdutoDTO;
import com.kairos.ovni.dto.produto.TipoProdutoDTO;

public interface IProdutoDAO {

	public List<ProdutoDTO> listarProdutos();
	
	public List<ProdutoDTO> buscarPorNome(String nome);
	
	public List<ProdutoDTO> buscarPorTipo(TipoProdutoDTO tpProdutoDTO);
	
	public ProdutoDTO buscarPorId(Integer id) throws Exception;
	
	public ProdutoDTO salvarProduto(ProdutoDTO dto);
	
}
