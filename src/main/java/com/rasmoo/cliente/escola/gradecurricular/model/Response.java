package com.rasmoo.cliente.escola.gradecurricular.model;

import org.springframework.hateoas.RepresentationModel;

import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = false)
public class Response<T> extends RepresentationModel<Response<T>>{
	
	private int statusCode;
	private T data;
	private long timeStamp;
	
	public Response(){
		this.timeStamp = System.currentTimeMillis();
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
	
}
