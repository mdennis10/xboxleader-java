package com.xboxleader;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.xboxleader.model.Achievement;
import com.xboxleader.model.Friend;
import com.xboxleader.model.Game;
import com.xboxleader.model.Profile;
import com.xboxleader.request.HttpGetRequest;
import com.xboxleader.request.Request;

public class XboxLeader {
	private final String apiKey;
	private String region;
	
	/**
	 * XboxLeader Overrided Constructor. 
	 * [Note] By using this contructor
	 * all API calls will be to Mashape.
	 * @author mario
	 * @param apiKey
	 * @param region
	 */
	public XboxLeader (String apiKey,Region region)
	{
		this.apiKey = apiKey;
		this.region = region.toString();
	}//end Overrided constructor 
	
	
	/**
	 * XboxLeader Overrided Constructor. 
	 *[Note] By using this contructor
	 * all API calls will be to Mashape.
	 * @author mario
	 * @param apiKey
	 */
	public XboxLeader (String apiKey)
	{
		this.apiKey = apiKey;
	}//end Overrided constructor
	
	
	/**
	 * Default XboxLeader Constructor.
	 * [Note] By using this constructor
	 * all Api class will be to xboxleaders.com
	 * .Using this is not recommended for production
	 * usage.
	 */
	public XboxLeader ()
	{
		apiKey = null;
	}//end Default construtor
	
	
	/**
	 * Set region
	 * @param region
	 */
	public void setRegion (Region region)
	{
		this.region = region.toString();
	}//end getRegion method
	
	
	/**
	 * Gets region.[Note]
	 * @author mario
	 * @return
	 */
	public String getRegion ()
	{
		return (region == null)? "en-US" : region;
	}//end getRegion method 
	
	
	
	/**
	 * @return the apiKey
	 */
	public String getApiKey()
	{
		return apiKey;
	}//end getApiKey method



	/**
	 * Get Xbox Live Profile
	 * @author Mario 
	 * @param gamerTag
	 * @return Profile
	 */
	public Profile getProfile (String gamerTag)
	{
		if (gamerTag == null)
			throw new NullPointerException("null argument supplied for gamertag");
		
		if (gamerTag.isEmpty())
			throw new IllegalArgumentException("GamerTag is empty");
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("gamertag", gamerTag);
		map.put(region, getRegion());
		
		Request<Profile> request = new HttpGetRequest<Profile>(getApiKey(),buildPath(map,"/profile.json"), Profile.class);
		return request.execute();
	}//end getProfile method
	
	
	
	/**
	 * Get Xbox Live Games.
	 * @author Mario
	 * @param gamerTag
	 * @return Game
	 */
	public Game getGame (String gamerTag)
	{
		if (gamerTag == null)
			throw new NullPointerException("null argument supplied for gamertag");
		
		if (gamerTag.isEmpty())
			throw new IllegalArgumentException("GamerTag is empty");

		Map<String, String> map = new HashMap<String, String>();
		map.put("gamertag", gamerTag);
		map.put("region", getRegion());
		
		Request<Game> request = new HttpGetRequest<Game>(getApiKey(),buildPath(map, "/games.json"), Game.class);
		return request.execute();
	}//end getGames method
	
	
	
	/**
	 * Get Xbox Live Achievements.
	 * @author Mario
	 * @param gamerTag
	 * @return Achievement
	 */
	public Achievement getAchievement (String gamerTag,String gameId)
	{
		if (gamerTag == null)
			throw new NullPointerException("null argument supplied for gamertag");
		
		if (gamerTag.isEmpty())
			throw new IllegalArgumentException("GamerTag is empty");
		
		if (gameId == null)
			throw new NullPointerException("null argument supplied for gameId");
		
		if (gameId.isEmpty())
			throw new IllegalArgumentException("GameId is empty");
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("gamertag", gamerTag);
		map.put("gameid", gameId);
		map.put("region",getRegion());
		
		Request<Achievement> request = new HttpGetRequest<Achievement>(getApiKey(), buildPath(map, "/achievements.json"), Achievement.class);
		return request.execute();
	}//end getAchievement method
	
	
	/**
	 * Get Xbox Live Friends.
	 * @author Mario
	 * @param gamerTag
	 * @return Friend 
	 */
	public Friend getFriend (String gamerTag)
	{
		if (gamerTag == null)
			throw new NullPointerException("null argument supplied for gamertag");
		
		if (gamerTag.isEmpty())
			throw new IllegalArgumentException("GamerTag is empty");
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("gamertag", gamerTag);
		map.put("region", getRegion());
		
		Request<Friend> request = new HttpGetRequest<Friend>(getApiKey(), buildPath(map, "/friends.json"), Friend.class);
		return request.execute();
	}//end getFriend method
	
	
	/**
	 * Build URL path need for request.
	 * @author mario
	 * @param Map<String,String>
	 * @param path
	 */
	private String buildPath (Map<String, String> map,String path)
	{
		StringBuffer buffer = new StringBuffer(path).append("?");
		
		//cycles through all Map Entries and build up URL
		for (Entry<String,String> entry:map.entrySet())
		{
			buffer.append(entry.getKey()).append("=");
			//encodes Map values to UTF-8
			try {
				buffer.append(URLEncoder.encode(entry.getValue(), "utf-8")).append("&");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		return buffer.toString();
	}//end buildPath method
	
}//end XboxLeader class
