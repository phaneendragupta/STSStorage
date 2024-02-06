package com.capg.exception;

import java.util.Date;

public class ErrorDetails {

	
	private Date timestamp;
    private String message;
    private String details;

    public ErrorDetails() {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    

	public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
         return message;
    }

    public String getDetails() {
         return details;
    }

	public void setStatus(int value) {
		// TODO Auto-generated method stub
		
	}



	public void setMessage(String defaultMessage) {
		// TODO Auto-generated method stub
		
	}



	public void setTimestamp(long currentTimeMillis) {
		// TODO Auto-generated method stub
		
	}
}