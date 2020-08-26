package com.kairos.ovni.dto.produto;

import java.io.Serializable;

import com.kairos.ovni.dto.FornecedorDTO;

public class ProdutoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1179779067070382912L;
	
	private Integer id;
	private String titulo;
	private Double peso;
	private Double valor;
	private String unidade;
	private Integer ipi;
	private Integer icms;
	private Integer classFiscal;
	private String procedencia;
	private String paisOrigem;
	private Integer anoLancamento;
	private String autorArtista;
	private String idioma;
	private TipoProdutoDTO tpProduto;
	private GeneroDTO genero;
	private CategoriaDTO categoria;
	private FornecedorDTO fornecedor;
	private String resumoString;
	private Integer vendas;
	private Integer visitas;
	private Boolean status;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public Integer getIpi() {
		return ipi;
	}
	public void setIpi(Integer ipi) {
		this.ipi = ipi;
	}
	public Integer getIcms() {
		return icms;
	}
	public void setIcms(Integer icms) {
		this.icms = icms;
	}
	public Integer getClassFiscal() {
		return classFiscal;
	}
	public void setClassFiscal(Integer classFiscal) {
		this.classFiscal = classFiscal;
	}
	public String getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public String getPaisOrigem() {
		return paisOrigem;
	}
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	public Integer getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(Integer anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public String getAutorArtista() {
		return autorArtista;
	}
	public void setAutorArtista(String autorArtista) {
		this.autorArtista = autorArtista;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public TipoProdutoDTO getTpProduto() {
		return tpProduto;
	}
	public void setTpProduto(TipoProdutoDTO tpProduto) {
		this.tpProduto = tpProduto;
	}
	public GeneroDTO getGenero() {
		return genero;
	}
	public void setGenero(GeneroDTO genero) {
		this.genero = genero;
	}
	public CategoriaDTO getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaDTO categoria) {
		this.categoria = categoria;
	}
	public FornecedorDTO getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(FornecedorDTO fornecedor) {
		this.fornecedor = fornecedor;
	}
	public String getResumoString() {
		return resumoString;
	}
	public void setResumoString(String resumoString) {
		this.resumoString = resumoString;
	}
	public Integer getVendas() {
		return vendas;
	}
	public void setVendas(Integer vendas) {
		this.vendas = vendas;
	}
	public Integer getVisitas() {
		return visitas;
	}
	public void setVisitas(Integer visitas) {
		this.visitas = visitas;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
}
