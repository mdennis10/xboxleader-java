package com.xboxleader.model;

public class AchievementAttr {
	private int current,total;

	/**
	 * @return the current
	 */
	public int getCurrent() {
		return current;
	}

	/**
	 * @param current the current to set
	 */
	public void setCurrent(int current) {
		this.current = current;
	}

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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Achievements [current=" + current + ", total=" + total + "]";
	}
	
	
}//end Achievements class
