package com.xboxleader;

import com.xboxleader.model.Achievement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String gamerTag = "Major Nelson";
    	String gameId = "1297287449";
    	XboxLeader xboxLeader = new XboxLeader();
    	Achievement achievement = xboxLeader.getAchievement(gamerTag, gameId);
    	System.out.println(achievement);
    }
}
