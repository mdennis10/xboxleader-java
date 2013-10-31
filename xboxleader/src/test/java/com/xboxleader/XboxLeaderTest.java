package com.xboxleader;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.omg.CORBA.PUBLIC_MEMBER;

import com.xboxleader.model.Achievement;
import com.xboxleader.model.Friend;
import com.xboxleader.model.Game;
import com.xboxleader.model.Profile;


public class XboxLeaderTest {

	private XboxLeader xboxLeader = new XboxLeader();
	private String gamerTag = "Major Nelson";
	@Rule public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void getProfile ()
	{
		Profile profile = xboxLeader.getProfile(gamerTag);
		Assert.assertNotNull(profile);
		Assert.assertNotNull(profile.getData());
		Assert.assertNotNull(profile.getData().getBadges());
		Assert.assertNotNull(profile.getData().getAvatar());
		Assert.assertNotNull(profile.getData().getRecentactivity());
		Assert.assertFalse(profile.getData().getRecentactivity().isEmpty());
		
		/*
		 * test that IllegalArgumentException is 
		 * thrown when empty gamerTag supplied
		 */
		exception.expect(IllegalArgumentException.class);
		xboxLeader.getProfile("");
		
		/*
		 * test that NullPointerException is 
		 * thrown when null gamerTag supplied
		 */
		exception.expect(NullPointerException.class);
		xboxLeader.getProfile(null);
		
		/*
		 * test that code don't break if invalid gamerTag
		 */
		profile = xboxLeader.getProfile("daqdqweqweqw");
		Assert.assertNotNull(profile);
		Assert.assertEquals("error", profile.getStatus());
		exception = ExpectedException.none();
	}//end getProfile method
	
	
	@Test
	public void getGames ()
	{
		Game games = xboxLeader.getGame(gamerTag);
		Assert.assertNotNull(games);
		Assert.assertNotNull(games.getData());
		Assert.assertNotNull(games.getData().getGames());
		Assert.assertFalse(games.getData().getGames().isEmpty());
		
		/*
		 * test that IllegalArgumentException is 
		 * thrown when empty gamerTag supplied
		 */
		exception.expect(IllegalArgumentException.class);
		xboxLeader.getGame("");
		
		/*
		 * test that NullPointerException is 
		 * thrown when null gamerTag supplied
		 */
		exception.expect(NullPointerException.class);
		xboxLeader.getGame(null);
		
		/*
		 * test that code don't break if invalid gamerTag
		 */
		games = xboxLeader.getGame("daqdqweqweqw");
		Assert.assertNotNull(games);
		Assert.assertEquals("error", games.getStatus());
		exception = ExpectedException.none();
	}//end getGames method 
	
	
	@Test
	public void getAchievement ()
	{
		Achievement achievement = xboxLeader.getAchievement(gamerTag,"1297287449");
		Assert.assertNotNull(achievement);
		Assert.assertNotNull(achievement.getData());
		Assert.assertNotNull(achievement.getData().getAchievements());
		Assert.assertFalse(achievement.getData().getAchievements().isEmpty());
		
		/*
		 * test that IllegalArgumentException is 
		 * thrown when empty gamerTag supplied
		 */
		exception.expect(IllegalArgumentException.class);
		xboxLeader.getAchievement("", "");
		
		/*
		 * test that NullPointerException is 
		 * thrown when null gamerTag supplied
		 */
		exception.expect(NullPointerException.class);
		xboxLeader.getAchievement(null, null);
		
		/*
		 * test that code don't break if invalid gamerTag
		 * or gamerId is supplied
		 */
		achievement = xboxLeader.getAchievement("daqdqweqweqw","1297287449");
		Assert.assertNotNull(achievement);
		Assert.assertEquals("error", achievement.getStatus());
		
		achievement = xboxLeader.getAchievement(gamerTag, "asdasd1212");
		Assert.assertNotNull(achievement);
		Assert.assertEquals("error", achievement.getStatus());
		exception = ExpectedException.none();
	}//end getAchievement method
	
	
	@Test
	public void getFriend ()
	{
		Friend friend = xboxLeader.getFriend(gamerTag);
		Assert.assertNotNull(friend);
		Assert.assertNotNull(friend.getData());
		Assert.assertNotNull(friend.getData().getFriends());
		Assert.assertFalse(friend.getData().getFriends().isEmpty());
		
		/*
		 * test that IllegalArgumentException is 
		 * thrown when empty gamerTag supplied
		 */
		exception.expect(IllegalArgumentException.class);
		xboxLeader.getFriend("");
		
		/*
		 * test that NullPointerException is 
		 * thrown when null gamerTag supplied
		 */
		exception.expect(NullPointerException.class);
		xboxLeader.getFriend(null);
		
		/*
		 * test that code don't break if invalid gamerTag
		 */
		friend = xboxLeader.getFriend("daqdqweqweqw");
		Assert.assertNotNull(friend);
		Assert.assertEquals("error", friend.getStatus());
		exception = ExpectedException.none();
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
