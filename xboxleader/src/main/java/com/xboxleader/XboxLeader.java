package com.xboxleader;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.xboxleader.model.Achievement;
import com.xboxleader.model.Game;
import com.xboxleader.model.Profile;
import com.xboxleader.request.HttpGetRequest;
import com.xboxleader.request.Request;

public class XboxLeader {
	private final String apiKey;
	private String region;
	
	public XboxLeader (String apiKey)
	{
		this.apiKey = apiKey;
	}
	
	
	public XboxLeader ()
	{
		apiKey = null;
	}//
	
	
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
		
		String path = null;
		try {
			path = String.format("/profile.json?gamertag=%s&region=%s", URLEncoder.encode(gamerTag, "utf-8"),getRegion());
					
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		Request<Profile> request = new HttpGetRequest<Profile>(getApiKey(),path, Profile.class);
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
		
		String path = null;
		try {
			path = String.format("/games.json?gamertag=%s&region=%s", URLEncoder.encode(gamerTag, "utf-8"),getRegion());
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		Request<Game> request = new HttpGetRequest<Game>(getApiKey(),path, Game.class);
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
		
		if (gameId == null)
			throw new NullPointerException("null argument supplied for gameId");
		String path = null;
		try {
			path = String.format("/achievements.json?gamertag=%s&region=%s&gameid=%s", 
								 URLEncoder.encode(gamerTag, "utf-8"),getRegion(),gameId);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		Request<Achievement> request = new HttpGetRequest<Achievement>(getApiKey(), path, Achievement.class);
		return request.execute();
	}//end getAchievement method
	
	
}//end XboxLeader class
