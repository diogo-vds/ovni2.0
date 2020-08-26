package com.kairos.ovni.persistence.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kairos.ovni.dto.produto.ProdutoDTO;
import com.kairos.ovni.dto.produto.TipoProdutoDTO;
import com.kairos.ovni.persistence.dao.IProdutoDAO;
import com.kairos.ovni.persistence.entity.produto.ProdutoEntity;
import com.kairos.ovni.persistence.entity.produto.TipoProdutoEntity;
import com.kairos.ovni.persistence.repository.produto.ProdutoRepository;
import com.kairos.ovni.util.ProdutoUtil;

@Service
public class ProdutoDAOImpl implements IProdutoDAO {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	public List<ProdutoDTO> listarProdutos(){
		List<ProdutoDTO> listDto = new ArrayList<ProdutoDTO>();
		List<ProdutoEntity> listEntity = produtoRepository.findTop2AllByStatusOrderByVendasDesc(true);
		for(ProdutoEntity entity : listEntity) {
			ProdutoDTO dto = ProdutoUtil.entityToDTO(entity);
			listDto.add(dto);
		}
		return listDto;
	}
	
	public List<ProdutoDTO> buscarPorNome(String nome){
		List<ProdutoDTO> listDto = new ArrayList<ProdutoDTO>();
		List<ProdutoEntity> listEntity = produtoRepository.findByStatusAndTituloIgnoreCaseContaining(true, nome);
		for(ProdutoEntity entity : listEntity) {
			ProdutoDTO dto = ProdutoUtil.entityToDTO(entity);
			listDto.add(dto);
		}
		return listDto;
	}
	
	public List<ProdutoDTO> buscarPorTipo(TipoProdutoDTO tpProdutoDTO){
		List<ProdutoDTO> listDto = new ArrayList<ProdutoDTO>();
		TipoProdutoEntity tpProduto =  ProdutoUtil.tpProdutoDtoToEntity(tpProdutoDTO);
		List<ProdutoEntity> listEntity = produtoRepository.findByTpProduto(tpProduto);
		for(ProdutoEntity entity : listEntity) {
			ProdutoDTO dto = ProdutoUtil.entityToDTO(entity);
			listDto.add(dto);
		}
		return listDto;
	}
	
	public ProdutoDTO buscarPorId(Integer id) throws Exception {
	
		Optional<ProdutoEntity> entity = produtoRepository.findById(id);
		if(!entity.isPresent()) {
			throw new Exception("Produto não encontrado.");
		}
		return ProdutoUtil.entityToDTO(entity.get());
		
	}
	
	public ProdutoDTO salvarProduto(ProdutoDTO dto) {
	
		ProdutoEntity entity = ProdutoUtil.dtoToEntity(dto);
		entity = produtoRepository.save(entity);
		return ProdutoUtil.entityToDTO(entity);
		
	}

}
