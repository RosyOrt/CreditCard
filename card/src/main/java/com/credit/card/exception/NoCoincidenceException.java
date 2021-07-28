package com.credit.card.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class NoCoincidenceException extends RuntimeException {
	
	public NoCoincidenceException(String message) {
		super(message);
	}
	

}
