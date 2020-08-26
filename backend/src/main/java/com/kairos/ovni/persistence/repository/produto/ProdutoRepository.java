package com.kairos.ovni.persistence.repository.produto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kairos.ovni.persistence.entity.produto.ProdutoEntity;
import com.kairos.ovni.persistence.entity.produto.TipoProdutoEntity;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Integer>   {

	/**
	 * Lista todos os produtos que o titulo contenha o parametro informado
	 * List<ProdutoEntity>
	 * @param nome
	 * @return List<ProdutoEntity>
	 */
	public List<ProdutoEntity> findByStatusAndTituloIgnoreCaseContaining(Boolean status,String nome);
	
	/**
	 * Lista todos os produtos ordenados pelos mais vendidos
	 * @return List<ProdutoEntity>
	 */
	public List<ProdutoEntity> findTop2AllByStatusOrderByVendasDesc(Boolean status);

	/**
	 * Lista todos os produtos ordenados pelos mais visitados
	 * @return List<ProdutoEntity>
	 */
	public List<ProdutoEntity> findAllTop1ByStatusOrderByVisitasDesc(Boolean status);
	
	/**
	 * Lista os produtos de determinado tipo. 
	 * @param id
	 * @return
	 */
	public List<ProdutoEntity> findByTpProduto(TipoProdutoEntity tpProduto);
	
	
//	public TbIbSetPutaway findByWhIdAndInbIdAndItemIdAndLotNoAndFromCellIdAndToCellIdAndPalletStatusId(BigInteger whId, BigInteger inbId, BigInteger itemId, String lotNo, BigInteger fromCellId, BigInteger toCellId, Integer palletStatusId);
	
	
}
