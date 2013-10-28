package com.xboxleader.request;

/**
 * Base Class for all HTTP Request
 * @author mario
 * 
 * @param <T>
 */
public abstract class HttpRequest <T> implements Request<T>{

	/**
         * Executes HTTP Request. All base classes
         * must provide there own implementation
         * of this method.
         */
	public abstract T execute();
	
}//end HttpRequest
