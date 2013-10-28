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
	
	@Override
	public T execute() 
	{
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet get = new HttpGet(String.format(URL.BASE.toString(), path));
		
		if (apiKey != null)
			get.addHeader("X-Mashape-Authorization", apiKey);
		try 
		{
			HttpResponse response = client.execute(get);
			if (response.getStatusLine().getStatusCode() == 200)
			{
				String result = EntityUtils.toString(response.getEntity());
				return new Gson().fromJson(result, clazz);
			}
			else
				new Exception (response.getStatusLine()+ ": " + EntityUtils.toString(response.getEntity()));
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}//end execute method
	
	
}//end HttpGetRequest class
