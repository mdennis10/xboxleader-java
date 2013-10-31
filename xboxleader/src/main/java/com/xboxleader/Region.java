package com.xboxleader;

/**
 * 
 * Region enum class
 * @author mario
 */
public enum Region {
	AUSTRALIA ("en-AU"),
	CANADA_EN("en-CA"),
	CANADA_FR ("fr-CA"),
	DENMARK("da-DA"),
	FRANCE("fr-FR"),
	GREECE ("el-GR"),
	ISRAEL ("he-IL"),
	JAPAN ("ja-JP"),
	MEXICO ("es-MX"),
	POLISH ("pl-PL"),
	SLOVAKIA ("sk-SK"),
	SPAIN ("es-ES"),
	SWITZERLAND_GERMAN ("de-CH"),
	TAIWAN ("zh-TW"),
	BELGIUM ("nl-BE"),
	BRAZIL ("br-BR"),
	CHILE ("es-CL"),
	CZECH_REPUBLIC ("cs-CZ"),
	FINLAND ("fi-FI"),
	GERMANY ("de-DE"),
	HONG_KONG ("zh-HK"),
	HUNGARY ("hu-HU"),
	ITALY ("it-IT"),
	KOREAN ("ko-KR"),
	NETHERLANDS ("nl-NL"),
	NORWAY ("nb-NO"),
	RUSSIAN ("ru-RU"),
	SWEDEN ("sv-SE"),
	SWITZERLAND_FRENCH ("fr-CH"),
	TURKEY ("tr-TR"),
	UNITED_KINGDOM ("en-GB"),
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
