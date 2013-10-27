package com.xboxleader.model;

public class Profile {
	private String succes;
	private String version;
	private double runtime;
	/**
	 * @return the succes
	 */
	public String getSucces() 
	{
		return succes;
	}
	
	
	/**
	 * @param succes the succes to set
	 */
	public void setSucces(String succes) 
	{
		this.succes = succes;
	}
	
	
	/**
	 * @return the version
	 */
	public String getVersion() 
	{
		return version;
	}
	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) 
	{
		this.version = version;
	}
	
	
	/**
	 * @return the runtime
	 */
	public double getRuntime()
	{
		return runtime;
	}
	
	
	/**
	 * @param runtime the runtime to set
	 */
	public void setRuntime(double runtime) 
	{
		this.runtime = runtime;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Profile [succes=" + succes + ", version=" + version
				+ ", runtime=" + runtime + "]";
	}
	

	
	
}
