package com.xboxleader.model;

public class Friend {
	private String status,version;
	private double runtime;


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
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}



	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}


	/**
	 * @return the runtime
	 */
	public double getRuntime() {
		return runtime;
	}


	/**
	 * @param runtime the runtime to set
	 */
	public void setRuntime(double runtime) {
		this.runtime = runtime;
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Friend [status=");
		builder.append(status);
		builder.append(", version=");
		builder.append(version);
		builder.append(", runtime=");
		builder.append(runtime);
		builder.append("]");
		return builder.toString();
	}

}//end Friend class
