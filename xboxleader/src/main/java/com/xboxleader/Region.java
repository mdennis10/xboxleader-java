package com.xboxleader;

public enum Region {
	AUSTRALIA ("en-AU"),
	UNITED_STATES ("en-US");
	private final String region;
	
	Region(String region) 
	{
		this.region = region;
	}
	
	@Override
	public String toString() 
	{
		return region;
	}
}//end Region enum
