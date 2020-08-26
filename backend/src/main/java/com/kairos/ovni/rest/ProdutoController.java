package com.kairos.ovni.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kairos.ovni.business.IProduto;
import com.kairos.ovni.dto.produto.ProdutoDTO;

@CrossOrigin(origins  = "*")
@RestController
@RequestMapping("/produto")
public class ProdutoController {
	
	@Autowired
	IProduto produto;
	
	/**
	 * Servico que lista todos os produtos cadastrados.
	 * @return List<ProdutoDTO>
	 */
	@RequestMapping(value="/listar", method = RequestMethod.GET,  produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<ProdutoDTO> listar(){	
		return produto.listarProdutos();
	}
	
	/**
	 * Serviço que salva um novo cliente.
	 * @param req
	 * @param clienteDTO
	 * @return @ResponseBody
	 */
	@RequestMapping(value="/buscarPorNome", method = RequestMethod.GET,  produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<ProdutoDTO> buscarPorNome(String nome){	
		return produto.buscarPorNome(nome);
	}
	
	/**
	 * Serviço que salva um novo cliente.
	 * @param req
	 * @param clienteDTO
	 * @return @ResponseBody
	 */
	@RequestMapping(value="/buscarPorTipo", method = RequestMethod.GET,  produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<ProdutoDTO> buscarPorTipo(Integer id){	
		return produto.buscarPorTipo(id);
	}
	
	/**
	 * Serviço que salva um novo cliente.
	 * @param req
	 * @param Integer Id
	 * @return @ResponseBody
	 */
	@RequestMapping(value="/buscarPorId", method = RequestMethod.GET,  produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ProdutoDTO buscarPorId(Integer id){	

		return produto.buscarPorId(id);
	}
	
	/**
	 * Serviço que salva/altera um produto.
	 * @param req
	 * @param clienteDTO
	 * @return @ResponseBody
	 */
	@RequestMapping(value="/salvar", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ProdutoDTO salvar(@RequestBody ProdutoDTO dto){	
		return produto.salvarProduto(dto);
	}

}
