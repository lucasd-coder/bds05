package com.devsuperior.movieflix.controllers.exceptions;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OAuthCustomerError implements Serializable {

	private static final long serialVersionUID = 1L;

	private String error;

	@JsonProperty("error_descripton")
	private String errorDescripton;

	public OAuthCustomerError() {
	}

	public OAuthCustomerError(String error, String errorDescripton) {
		super();
		this.error = error;
		this.errorDescripton = errorDescripton;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getErrorDescripton() {
		return errorDescripton;
	}

	public void setErrorDescripton(String errorDescripton) {
		this.errorDescripton = errorDescripton;
	}

}
