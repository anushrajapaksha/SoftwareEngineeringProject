package com.wemapjobs.wemapjobs.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="jobs")
public class Jobs {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int jobid;
	
	@Column(name="userid")
	public int userId;
	
	@Column(name="title")
	public String title;
	
	@Column(name="description")
	public String description;
	
	@Column(name="location")
	public String location;
	
	@Column(name="phonenumber")
	public int phone;
	
	@Column(name="isactive")
	public boolean isActive;
	
	@ManyToOne
	public Jobcategory jobcategory;
	
	@ManyToOne
	public Company company;
	
	
	
	
	
	public Jobs() {}
	
	

	public Jobs(int jobid, int userId, String title, String description, String location, int phone, boolean isActive,
			Jobcategory jobcategory, Company company) {
		super();
		this.jobid = jobid;
		this.userId = userId;
		this.title = title;
		this.description = description;
		this.location = location;
		this.phone = phone;
		this.isActive = isActive;
		this.jobcategory = jobcategory;
		this.company = company;
	}

	public int getJobid() {
		return jobid;
	}

	public void setJobid(int jobid) {
		this.jobid = jobid;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Jobcategory getJobcategory() {
		return jobcategory;
	}

	public void setJobcategory(Jobcategory jobcategory) {
		this.jobcategory = jobcategory;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	

	
	
	
	
}
