package com.kairos.ovni.persistence.entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "sq_fornecedores", sequenceName = "sq_fornecedores", allocationSize = 1)
@Table(name = "fornecedores")
public class FornecedorEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "_codigo")
	private Integer id;
	@Column(name = "_nomefantasia")
	private String nomeFantasia;
	@Column(name = "_razaosocial")
	private String razaoSocial;
	@Column(name = "_cnpj")
	private BigInteger cnpj;
	@Column(name = "_inscrestadual")
	private BigInteger inscEstadual;
	@Column(name = "_cei")
	private BigInteger cei;
	@Column(name = "_inscrmunicipal")
	private BigInteger inscMunicipal;
	@Column(name = "_contato")
	private String contato;
	@Column(name = "_cargo")
	private String cargo;
	@Column(name = "_ddd")
	private Integer ddd;
	@Column(name = "_telefoneprincipal")
	private Integer telPrincipal;
	@Column(name = "_ramal")
	private Integer ramal;
	@Column(name = "_telefoneopcional")
	private Integer telOpcional;
	@Column(name = "_fax")
	private Integer fax;
	@Column(name = "_celular")
	private Integer cel;
	@Column(name = "_email")
	private String email;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public BigInteger getCnpj() {
		return cnpj;
	}
	public void setCnpj(BigInteger cnpj) {
		this.cnpj = cnpj;
	}
	public BigInteger getInscEstadual() {
		return inscEstadual;
	}
	public void setInscEstadual(BigInteger inscEstadual) {
		this.inscEstadual = inscEstadual;
	}
	public BigInteger getCei() {
		return cei;
	}
	public void setCei(BigInteger cei) {
		this.cei = cei;
	}
	public BigInteger getInscMunicipal() {
		return inscMunicipal;
	}
	public void setInscMunicipal(BigInteger inscMunicipal) {
		this.inscMunicipal = inscMunicipal;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Integer getDdd() {
		return ddd;
	}
	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}
	public Integer getTelPrincipal() {
		return telPrincipal;
	}
	public void setTelPrincipal(Integer telPrincipal) {
		this.telPrincipal = telPrincipal;
	}
	public Integer getRamal() {
		return ramal;
	}
	public void setRamal(Integer ramal) {
		this.ramal = ramal;
	}
	public Integer getTelOpcional() {
		return telOpcional;
	}
	public void setTelOpcional(Integer telOpcional) {
		this.telOpcional = telOpcional;
	}
	public Integer getFax() {
		return fax;
	}
	public void setFax(Integer fax) {
		this.fax = fax;
	}
	public Integer getCel() {
		return cel;
	}
	public void setCel(Integer cel) {
		this.cel = cel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
