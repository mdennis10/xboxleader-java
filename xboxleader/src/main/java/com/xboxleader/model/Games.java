package com.xboxleader.model;

import java.math.BigInteger;

public class Games {
	private BigInteger id;
	private boolean isapp;
	private String title;
	private Avatar artwork;


	/**
	 * @return the id
	 */
	public BigInteger getId() {
		return id;
	}
	
	
	/**
	 * @param id the id to set
	 */
	public void setId(BigInteger id) {
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
		StringBuilder builder = new StringBuilder();
		builder.append("Games [id=");
		builder.append(id);
		builder.append(", isapp=");
		builder.append(isapp);
		builder.append(", title=");
		builder.append(title);
		builder.append(", artwork=");
		builder.append(artwork);
		builder.append("]");
		return builder.toString();
	}
}//end Games class
