package com.rasmoo.cliente.escola.gradecurricular.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_curso")
public class CursoEntity implements Serializable{
	
private static final long serialVersionUID = -5115709874529054925L;
	
	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "id")
	private Long id;
	
	@JsonInclude(Include.NON_EMPTY)
	@Column(name = "nome")
	private String nome;
	
	@JsonInclude(Include.NON_EMPTY)
	@Column(name = "cod")
	private String codigo;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinColumn(name="materia_id")
	private List<MateriaEntity> materias;


	public CursoEntity() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public List<MateriaEntity> getMaterias() {
		return materias;
	}

	public void setMaterias(List<MateriaEntity> materias) {
		this.materias = materias;
	}
	
	
}
