package com.ty.vehicle;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vehicle
{
	@Id
	private int vid;
	private String vname;
	private String vcolor;
	private String vyear;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getVcolor() {
		return vcolor;
	}
	public void setVcolor(String vcolor) {
		this.vcolor = vcolor;
	}
	public String getVyear() {
		return vyear;
	}
	public void setVyear(String vyear) {
		this.vyear = vyear;
	}
	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", vname=" + vname + ", vcolor=" + vcolor + ", vyear=" + vyear + "]";
	}
	
	
}
