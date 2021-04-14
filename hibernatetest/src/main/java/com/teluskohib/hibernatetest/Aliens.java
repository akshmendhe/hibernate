package com.teluskohib.hibernatetest;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aliens {
	
	@Id
	private int aid;
	
	private AlienName aname;
	
	private String acolor;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public AlienName getAname() {
		return aname;
	}
	public void setAname(AlienName aname) {
		this.aname = aname;
	}
	public String getAcolor() {
		return acolor;
	}
	public void setAcolor(String acolor) {
		this.acolor = acolor;
	}

	@Override
	public String toString() {
		return "Aliens [aid=" + aid + ", aname=" + aname + ", acolor=" + acolor + "]";
	}

}
