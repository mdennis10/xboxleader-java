package com.xboxleader;

/**
 * URL Enum class.
 * @author mario
 */
public enum URL {
	MASHAPE ("https://xboxleaders.p.mashape.com/2.0/%s"),
	BASE ("https://www.xboxleaders.com/api/2.0/%s");
	private String url;
	
	URL (String url)
	{
		this.url = url;
	}//end constructor
	
	@Override
	public String toString() 
	{
		return url;
	}//end toString method
	
}//end URL enum
