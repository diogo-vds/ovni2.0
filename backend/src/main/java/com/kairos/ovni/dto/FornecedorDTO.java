package com.kairos.ovni.dto;

import java.io.Serializable;
import java.math.BigInteger;

public class FornecedorDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8210382335875467720L;
	
	private String nomeFantasia;
	private String razaoSocial;
	private BigInteger cnpj;
	private BigInteger inscEstadual;
	private BigInteger cei;
	private BigInteger inscMunicipal;
	private String contato;
	private String cargo;
	private Integer ddd;
	private Integer telPrincipal;
	private Integer ramal;
	private Integer telOpcional;
	private Integer fax;
	private Integer cel;
	private String email;
	private Integer id;
	
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}
