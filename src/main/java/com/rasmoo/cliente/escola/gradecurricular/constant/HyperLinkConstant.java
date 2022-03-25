package com.rasmoo.cliente.escola.gradecurricular.constant;


public enum HyperLinkConstant {
	
	ATUALIZAR("UPDATE"),
	EXCLUIR("DELETE"),
	LISTAR("GET_ALL"),
	CONSULTAR("GET");
	
	private final String valor;
	
	private HyperLinkConstant(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}
	
	
	
}
