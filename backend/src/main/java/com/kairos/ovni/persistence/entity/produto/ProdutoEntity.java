package com.kairos.ovni.persistence.entity.produto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.kairos.ovni.persistence.entity.FornecedorEntity;

@Entity
@SequenceGenerator(name = "sq_produto", sequenceName = "sq_produto", allocationSize = 1)
@Table(name = "produtos")
public class ProdutoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "_codigo")
	private Integer id;
	
	@Column(name = "_titulo")
	String titulo;
	@Column(name = "_pesokg")
	Double peso;
	@Column(name = "_valor")
	Double valor;
	@Column(name = "_unidade")
	String unidade;
	@Column(name = "_ipi")
	Integer ipi;
	@Column(name = "_icms")
	Integer icms;
	@Column(name = "_classfiscal")
	Integer classFiscal;
	@Column(name = "_procedencia")
	String procedencia;
	@Column(name = "_paisorigem")
	String paisOrigem;
	@Column(name = "_anolancamento")
	Integer anoLancamento;
	@Column(name = "_autorartista")
	String autorArtista;
	@Column(name = "_idioma")
	String idioma;
	@OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name = "_tipoproduto", insertable = true, updatable = true)
	@Fetch(FetchMode.JOIN)
	TipoProdutoEntity tpProduto;
	@OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name = "_genero", insertable = true, updatable = true)
	@Fetch(FetchMode.JOIN)
	GeneroEntity genero;
	@OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name = "_categoria", insertable = true, updatable = true)
	@Fetch(FetchMode.JOIN)
	CategoriaEntity categoria;
	@OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.PERSIST)
	@JoinColumn(name = "_fornecedor", insertable = true, updatable = true)
	@Fetch(FetchMode.JOIN)
	FornecedorEntity fornecedor;
	@Column(name = "_resumo")
	String resumoString;
	@Column(name = "_vendas")
	Integer vendas;
	@Column(name = "_visitas")
	Integer visitas;
	@Column(name = "_status")
	Boolean status;
	
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
	public TipoProdutoEntity getTpProduto() {
		return tpProduto;
	}
	public void setTpProduto(TipoProdutoEntity tpProduto) {
		this.tpProduto = tpProduto;
	}
	public GeneroEntity getGenero() {
		return genero;
	}
	public void setGenero(GeneroEntity genero) {
		this.genero = genero;
	}
	public CategoriaEntity getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaEntity categoria) {
		this.categoria = categoria;
	}
	public FornecedorEntity getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(FornecedorEntity fornecedor) {
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
