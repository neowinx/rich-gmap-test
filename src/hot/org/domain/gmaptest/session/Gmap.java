package org.domain.gmaptest.session;

import javax.persistence.Entity;

@Entity
public class Gmap {
	
	public float getLat() {
		return lat;
	}
	public void setLat(float lat) {
		this.lat = lat;
	}
	public float getLon() {
		return lon;
	}
	public void setLon(float lon) {
		this.lon = lon;
	}
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
	
	private float lat;
	private float lon;
	private String latStr;
	private String lonStr;

}
