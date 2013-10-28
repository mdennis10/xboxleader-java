package com.xboxleader.request;

/**
 * Request Interface that all request class
 * should implement.
 * @author mario 
 * @param <T>
 */
public interface Request <T> {
	
	/**
	 * Executes a request
	 * @author Mario
	 * @return <T>
	 */
	public T execute ();
	
}//end Request interface
