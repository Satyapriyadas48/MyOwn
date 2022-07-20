package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

@Entity
public class Actor {
	@Column(name="ACTOR_ID")
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)  //generator cfg
	private Integer aid;
	
	@Column(name="ACTOR_NAME",length = 20)
	@NonNull
	private String  aname;

	@Column(name="CATEGORY",length = 20)
	@NonNull
	private  String category;
	
	@Column(name="MOBILE_NUMBER")
	@NonNull
	private  Long mobileNo;

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Actor [aid=" + aid + ", aname=" + aname + ", category=" + category + ", mobileNo=" + mobileNo + "]";
	}

	public Actor(Integer aid, String aname, String category, Long mobileNo) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.category = category;
		this.mobileNo = mobileNo;
	}

	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
