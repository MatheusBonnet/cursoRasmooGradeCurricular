package com.rasmoo.cliente.escola.gradecurricular.model;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;


public class CursoModel {
	
	private Long id;
	
	@NotBlank(message = "nome deve ser preenchido")
	@Size(min = 10, max = 30)
	private String nome;
	
	@NotBlank(message = "código deve ser preenchido")
	@Size(min = 2, max = 5)
	private String codCurso;
	
	private List<Long> materias;

	public CursoModel(Long id, @NotBlank(message = "nome deve ser preenchido") @Size(min = 10, max = 30) String nome,
			@NotBlank(message = "código deve ser preenchido") @Size(min = 2, max = 5) String codCurso,
			List<Long> materias) {
		super();
		this.id = id;
		this.nome = nome;
		this.codCurso = codCurso;
		this.materias = materias;
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

	public String getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(String codCurso) {
		this.codCurso = codCurso;
	}

	public List<Long> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Long> materias) {
		this.materias = materias;
	}
	
	
}
