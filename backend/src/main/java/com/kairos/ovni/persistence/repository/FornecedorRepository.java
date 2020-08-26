package com.kairos.ovni.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kairos.ovni.persistence.entity.produto.ProdutoEntity;

public interface FornecedorRepository extends JpaRepository<ProdutoEntity, Integer>   {


}
