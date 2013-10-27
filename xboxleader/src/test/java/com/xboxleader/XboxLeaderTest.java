package com.xboxleader;

import org.junit.Assert;
import org.junit.Test;

import com.xboxleader.model.Profile;


public class XboxLeaderTest {

	private XboxLeader xboxLeader = new XboxLeader();
	
	@Test
	public void getProfile ()
	{
		Profile profile = xboxLeader.getProfile("Major Nelson");
		Assert.assertNotNull(profile);
		Assert.assertNotNull(profile.getData());
		Assert.assertNotNull(profile.getData().getBadges());
		Assert.assertNotNull(profile.getData().getAvatar());
		Assert.assertNotNull(profile.getData().getRecentactivity());
	}//end getProfile method
	
}//end XboxLeaderTest class
