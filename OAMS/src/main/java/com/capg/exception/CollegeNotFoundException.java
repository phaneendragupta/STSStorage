package com.capg.exception;

public class CollegeNotFoundException extends Exception{

	public CollegeNotFoundException() {
        super();
    }

    public CollegeNotFoundException(String message) {
        super(message);
    }

    public CollegeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public CollegeNotFoundException(Throwable cause) {
        super(cause);
    }

    protected CollegeNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
	
	

}
