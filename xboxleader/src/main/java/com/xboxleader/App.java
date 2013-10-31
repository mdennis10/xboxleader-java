package com.xboxleader;

public class App 
{
    public static void main( String[] args )
    {
    	String gamerTag = "Major Nelson";
    	String gameId = "1297287449";

    	XboxLeader xboxLeader = new XboxLeader("a",Region.CANADA_EN);
    	System.out.println(xboxLeader.getAchievement(gamerTag, gameId));
    }
}
