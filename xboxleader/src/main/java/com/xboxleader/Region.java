package com.xboxleader;

/**
 * 
 * Region enum class
 * @author mario
 */
public enum Region {
	AUSTRALIA ("en-AU"),
	UNITED_STATES ("en-US");
	private final String region;
	
	Region(String region) 
	{
		this.region = region;
	}//end constructor
	
	@Override
	public String toString() 
	{
		return region;
	}//end toString method
}//end Region enum
