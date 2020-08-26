package com.kairos.ovni.persistence.repository.produto;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kairos.ovni.persistence.entity.produto.TipoProdutoEntity;

public interface TpProdutoRepository extends JpaRepository<TipoProdutoEntity, Integer>   {


	
}
