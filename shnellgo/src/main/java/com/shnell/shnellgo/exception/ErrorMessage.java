package com.shnell.shnellgo.exception;

public class ErrorMessage {
	
	private int errorCode;
	
	private String message;

	public void setErrorCode(int value) {
		
		errorCode = value;
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getErrorCode() {
		return errorCode;
	}

}
