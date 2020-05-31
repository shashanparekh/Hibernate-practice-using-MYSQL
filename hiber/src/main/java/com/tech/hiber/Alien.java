package com.tech.hiber;


import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Alien {
	@Id
	private int aid;
	private String aname;
	private String color;
	
	
	//Mapping relation and fetching configuration
//	@OneToMany(mappedBy = "alien",fetch = FetchType.EAGER)
//	private Collection<Laptop> laptop=new ArrayList<Laptop>();

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}
	

//	public Collection<Laptop> getLaptop() {
//		return laptop;
//	}
//
//	public void setLaptop(Collection<Laptop> laptop) {
//		this.laptop = laptop;
//	}
	
	
	
	
	
	
	

}
