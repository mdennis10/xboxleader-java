package com.xboxleader.model;


public class RecentActivity {
	private int id;
	private boolean isapp;
	private String title;
	private Avatar artwork;
	private GamerScore gamerscore;
	private String lastplayed;
	private double progress;
	private Achievements achievements;
	
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
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	
	/**
	 * @return the isapp
	 */
	public boolean isIsapp() {
		return isapp;
	}
	
	
	/**
	 * @param isapp the isapp to set
	 */
	public void setIsapp(boolean isapp) {
		this.isapp = isapp;
	}
	
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
	
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	/**
	 * @return the artwork
	 */
	public Avatar getArtwork() {
		return artwork;
	}
	
	
	/**
	 * @param artwork the artwork to set
	 */
	public void setArtwork(Avatar artwork) {
		this.artwork = artwork;
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
	 * @return the lastplayed
	 */
	public String getLastplayed() {
		return lastplayed;
	}


	/**
	 * @param lastplayed the lastplayed to set
	 */
	public void setLastplayed(String lastplayed) {
		this.lastplayed = lastplayed;
	}


	/**
	 * @return the progress
	 */
	public double getProgress() {
		return progress;
	}


	/**
	 * @param progress the progress to set
	 */
	public void setProgress(double progress) {
		this.progress = progress;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RecentActivity [id=" + id + ", isapp=" + isapp + ", title="
				+ title + ", artwork=" + artwork + ", gamerscore=" + gamerscore
				+ ", lastplayed=" + lastplayed + ", progress=" + progress
				+ ", achievements=" + achievements + "]";
	}
	
}//end RecentActivity class
