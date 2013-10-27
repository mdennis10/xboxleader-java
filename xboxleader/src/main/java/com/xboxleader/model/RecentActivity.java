package com.xboxleader.model;


public class RecentActivity {
	private int id;
	private boolean isapp;
	private String title;
	private Avatar artwork;
	
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


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RecentActivity [id=" + id + ", isapp=" + isapp + ", title="
				+ title + ", artwork=" + artwork + "]";
	}
	
}//end RecentActivity class
