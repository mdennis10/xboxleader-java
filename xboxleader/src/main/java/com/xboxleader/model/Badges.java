package com.xboxleader.model;

public class Badges {
	private boolean xboxlaunchteam;
	private boolean nxelaunchteam;
	private boolean kinectlaunchteam;
	
	
	/**
	 * @return the xboxlaunchteam
	 */
	public boolean isXboxlaunchteam()
	{
		return xboxlaunchteam;
	}
	
	
	/**
	 * @param xboxlaunchteam the xboxlaunchteam to set
	 */
	public void setXboxlaunchteam(boolean xboxlaunchteam)
	{
		this.xboxlaunchteam = xboxlaunchteam;
	}
	
	
	/**
	 * @return the nxelaunchteam
	 */
	public boolean isNxelaunchteam() 
	{
		return nxelaunchteam;
	}
	
	
	/**
	 * @param nxelaunchteam the nxelaunchteam to set
	 */
	public void setNxelaunchteam(boolean nxelaunchteam)
	{
		this.nxelaunchteam = nxelaunchteam;
	}
	
	
	/**
	 * @return the kinectlaunchteam
	 */
	public boolean isKinectlaunchteam()
	{
		return kinectlaunchteam;
	}
	
	
	/**
	 * @param kinectlaunchteam the kinectlaunchteam to set
	 */
	public void setKinectlaunchteam(boolean kinectlaunchteam) 
	{
		this.kinectlaunchteam = kinectlaunchteam;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Badges [xboxlaunchteam=" + xboxlaunchteam + ", nxelaunchteam="
				+ nxelaunchteam + ", kinectlaunchteam=" + kinectlaunchteam
				+ "]";
	}
	
	
}//end Badges class
