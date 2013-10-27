package com.xboxleader.model;

import java.util.List;

public class GameData {
	private int totalgames,progress;
	private String gamertag,freshness;
	private GamerScore gamerscore;
	private Achievements achievements;
	private List<Games> games;

	

	/**
	 * @return the totalgames
	 */
	public int getTotalgames() {
		return totalgames;
	}
	
	
	/**
	 * @param totalgames the totalgames to set
	 */
	public void setTotalgames(int totalgames) {
		this.totalgames = totalgames;
	}
	
	
	/**
	 * @return the progress
	 */
	public int getProgress() {
		return progress;
	}
	
	
	/**
	 * @param progress the progress to set
	 */
	public void setProgress(int progress) {
		this.progress = progress;
	}
	
	
	
	/**
	 * @return the gamertag
	 */
	public String getGamertag() {
		return gamertag;
	}
	
	
	/**
	 * @param gamertag the gamertag to set
	 */
	public void setGamertag(String gamertag) {
		this.gamertag = gamertag;
	}


	/**
	 * @return the freshness
	 */
	public String getFreshness() {
		return freshness;
	}


	/**
	 * @param freshness the freshness to set
	 */
	public void setFreshness(String freshness) {
		this.freshness = freshness;
	}


	/**
	 * @return the gamerscore
	 */
	public GamerScore getGamerscore() {
		return gamerscore;
	}


	/**
	 * @param gamerscore the gamerscore to set
	 */
	public void setGamerscore(GamerScore gamerscore) {
		this.gamerscore = gamerscore;
	}


	/**
	 * @return the achievements
	 */
	public Achievements getAchievements() {
		return achievements;
	}


	/**
	 * @param achievements the achievements to set
	 */
	public void setAchievements(Achievements achievements) {
		this.achievements = achievements;
	}
	

	/**
	 * @return the games
	 */
	public List<Games> getGames() {
		return games;
	}


	/**
	 * @param games the games to set
	 */
	public void setGames(List<Games> games) {
		this.games = games;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GameData [totalgames=" + totalgames + ", progress=" + progress
				+ ", gamertag=" + gamertag + ", freshness=" + freshness
				+ ", gamerscore=" + gamerscore + ", achievements="
				+ achievements + ", games=" + games + "]";
	}
	
}//end GameData class
