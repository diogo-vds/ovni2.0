package com.kairos.ovni.util;

import com.kairos.ovni.dto.FornecedorDTO;
import com.kairos.ovni.dto.produto.CaracTpProdutoDTO;
import com.kairos.ovni.dto.produto.CategoriaDTO;
import com.kairos.ovni.dto.produto.ConteudoProdutoDTO;
import com.kairos.ovni.dto.produto.GeneroDTO;
import com.kairos.ovni.dto.produto.ProdutoDTO;
import com.kairos.ovni.dto.produto.TipoProdutoDTO;
import com.kairos.ovni.persistence.entity.FornecedorEntity;
import com.kairos.ovni.persistence.entity.produto.CaracTpProdutoEntity;
import com.kairos.ovni.persistence.entity.produto.CategoriaEntity;
import com.kairos.ovni.persistence.entity.produto.ConteudoProdutoEntity;
import com.kairos.ovni.persistence.entity.produto.GeneroEntity;
import com.kairos.ovni.persistence.entity.produto.ProdutoEntity;
import com.kairos.ovni.persistence.entity.produto.TipoProdutoEntity;

public class ProdutoUtil {
	
	public static ProdutoDTO entityToDTO(ProdutoEntity entity) {
		ProdutoDTO dto = new ProdutoDTO();
		dto.setAnoLancamento(entity.getAnoLancamento());
		dto.setAutorArtista(entity.getAutorArtista());
		dto.setCategoria(categoriaEntityToDto(entity.getCategoria()));
		dto.setClassFiscal(entity.getClassFiscal());
		dto.setFornecedor(fornecedorEntityToDTO(entity.getFornecedor()));
		dto.setGenero(generoEntityToDto(entity.getGenero()));
		dto.setIcms(entity.getIcms());
		dto.setId(entity.getId());
		dto.setIdioma(entity.getIdioma());
		dto.setIpi(entity.getIpi());
		dto.setPaisOrigem(entity.getPaisOrigem());
		dto.setPeso(entity.getPeso());
		dto.setProcedencia(entity.getProcedencia());
		dto.setResumoString(entity.getResumoString());
		dto.setStatus(entity.getStatus());
		dto.setTitulo(entity.getTitulo());
		dto.setTpProduto(tpProdutoEntityToDto(entity.getTpProduto()));
		dto.setUnidade(entity.getUnidade());
		dto.setValor(entity.getValor());
		dto.setVendas(entity.getVendas());
		dto.setVisitas(entity.getVisitas());
		return dto;
	}
	
	public static ProdutoEntity dtoToEntity(ProdutoDTO dto) {
		ProdutoEntity entity = new ProdutoEntity();
		entity.setAnoLancamento(dto.getAnoLancamento());
		entity.setAutorArtista(dto.getAutorArtista());
		entity.setCategoria(CategoriaDtoToEntity(dto.getCategoria()));
		entity.setClassFiscal(dto.getClassFiscal());
		entity.setFornecedor(fornecedorDtoToEntity(dto.getFornecedor()));
		entity.setGenero(generoDtoToEntity(dto.getGenero()));
		entity.setIcms(dto.getIcms());
		entity.setId(dto.getId());
		entity.setIdioma(dto.getIdioma()); 
		entity.setIpi(dto.getIpi());
		entity.setPaisOrigem(dto.getPaisOrigem());
		entity.setPeso(dto.getPeso());
		entity.setProcedencia(dto.getProcedencia());
		entity.setResumoString(dto.getResumoString());
		entity.setStatus(dto.getStatus());
		entity.setTitulo(dto.getTitulo());
		entity.setTpProduto(tpProdutoDtoToEntity(dto.getTpProduto()));
		entity.setUnidade(dto.getUnidade());
		entity.setValor(dto.getValor());
		entity.setVendas(dto.getVendas());
		entity.setVisitas(dto.getVisitas());
		return entity;
	}
	
	public static CategoriaDTO categoriaEntityToDto(CategoriaEntity entity) {
		CategoriaDTO dto = new CategoriaDTO();
		dto.setDescricao(entity.getDescricao());
		dto.setGenero(entity.getGenero());
		dto.setId(entity.getId());
		return dto;
	}
	
	public static CategoriaEntity CategoriaDtoToEntity(CategoriaDTO dto) {
		CategoriaEntity entity = new CategoriaEntity();
		entity.setDescricao(dto.getDescricao());
		entity.setGenero(dto.getGenero());
		entity.setId(dto.getId());
		return entity;
	}
	
