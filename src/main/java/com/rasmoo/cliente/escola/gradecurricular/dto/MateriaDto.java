package com.rasmoo.cliente.escola.gradecurricular.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.springframework.hateoas.RepresentationModel;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = false)
public class MateriaDto extends RepresentationModel<MateriaDto>{
	
	private Long id;
	
	@NotBlank(message = "Informe o nome da matéria.")
	private String nome;
	
	@Min(value = 34, message = "Permitido o mínimo de 34 horas aula.")
	@Max(value = 102, message = "Permitido o máximo de 102 horas aula.")
	private int horas;
	
	@NotBlank(message = "Informe o código da matéria.")
	private String codigo;
	
	@Min(value = 1, message = "Permitido o mínimo de 1 vez ao ano.")
	@Max(value = 2, message = "Permitido o máximo de 2 vezes ao ano.")
	private int frequencia;

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

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}
	
	
}
