package com.xboxleader.request;

/**
 * Base Class for all HTTP Request
 * @author mario
 * 
 * @param <T>
 */
public abstract class HttpRequest <T> implements Request<T>{

	public abstract T execute();
	
}//end HttpRequest
