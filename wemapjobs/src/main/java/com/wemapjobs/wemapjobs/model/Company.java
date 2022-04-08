package com.wemapjobs.wemapjobs.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="company")
public class Company {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int companyId;
	
	@Column(name="companyname")
	public String name;
	
	@Column(name="phonenumber")
	public int phoneNumber;
	
	@Column(name="addresss")
	public String address;
	
	@Column(name="industry")
	public String industry;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "company")
	public List<Jobs> jobs;
	
	
    public Company() {}	

	public Company(int companyId, String name, int phoneNumber, String address, String industry) {
		super();
		this.companyId = companyId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.industry = industry;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}
	
	
	
	
	
	
}
