package com.xboxleader.model;

public class ProfileData {
	private String gamertag;
	private String tier;
	private int gamerscore;
	private int reputation;
	private String presence;
	private boolean online;
	private String motto;
	private String name;
	private String location;
	private String biography;
	private String freshness;
	
	
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
	 * @return the tier
	 */
	public String getTier() {
		return tier;
	}
	
	
	/**
	 * @param tier the tier to set
	 */
	public void setTier(String tier) {
		this.tier = tier;
	}
	
	
	/**
	 * @return the gamerscore
	 */
	public int getGamerscore() {
		return gamerscore;
	}
	
	/**
	 * @param gamerscore the gamerscore to set
	 */
	public void setGamerscore(int gamerscore) {
		this.gamerscore = gamerscore;
	}
	
	
	
	/**
	 * @return the reputation
	 */
	public int getReputation() {
		return reputation;
	}
	
	
	/**
	 * @param reputation the reputation to set
	 */
	public void setReputation(int reputation) {
		this.reputation = reputation;
	}
	
	/**
	 * @return the presence
	 */
	public String getPresence() {
		return presence;
	}
	
	/**
	 * @param presence the presence to set
	 */
	public void setPresence(String presence) {
		this.presence = presence;
	}
	
	
	/**
	 * @return the online
	 */
	public boolean isOnline() {
		return online;
	}
	
	/**
	 * @param online the online to set
	 */
	public void setOnline(boolean online) {
		this.online = online;
	}
	
	
	/**
	 * @return the motto
	 */
	public String getMotto() {
		return motto;
	}
	
	
	/**
	 * @param motto the motto to set
	 */
	public void setMotto(String motto) {
		this.motto = motto;
	}
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	
	
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	/**
	 * @return the biography
	 */
	public String getBiography() {
		return biography;
	}
	
	
	/**
	 * @param biography the biography to set
	 */
	public void setBiography(String biography) {
		this.biography = biography;
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


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProfileData [gamertag=" + gamertag + ", tier=" + tier
				+ ", gamerscore=" + gamerscore + ", reputation=" + reputation
				+ ", presence=" + presence + ", online=" + online + ", motto="
				+ motto + ", name=" + name + ", location=" + location
				+ ", biography=" + biography + ", freshness=" + freshness + "]";
	}
	
	
}//end ProfileData class
