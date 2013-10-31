package com.xboxleader.model;

public class FriendList {
	private String friend,lastseen,status;
	private int gamerscore;
	private boolean online;
	private GamerPic gamerpic;
	
	/**
	 * @return the friend
	 */
	public String getFriend() {
		return friend;
	}
	
	
	/**
	 * @param friend the friend to set
	 */
	public void setFriend(String friend) {
		this.friend = friend;
	}
	
	
	/**
	 * @return the lastseen
	 */
	public String getLastseen() {
		return lastseen;
	}
	
	
	/**
	 * @param lastseen the lastseen to set
	 */
	public void setLastseen(String lastseen) {
		this.lastseen = lastseen;
	}
	
	
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	
	
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
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
	 * @return the gamerpic
	 */
	public GamerPic getGamerpic() {
		return gamerpic;
	}
	
	
	/**
	 * @param gamerpic the gamerpic to set
	 */
	public void setGamerpic(GamerPic gamerpic) {
		this.gamerpic = gamerpic;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FriendList [friend=").append(friend)
				.append(", lastseen=").append(lastseen).append(", status=")
				.append(status).append(", gamerscore=").append(gamerscore)
				.append(", online=").append(online).append(", gamerpic=")
				.append(gamerpic).append("]");
		return builder.toString();
	}
	
	
}//end FriendList class