	public static FornecedorDTO fornecedorEntityToDTO(FornecedorEntity entity) {
		FornecedorDTO dto = new FornecedorDTO();
		dto.setCargo(entity.getCargo());
		dto.setCei(entity.getCei());
		dto.setCel(entity.getCel());
		dto.setCnpj(entity.getCnpj());
		dto.setContato(entity.getContato());
		dto.setDdd(entity.getDdd());
		dto.setEmail(entity.getEmail());
		dto.setFax(entity.getFax());
		dto.setId(entity.getId());
		dto.setInscEstadual(entity.getInscEstadual());
		dto.setInscMunicipal(entity.getInscMunicipal());
		dto.setNomeFantasia(entity.getNomeFantasia());
		dto.setRamal(entity.getRamal());
		dto.setRazaoSocial(entity.getRazaoSocial());
		dto.setTelOpcional(entity.getTelOpcional());
		dto.setTelPrincipal(entity.getTelPrincipal());
		return dto;
	}
	
	public static FornecedorEntity fornecedorDtoToEntity(FornecedorDTO dto) {
		FornecedorEntity entity = new FornecedorEntity();
		entity.setCargo(dto.getCargo());
		entity.setCei(dto.getCei());
		entity.setCel(dto.getCel());
		entity.setCnpj(dto.getCnpj());
		entity.setContato(dto.getContato());
		entity.setDdd(dto.getDdd());
		entity.setEmail(dto.getEmail());
		entity.setFax(dto.getFax());
		entity.setInscEstadual(dto.getInscEstadual());
		entity.setInscMunicipal(dto.getInscMunicipal());
		entity.setId(dto.getId());
		entity.setNomeFantasia(dto.getNomeFantasia());
		entity.setRamal(dto.getRamal());
		entity.setRazaoSocial(dto.getRazaoSocial());
		entity.setTelOpcional(dto.getTelOpcional());
		entity.setTelPrincipal(dto.getTelPrincipal());
		return entity;
	}
	
	public static GeneroDTO generoEntityToDto(GeneroEntity entity) {
		GeneroDTO dto = new GeneroDTO();
		dto.setDescricao(entity.getDescricao());
		dto.setTpProduto(entity.getTpProduto());
		dto.setId(entity.getId());
		return dto;
	}
	
	public static GeneroEntity generoDtoToEntity(GeneroDTO dto) {
		GeneroEntity entity = new GeneroEntity();
		entity.setDescricao(dto.getDescricao());
		entity.setTpProduto(dto.getTpProduto());
		entity.setId(dto.getId());
		return entity;
	}
	
	public static TipoProdutoDTO tpProdutoEntityToDto(TipoProdutoEntity entity) {
		TipoProdutoDTO dto = new TipoProdutoDTO();
		dto.setDescricao(entity.getDescricao());
		dto.setId(entity.getId());
		return dto;
	}
	
	public static TipoProdutoEntity tpProdutoDtoToEntity(TipoProdutoDTO dto) {
		TipoProdutoEntity entity = new TipoProdutoEntity();
		entity.setDescricao(dto.getDescricao());
		entity.setId(dto.getId());
		return entity;
	}
	
	public static CaracTpProdutoDTO caracTpProdutoEntityToDto(CaracTpProdutoEntity entity) {
		CaracTpProdutoDTO dto = new CaracTpProdutoDTO();
		dto.setDescricao(entity.getDescricao());
		dto.setId(entity.getId());
		dto.setTpProduto(entity.getTpProduto());
		return dto;
	}
	
	public static CaracTpProdutoEntity caracTpProdutoDtoToEntity(CaracTpProdutoDTO dto) {
		CaracTpProdutoEntity entity = new CaracTpProdutoEntity();
		entity.setDescricao(dto.getDescricao());
		entity.setId(dto.getId());
		entity.setTpProduto(dto.getTpProduto());
		return entity;
	}
	
	public static ConteudoProdutoDTO conteudoProdutoEntityToDto(ConteudoProdutoEntity entity) {
		ConteudoProdutoDTO dto = new ConteudoProdutoDTO();
		dto.setDescricao(entity.getDescricao());
		dto.setId(entity.getId());
		dto.setCaracTpProduto(caracTpProdutoEntityToDto(entity.getCaracTpProduto()));
		dto.setProduto(entityToDTO(entity.getProduto()));
		return dto;
	}
	
	public static ConteudoProdutoEntity conteudoProdutoDtoToEntity(ConteudoProdutoDTO dto) {
		ConteudoProdutoEntity entity = new ConteudoProdutoEntity();
		entity.setDescricao(dto.getDescricao());
		entity.setId(dto.getId());
		entity.setCaracTpProduto(caracTpProdutoDtoToEntity(dto.getCaracTpProduto()));
		entity.setProduto(dtoToEntity(dto.getProduto()));
		return entity;
	}

}