package com.kairos.ovni.persistence.entity.produto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "sq_categoria", sequenceName = "sq_categoria", allocationSize = 1)
@Table(name = "categoria")
public class CategoriaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "_codigo")
	private Integer id;
	@Column(name = "_descricao")
	String descricao;
	@Column(name = "_genero")
	Integer genero;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getGenero() {
		return genero;
	}
	public void setGenero(Integer genero) {
		this.genero = genero;
	}

}
