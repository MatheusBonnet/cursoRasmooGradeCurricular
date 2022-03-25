package com.rasmoo.cliente.escola.gradecurricular.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;


public class CursoException extends RuntimeException{

	private static final long serialVersionUID = 8042402636193525393L;
	
	private final HttpStatus httpStatus;
	
	public CursoException(final String mensagem, final HttpStatus httpStatus) {
		super(mensagem);
		this.httpStatus = httpStatus;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	
	
	
}
