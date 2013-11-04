package com.xboxleader;

/**
 * This interface is used as a callback
 * handler for asynchronous calls.
 * @author mario
 *
 * @param <T>
 */
public interface ResultListener <T>{

	public void response (T result);
}//end ResultListener interface
