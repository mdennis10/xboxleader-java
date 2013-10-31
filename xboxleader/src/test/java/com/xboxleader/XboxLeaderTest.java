package com.xboxleader;

import org.junit.Assert;
import org.junit.Test;

import com.xboxleader.model.Achievement;
import com.xboxleader.model.Friend;
import com.xboxleader.model.Game;
import com.xboxleader.model.Profile;


public class XboxLeaderTest {

	private XboxLeader xboxLeader = new XboxLeader();
	private String gamerTag = "Major Nelson";
	
	@Test
	public void getProfile ()
	{
		Profile profile = xboxLeader.getProfile(gamerTag);
		Assert.assertNotNull(profile);
		Assert.assertNotNull(profile.getData());
		Assert.assertNotNull(profile.getData().getBadges());
		Assert.assertNotNull(profile.getData().getAvatar());
		Assert.assertNotNull(profile.getData().getRecentactivity());
		Assert.assertNotNull(profile.getData().getRecentactivity());
	}//end getProfile method
	
	
	@Test
	public void getGames ()
	{
		Game games = xboxLeader.getGame(gamerTag);
		Assert.assertNotNull(games);
		Assert.assertNotNull(games.getData());
	}//end getGames method 
	
	
	@Test
	public void getAchievement ()
	{
		Achievement achievement = xboxLeader.getAchievement(gamerTag,"1297287449");
		Assert.assertNotNull(achievement);
		Assert.assertNotNull(achievement.getData());
	}//end getAchievement method
	
	
	@Test
	public void getFriend ()
	{
		Friend friend = xboxLeader.getFriend(gamerTag);
		Assert.assertNotNull(friend);
		Assert.assertNotNull(friend.getData());
		Assert.assertNotNull(friend.getData().getFriends());
		Assert.assertFalse(friend.getData().getFriends().isEmpty());
	}//end getFriend method
	
	
	@Test
	public void region ()
	{
		XboxLeader xboxLeader = new XboxLeader();
		Assert.assertEquals(Region.UNITED_STATES.toString(), xboxLeader.getRegion());
		
		xboxLeader.setRegion(Region.AUSTRALIA);
		Assert.assertEquals(Region.AUSTRALIA.toString(),xboxLeader.getRegion());
	}//end region method
	
}//end XboxLeaderTest class
