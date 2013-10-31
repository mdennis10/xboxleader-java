package com.xboxleader.model;

import java.util.List;

public class FriendData {
	private int total,totalonline,totaloffline;
	private List<FriendList> friends;
	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}
	
	
	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}
	
	
	/**
	 * @return the totalonline
	 */
	public int getTotalonline() {
		return totalonline;
	}
	
	
	/**
	 * @param totalonline the totalonline to set
	 */
	public void setTotalonline(int totalonline) {
		this.totalonline = totalonline;
	}
	
	
	/**
	 * @return the totaloffline
	 */
	public int getTotaloffline() {
		return totaloffline;
	}
	
	
	/**
	 * @param totaloffline the totaloffline to set
	 */
	public void setTotaloffline(int totaloffline) {
		this.totaloffline = totaloffline;
	}
	
	

	/**
	 * @return the friends
	 */
	public List<FriendList> getFriends() {
		return friends;
	}
	
	
	/**
	 * @param friends the friends to set
	 */
	public void setFriends(List<FriendList> friends) {
		this.friends = friends;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FriendData [total=").append(total)
				.append(", totalonline=").append(totalonline)
				.append(", totaloffline=").append(totaloffline)
				.append(", friends=").append(friends).append("]");
		return builder.toString();
	}

}//end FriendDate class
