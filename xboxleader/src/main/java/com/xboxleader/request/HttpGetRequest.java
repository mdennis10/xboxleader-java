package com.xboxleader.request;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;
import com.xboxleader.URL;
import com.xboxleader.exception.XboxLeaderException;

/**
 * HttpGetRequest is used to execute a HTTP
 * Request using the HTTP GET method. This class 
 * is thread-safe and cannot be sub-classed.
 * @author mario
 *
 * @param <T>
 */
public final class HttpGetRequest<T> extends HttpRequest<T> {
	private final String path;
	private final Class<T> clazz;
	private final String apiKey;
	
	public HttpGetRequest(String apiKey,String path,Class<T> clazz) 
	{
		this.apiKey = apiKey;
		this.path = path;
		this.clazz = clazz;
	}//end constructor
	
	
	/**
	 * Executes Http GET request
	 * @author mario
	 */
	@Override
	public T execute() 
	{
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet get = null;
		
		/*
		 * Add Mashape API and adjust
		 * request to Mashape.
		 */
		if (apiKey != null)
		{
			get = new HttpGet(String.format(URL.MASHAPE.toString(), path));
			get.addHeader("X-Mashape-Authorization", apiKey);
		}//end if
		else
			get = new HttpGet(String.format(URL.BASE.toString(), path));
		try 
		{
			HttpResponse response = client.execute(get);
			
			if (response.getStatusLine().getStatusCode() == 200)
			{
				String result = EntityUtils.toString(response.getEntity());
				return new Gson().fromJson(result, clazz);
			}
			if (response.getStatusLine().getStatusCode() >= 501 && response.getStatusLine().getStatusCode() <= 503)
			{
				String result = EntityUtils.toString(response.getEntity());
				return new Gson().fromJson(result, clazz);
			}
			
			else //throws exception when unsuccessful response returned
			{
				StringBuilder builder = new StringBuilder(response.getStatusLine().toString());
				builder.append(EntityUtils.toString(response.getEntity()));
				throw new XboxLeaderException(builder.toString());
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}//end execute method
	
}//end HttpGetRequest class
