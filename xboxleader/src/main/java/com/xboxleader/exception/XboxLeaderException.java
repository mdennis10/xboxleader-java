package com.xboxleader.exception;

public class XboxLeaderException extends RuntimeException{
	private static final long serialVersionUID = -7540554363142297342L;
	private final String message;
	
	/**
	 * Default Constructor
	 * @author mario
	 * @param message
	 */
	public XboxLeaderException(String message) 
	{
		this.message = message;
	}//end constructor
	
	@Override
	public String getMessage() 
	{
		return message;
	}//end getMessage method
}//end XboxLeaderException class
