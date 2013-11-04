package com.xboxleader;

import com.xboxleader.request.Request;

/**
 * This class executes a Request
 * within a new thread then pass
 * result to callback handler
 * @author mario
 *
 * @param <T>
 */
public final class ThreadClient <T> {
	private final Request<T> request;
	private final ResultListener<T> listener;
	
	/**
	 * Default Constructor
	 * @author mario
	 * @param request
	 * @param listener
	 */
	protected ThreadClient (Request<T> request, ResultListener<T> listener)
	{
		this.request = request;
		this.listener = listener;
	}//end constructor
	
	/**
	 * Executes request in a new thread.
	 * @author mario
	 */
	public void execute ()
	{
		Runnable runnable = new Runnable() 
		{
			public void run() 
			{
				T result = request.execute();
				listener.response(result);
			}
		};
		new Thread (runnable).start();;
	}//end execute method
	
}//end ThreadClient class
