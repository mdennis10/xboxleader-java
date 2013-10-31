package com.xboxleader.model;

import java.util.List;

public class AchievementData {
	private String gamertag,game,lastplayed;
	private int progress;
	private GamerScore gamerscore;
	private AchievementAttr achievement;
	private List<AchievementList> achievements;
	
	/**
	 * @return the gamertag
	 */
	public String getGamertag() 
	{
		return gamertag;
	}
	
	
	/**
	 * @param gamertag the gamertag to set
	 */
	public void setGamertag(String gamertag) 
	{
		this.gamertag = gamertag;
	}
	
	
	/**
	 * @return the game
	 */
	public String getGame() 
	{
		return game;
	}
	
	
	/**
	 * @param game the game to set
	 */
	public void setGame(String game) 
	{
		this.game = game;
	}
	
	
	/**
	 * @return the lastplayed
	 */
	public String getLastplayed() 
	{
		return lastplayed;
	}
	
	
	/**
	 * @param lastplayed the lastplayed to set
	 */
	public void setLastplayed(String lastplayed)
	{
		this.lastplayed = lastplayed;
	}
	
	
	/**
	 * @return the progress
	 */
	public int getProgress()
	{
		return progress;
	}
	
	
	/**
	 * @param progress the progress to set
	 */
	public void setProgress(int progress)
	{
		this.progress = progress;
	}
	
	
	/**
	 * @return the gamerscore
	 */
	public GamerScore getGamerscore()
	{
		return gamerscore;
	}
	
	
	/**
	 * @param gamerscore the gamerscore to set
	 */
	public void setGamerscore(GamerScore gamerscore) 
	{
		this.gamerscore = gamerscore;
	}
	
	
	/**
	 * @return the achievement
	 */
	public AchievementAttr getAchievement() 
	{
		return achievement;
	}
	
	/**
	 * @param achievement the achievement to set
	 */
	public void setAchievement(AchievementAttr achievement) 
	{
		this.achievement = achievement;
	}


	/**
	 * @return the achievements
	 */
	public List<AchievementList> getAchievements() {
		return achievements;
	}


	/**
	 * @param achievements the achievements to set
	 */
	public void setAchievements(List<AchievementList> achievements) {
		this.achievements = achievements;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AchievementData [gamertag=").append(gamertag)
				.append(", game=").append(game).append(", lastplayed=")
				.append(lastplayed).append(", progress=").append(progress)
				.append(", gamerscore=").append(gamerscore)
				.append(", achievement=").append(achievement)
				.append(", achievements=").append(achievements).append("]");
		return builder.toString();
	}
}//end AchievementData class
