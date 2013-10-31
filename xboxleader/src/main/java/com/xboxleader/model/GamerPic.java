package com.xboxleader.model;

public class GamerPic {
	private String large,small;

	/**
	 * @return the large
	 */
	public String getLarge() {
		return large;
	}

	/**
	 * @param large the large to set
	 */
	public void setLarge(String large) {
		this.large = large;
	}

	/**
	 * @return the small
	 */
	public String getSmall() {
		return small;
	}

	/**
	 * @param small the small to set
	 */
	public void setSmall(String small) {
		this.small = small;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GamerPic [large=").append(large).append(", small=")
				.append(small).append("]");
		return builder.toString();
	}
	
	
}//end GamerPic class
