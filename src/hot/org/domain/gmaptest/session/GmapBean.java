package org.domain.gmaptest.session;

import org.jboss.seam.annotations.Name;

@Name("gmapBean")
public class GmapBean {

	public String getLatStr() {
		return latStr;
	}
	public void setLatStr(String latStr) {
		this.latStr = latStr;
	}
	public String getLonStr() {
		return lonStr;
	}
	public void setLonStr(String lonStr) {
		this.lonStr = lonStr;
	}
	
	private String latStr;
	private String lonStr;
	
	public String probar() {
		return "hello";
	}
	
}
