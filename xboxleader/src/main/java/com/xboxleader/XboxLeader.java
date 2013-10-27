package com.xboxleader;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.xboxleader.model.Game;
import com.xboxleader.model.Profile;
import com.xboxleader.request.HttpGetRequest;
import com.xboxleader.request.Request;

public class XboxLeader {
	
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
			path = String.format("/profile.json?gamertag=%s", URLEncoder.encode(gamerTag, "utf-8"));
					
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		Request<Profile> request = new HttpGetRequest<Profile>(path, Profile.class);
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
			path = String.format("/games.json?gamertag=%s", URLEncoder.encode(gamerTag, "utf-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		Request<Game> request = new HttpGetRequest<Game>(path, Game.class);
		return request.execute();
	}//end getGames method
	
}//end XboxLeader class
