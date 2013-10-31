package com.xboxleader.model;

public class AchievementList {
	private int id,gamerscore;
	private String title,description,unlockdate;
	private boolean secret,unlock;
	
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	/**
	 * @return the unlockdate
	 */
	public String getUnlockdate() {
		return unlockdate;
	}
	
	
	/**
	 * @param unlockdate the unlockdate to set
	 */
	public void setUnlockdate(String unlockdate) {
		this.unlockdate = unlockdate;
	}
	
	
	/**
	 * @return the secret
	 */
	public boolean isSecret() {
		return secret;
	}
	
	
	/**
	 * @param secret the secret to set
	 */
	public void setSecret(boolean secret) {
		this.secret = secret;
	}
	
	
	/**
	 * @return the unlock
	 */
	public boolean isUnlock() {
		return unlock;
	}
	
	
	/**
	 * @param unlock the unlock to set
	 */
	public void setUnlock(boolean unlock) {
		this.unlock = unlock;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AchievementList [id=").append(id)
				.append(", gamerscore=").append(gamerscore).append(", title=")
				.append(title).append(", description=").append(description)
				.append(", unlockdate=").append(unlockdate).append(", secret=")
				.append(secret).append(", unlock=").append(unlock).append("]");
		return builder.toString();
	}
	
	
}//end AchievementList class
