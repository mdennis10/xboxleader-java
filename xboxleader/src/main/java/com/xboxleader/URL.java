package com.xboxleader;

/**
 * URL Enum class.
 * @author mario
 */
public enum URL {
	BASE ("https://www.xboxleaders.com/api/2.0/");
	private String url;
	
	URL (String url)
	{
		this.url = url;
	}
	
	@Override
	public String toString() 
	{
		return url;
	}
}//end URL enum
