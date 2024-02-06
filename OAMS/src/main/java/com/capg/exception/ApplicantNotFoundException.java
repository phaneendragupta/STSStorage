

	
	package com.capg.exception;

	import org.springframework.http.HttpStatus;
	import org.springframework.web.bind.annotation.ResponseStatus;

	@ResponseStatus(value = HttpStatus.NOT_FOUND)

	public class ApplicantNotFoundException extends RuntimeException {
	private static final long serialVersionUID=1L;
		
		public ApplicantNotFoundException(String message) {
			super(message);
		}
		


	}


