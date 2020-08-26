package com.kairos.ovni.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kairos.ovni.business.IProduto;
import com.kairos.ovni.dto.produto.ProdutoDTO;
import com.kairos.ovni.dto.produto.TipoProdutoDTO;
import com.kairos.ovni.persistence.dao.IProdutoDAO;

@Service
public class ProdutoImpl implements IProduto{

	@Autowired
	IProdutoDAO produtoDao;
	
	@Override
	public List<ProdutoDTO> listarProdutos() {
				
		return produtoDao.listarProdutos();
	}
	
	@Override
	public List<ProdutoDTO> buscarPorNome(String nome){
				
		return produtoDao.buscarPorNome(nome);
		
	}
	
	@Override
	public List<ProdutoDTO> buscarPorTipo(Integer id){
		TipoProdutoDTO tpProdutoDTO = new TipoProdutoDTO();
		tpProdutoDTO.setId(id);
		return produtoDao.buscarPorTipo(tpProdutoDTO);
		
	}
	
	@Override
	public ProdutoDTO buscarPorId(Integer id){
		
		try {
			return produtoDao.buscarPorId(id);
		} catch (Exception e) {
			return null;
		}
		
	}
	
	@Override
	public ProdutoDTO salvarProduto(ProdutoDTO dto){
		
		return produtoDao.salvarProduto(dto);
		
	}	

}
