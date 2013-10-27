package com.xboxleader.model;

public class Profile {
	private String status;
	private String version;
	private double runtime;
	private ProfileData data;
	
	
	/**
	 * @return the status
	 */
	public String getStatus() 
	{
		return status;
	}
	
	
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) 
	{
		this.status = status;
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


	/**
	 * @return the data
	 */
	public ProfileData getData() {
		return data;
	}


	/**
	 * @param data the data to set
	 */
	public void setData(ProfileData data) {
		this.data = data;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Profile [status=" + status + ", version=" + version
				+ ", runtime=" + runtime + ", data=" + data + "]";
	}

}
