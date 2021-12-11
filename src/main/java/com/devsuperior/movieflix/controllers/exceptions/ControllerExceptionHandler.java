package com.devsuperior.movieflix.controllers.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.devsuperior.movieflix.services.exceptions.ForbiddenException;
import com.devsuperior.movieflix.services.exceptions.UnauthorizedException;

@ControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(UnauthorizedException.class)
	public ResponseEntity<OAuthCustomerError> unauthorized(UnauthorizedException e, HttpServletRequest request) {
		OAuthCustomerError err = new OAuthCustomerError("Unauthorized", e.getMessage());
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(err);
	}

	@ExceptionHandler(ForbiddenException.class)
	public ResponseEntity<OAuthCustomerError> forbidden(ForbiddenException e, HttpServletRequest request) {
		OAuthCustomerError err = new OAuthCustomerError("Forbidden", e.getMessage());
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body(err);
	}

}
